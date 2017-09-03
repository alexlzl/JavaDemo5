package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/26 下午2:48
 */
public abstract class Test {
    //非法，抽象方法不能为静态
//    public static  abstract void test();
    public abstract void test1();

    public synchronized static void test() {
//         foo();//非法
    }


    public void foo() {

    }
}
