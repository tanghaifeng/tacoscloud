package com.tacoscloud.tacos.thread;

import java.util.concurrent.*;

public class ThreadPoolManager<T> {

    private static final int CPU_COUNT  = Runtime.getRuntime().availableProcessors();

    // 核心线程数量
    private static final int CORE_POOL_SIZE = CPU_COUNT + 1;

    // 线程池最大的数量
    private static final int MAXIMUM_POOL_SIZE  = CPU_COUNT *2 + 1;

    // 非核心线程空闲超时时长
    private static final int KEEP_ALIVE  = 1;

    private ThreadPoolManager threadPoolManager;

    private ThreadPoolExecutor executor;

    private ThreadPoolManager() {

    }
    public synchronized ThreadPoolManager getInstance() {
        if(threadPoolManager == null) {
            threadPoolManager = new ThreadPoolManager();
        }
        return threadPoolManager;
    }

    /**
     * 开启一个没有返回的线程
     * @param r
     */
    public void execute(Runnable r) {
        if (executor == null) {

            executor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, KEEP_ALIVE, TimeUnit.SECONDS,
                       new ArrayBlockingQueue<Runnable>(20), Executors.defaultThreadFactory(),
                       new ThreadPoolExecutor.AbortPolicy());

        }
        executor.execute(r);
    }

    /**
     * 开启一个没有返回的线程
     * @param callable
     */
    public Future<T> submit(Callable<T> callable) {
        if (executor == null) {

            executor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, KEEP_ALIVE, TimeUnit.SECONDS,
                    new ArrayBlockingQueue<Runnable>(20), Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());

        }
        return executor.submit(callable);
    }

    /**
     * 把任务在等待队列中移除
     * @param r
     */
    public void cancel(Runnable r) {
        if (r != null) {
            executor.getQueue().remove(r);
        }
    }

    /**
     * 获取等待队列的大小
     * @return
     */
    public int getQueueSize() {
        return executor.getQueue().size();
    }

    /**
     * 获取已完成的任务数量
     * @return
     */
    public long getCompletedTaskCount() {
        return executor.getCompletedTaskCount();
    }

    /**
     * 关闭线程池，不接受新任务，会把已经存在队列中的任务执行完
     */
    public void shutdown() {
        executor.shutdown();
    }

    /**
     * 判断是不是最后一个任务
     * @return
     */
    public boolean isTaskEnd() {
        if (executor.getActiveCount() == 0) {
            return true;
        }
        return false;
    }

}
