package com.test;

import java.util.Date;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/6/6 上午9:40
 */
public class RunnableJob implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " start" + " at "
                + new Date());
        try {
            Thread.sleep(1000);
            System.out.println(thread.getName() + " end" + " at "
                    + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
