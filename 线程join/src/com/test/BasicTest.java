package com.test;

/**
 * Describe:join()throws InterruptedException;  //无参数的join()等价于join(0),作用是一直等待该线程死亡
 * <p>
 * join(long millis, int nanos) throws InterruptedException;  //最多等待该线程死亡millis毫秒
 * <p>
 * join(long millis, int nanos) throws InterruptedException ; //最多等待该线程死亡millis毫秒加nanos纳秒
 * <p>
 * <p>
 * <p>
 * 你是如何调用 wait（）方法的？使用 if 块还是循环？为什么？
 * wait() 方法应该在循环调用，因为当线程获取到 CPU 开始执行的时候，其他条件可能还没有满足，所以在处理前，循环检测条件是否满足会更好。下面是一段标准的使用 wait 和 notify 方法的代码：
 * <p>
 * // The standard idiom for using the wait method
 * synchronized (obj) {
 * while (condition does not hold)
 * obj.wait(); // (Releases lock, and reacquires on wakeup)
 * ... // Perform action appropriate to condition
 * }
 * <p>
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/6/6 上午9:39
 */
public class BasicTest {
    public static void main(String[] args) throws InterruptedException {
        //初始化
        RunnableJob runnableJob = new RunnableJob();
        Thread T1 = new Thread(runnableJob, "T1");
        Thread T2 = new Thread(runnableJob, "T2");
        Thread T3 = new Thread(runnableJob, "T3");
        /**
         * 如果不加join  执行顺序不固定 T2 start at Tue Jun 06 09:41:26 CST 2017
         T3 start at Tue Jun 06 09:41:26 CST 2017
         T1 start at Tue Jun 06 09:41:26 CST 2017
         T2 end at Tue Jun 06 09:41:27 CST 2017
         T3 end at Tue Jun 06 09:41:27 CST 2017
         T1 end at Tue Jun 06 09:41:27 CST 2017

         加入join执行顺序  T1 start at Tue Jun 06 10:00:35 CST 2017
         T1 end at Tue Jun 06 10:00:36 CST 2017
         T2 start at Tue Jun 06 10:00:36 CST 2017
         T2 end at Tue Jun 06 10:00:37 CST 2017
         T3 start at Tue Jun 06 10:00:37 CST 2017
         T3 end at Tue Jun 06 10:00:38 CST 2017

         */
        //T2在T1执行完后执行，T3在T2执行完后执行
        T1.start();
//        T1.join();
        T2.start();
//        T2.join();
        T3.start();
    }

}
