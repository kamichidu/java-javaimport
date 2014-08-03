Protocol
====================================================================================================
The request:

```json:common request
{
    "command": "packages" or "classes" or "fields" or "methods",
    "classpath": ["path/to/jar"],
    "identifier": "",
}
```

```json:special parameters for classes request
{
    "predicate": {
        "classname": regex object,
        "modifiers": ["public" or else],
        "include_packages": ["package name"],
        "exclude_packages": ["package name"],
    },
}
```

```json:special parameters for fields or methods request
{
    "predicate": {
        "classname": regex object,
        "fieldname" or "methodname": regex object,
        "modifiers": ["public" or else],
        "include_packages": ["package name"],
        "exclude_packages": ["package name"],
    },
}
```

The response:

```json:common response
{
    "identifier": "",
    "result": ?,
    "status": "finish" or "processing" or "error"
    "error": "description",
}
```

```json:classes response
{
    result: [
        {
            "classname": "",
            "jar": "path/to/jar",
        },
    ]
}
```

The regex object
```json:regex object
{
    "regex": "",
    "type":  "inclusive" or "exclusive",
}
```
