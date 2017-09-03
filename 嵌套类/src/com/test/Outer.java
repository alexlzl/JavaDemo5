package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/26 下午2:14
 */
public class Outer {
    private static String test = "test";

    static class Inner {
        public void test() {
            System.out.println(test);
        }
    }

    class InnerOne {

    }

    public static void foo() {
        new Inner();
    }

    public void bar() {
        new Inner();
    }

    public void test() {
        InnerOne innerOne = new InnerOne();
    }

//    public static void main(String[] args) {
//        new Inner();
//    }
}
