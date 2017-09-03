package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/26 上午10:26
 */
public class 对象传递参数1 {

    /**
     * Before change, sb = Hello
     * After changeData(n), sb = Hello World!
     *
     * @param args
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println("Before change, sb = " + sb);//Hello
        changeData(sb);
        System.out.println("After changeData(n), sb = " + sb);//Hello World!
    }

    public static void changeData(StringBuffer strBuf) {
        strBuf.append("World!");
    }
}
