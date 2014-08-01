package jp.michikusa.chitose.unitejavaimport.util;

import com.google.common.collect.ImmutableList;

public final class AggregateWorkerSupport<T> implements TaskWorker<T>, WorkerSupport<T>
{
    @Override
    public void beginTask()
    {
        final ImmutableList<TaskWorker<? super T>> workers= this.workers;

        for(final TaskWorker<?> worker : workers)
        {
            worker.beginTask();
        }
    }

    @Override
    public void doTask(T o)
    {
        final ImmutableList<TaskWorker<? super T>> workers= this.workers;

        for(final TaskWorker<? super T> worker : workers)
        {
            worker.doTask(o);
        }
    }

    @Override
    public void endTask()
    {
        final ImmutableList<TaskWorker<? super T>> workers= this.workers;

        for(final TaskWorker<?> worker : workers)
        {
            worker.endTask();
        }
    }

    @Override
    public void addWorker(TaskWorker<? super T> worker)
    {
        final ImmutableList<TaskWorker<? super T>> workers= this.workers;
        this.workers= ImmutableList.<TaskWorker<? super T>>builder() //
                .addAll(workers) //
                .add(worker) //
                .build() //
        ;
    }

    @Override
    public void removeWorker(TaskWorker<? super T> worker)
    {
        final ImmutableList<TaskWorker<? super T>> workers= this.workers;
        final ImmutableList.Builder<TaskWorker<? super T>> builder= ImmutableList.builder();

        for(final TaskWorker<? super T> e : workers)
        {
            if(e != worker)
            {
                builder.add(e);
            }
        }

        this.workers= builder.build();
    }

    private ImmutableList<TaskWorker<? super T>> workers= ImmutableList.of();
}
