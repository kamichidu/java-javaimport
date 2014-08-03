package jp.michikusa.chitose.unitejavaimport.util;

public class AbstractTaskWorker<T> implements TaskWorker<T>
{
    @Override
    public void beginTask(){}

    @Override
    public void doTask(T o){}

    @Override
    public void endTask(){}
}
