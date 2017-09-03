package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/26 上午11:16
 */
public class 对象传递参数3 {

    public static void main(String[] strings) {
        String  s="abcd";
        change(s);
        System.out.println(s);
    }

    public static void change(String s) {
        String string=s+"efg";
        System.out.println(string);
    }
}
