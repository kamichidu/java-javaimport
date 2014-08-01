package jp.michikusa.chitose.unitejavaimport.util;

public interface TaskWorker<T>
{
    void beginTask();

    void doTask(T o);

    void endTask();
}
