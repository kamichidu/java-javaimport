package jp.michikusa.chitose.unitejavaimport.util;

public interface WorkerSupport<T>
{
    void addWorker(TaskWorker<? super T> worker);

    void removeWorker(TaskWorker<? super T> worker);
}
