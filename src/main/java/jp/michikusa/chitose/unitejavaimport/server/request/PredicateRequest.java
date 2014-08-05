package jp.michikusa.chitose.unitejavaimport.server.request;

import static com.google.common.base.Predicates.alwaysFalse;
import static com.google.common.base.Predicates.alwaysTrue;
import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.not;
import static com.google.common.base.Predicates.or;
import static com.google.common.collect.Iterables.isEmpty;
import static java.util.Collections.emptyMap;

import java.util.Map;
import java.util.regex.Pattern;

import jp.michikusa.chitose.unitejavaimport.predicate.IsFinal;
import jp.michikusa.chitose.unitejavaimport.predicate.IsPackagePrivate;
import jp.michikusa.chitose.unitejavaimport.predicate.IsPrivate;
import jp.michikusa.chitose.unitejavaimport.predicate.IsProtected;
import jp.michikusa.chitose.unitejavaimport.predicate.IsPublic;
import jp.michikusa.chitose.unitejavaimport.predicate.IsStatic;
import jp.michikusa.chitose.unitejavaimport.predicate.RegexMatch;
import lombok.Getter;

import org.apache.bcel.classfile.AccessFlags;
import org.apache.bcel.classfile.JavaClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class PredicateRequest
{
    public PredicateRequest(CommonRequest source)
    {
        final Map<String, Object> predicate;
        if(source.original.containsKey("predicate"))
        {
            @SuppressWarnings("unchecked")
            final Map<String, Object> tmp= (Map<String, Object>)source.original.get("predicate");
            predicate= tmp;
        }
        else
        {
            predicate= emptyMap();
        }

        this.classnamePredicate= makeClassnamePredicate(predicate);
        this.modifierPredicate= makeModifierPredicate(predicate);
        this.packagePredicate= makePackagePredicate(predicate);
    }

    private static Predicate<JavaClass> makeClassnamePredicate(Map<? super String, ? extends Object> m)
    {
        if( !m.containsKey("classname"))
        {
            return alwaysTrue();
        }

        @SuppressWarnings("unchecked")
        final Map<String, String> regex= (Map<String, String>)m.get("classname");

        return makeRegex(regex, new Function<JavaClass, String>(){
            @Override
            public String apply(JavaClass input)
            {
                return input.getClassName().replace('$', '.');
            }
        });
    }

    private static Predicate<AccessFlags> makeModifierPredicate(Map<? super String, ? extends Object> m)
    {
        if( !m.containsKey("modifiers"))
        {
            return alwaysTrue();
        }

        @SuppressWarnings("unchecked")
        final Iterable<String> modifiers= (Iterable<String>)m.get("modifiers");

        if(isEmpty(modifiers))
        {
            return alwaysFalse();
        }

        Predicate<AccessFlags> predicate= alwaysTrue();

        for(final String modifier : modifiers)
        {
            switch(modifier)
            {
                case "public":
                    predicate= and(predicate, new IsPublic());
                    break;
                case "protected":
                    predicate= and(predicate, new IsProtected());
                    break;
                case "static":
                    predicate= and(predicate, new IsStatic());
                    break;
                case "private":
                    predicate= and(predicate, new IsPrivate());
                    break;
                case "package private":
                    predicate= and(predicate, new IsPackagePrivate());
                    break;
                case "final":
                    predicate= and(predicate, new IsFinal());
                    break;
                default:
                    logger.warn("Unknown modifier `{}' detected, ignoring.", modifier);
                    break;
            }
        }

        return predicate;
    }

    private static Predicate<String> makePackagePredicate(Map<? super String, ? extends Object> m)
    {
        Predicate<String> include= alwaysFalse();
        Predicate<String> exclude= alwaysFalse();

        if(m.containsKey("include_packages"))
        {
            @SuppressWarnings("unchecked")
            final Iterable<String> pkgs= (Iterable<String>)m.get("include_packages");

            for(final String pkg : pkgs)
            {
                logger.info("will include package {}", pkg);
                include= or(include, new Predicate<String>(){
                    @Override
                    public boolean apply(String input)
                    {
                        return input.startsWith(pkg);
                    }
                });
            }
        }
        if(m.containsKey("exclude_packages"))
        {
            @SuppressWarnings("unchecked")
            final Iterable<String> pkgs= (Iterable<String>)m.get("exclude_packages");

            for(final String pkg : pkgs)
            {
                logger.info("will exclude package {}", pkg);
                exclude= and(exclude, not(new Predicate<String>(){
                    @Override
                    public boolean apply(String input)
                    {
                        return input.startsWith(pkg);
                    }
                }));
            }
        }

        return or(include, exclude);
    }

    private static <E>Predicate<E> makeRegex(Map<? super String, ? extends String> regex, Function<E, ? extends String> stringify)
    {
        final String pattern= regex.get("regex");
        final String type= regex.containsKey("type") ? regex.get("type") : "inclusive";

        switch(type)
        {
            case "inclusive":
                return new RegexMatch<E>(Pattern.compile(pattern), stringify);
            case "exclusive":
                return not(new RegexMatch<E>(Pattern.compile(pattern), stringify));
            default:
                throw new IllegalArgumentException("Malformed Regex Object");
        }
    }

    private static final Logger logger= LoggerFactory.getLogger(PredicateRequest.class);

    @Getter
    private final Predicate<JavaClass> classnamePredicate;

    @Getter
    private final Predicate<AccessFlags> modifierPredicate;

    @Getter
    private final Predicate<String> packagePredicate;
}
