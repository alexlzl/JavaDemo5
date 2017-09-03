package com.test;

import com.testone.Foo;

/**
 * Describe:修饰符	当前类	同 包	子 类	其他包
 * public	√	√	√	√
 * protected	√	√	√	×
 * default	√	√	×	×
 * private	√	×	×	×
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/25 上午10:08
 */
public class Test extends Foo {

    //    private float aFloat=2.1;//会报错，默认是双精度类型
    private float aFloat = 2.1f;

    public static void main(String[] strings) {

    }

    public void testt() {
        test1();
        test2();
        Foo foo = new Foo();
        foo.test2();
    }
}
