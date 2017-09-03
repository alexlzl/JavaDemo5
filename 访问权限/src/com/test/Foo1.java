package com.test;

/**
 * Describe:修饰符	当前类	同 包	子 类	其他包
 * public	√	√	√	√
 * protected	√	√	√	×
 * default	√	√	×	×
 * private	√	×	×	×
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/25 上午10:09
 */
public class Foo1 {

    String test = "test";

    private void test() {
        System.out.println("test");
    }

    protected void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }
}
