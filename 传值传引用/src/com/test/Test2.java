package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/26 上午10:13
 */
public class Test2 {

    public static void main(String[] strings) {
        Child child = new Child();
        change(child);
        System.out.println(child.test);//newtest
    }


    public static void change(Child child) {
        child.test = "newtest";

    }

    public static class Child {
        public String test = "test";


    }
}
