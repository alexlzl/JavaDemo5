package com.test;

/**
 * Describe:在Java中对象作为参数传递时，是把对象在内存中的地址拷贝了一份传给了参数。
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/26 上午10:33
 */
public class 对象传递参数2 {

    /**
     * Before change, sb = Hello
     * After changeData(n), sb = Hello
     *
     * @param args
     */

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println("Before change, sb = " + sb);
        changeData(sb);
        System.out.println("After changeData(n), sb = " + sb);
    }

    public static void changeData(StringBuffer strBuf) {
        strBuf = new StringBuffer("Hi ");
        strBuf.append("World!");
    }

}
