package com.test;

/**
 * Describe:构造器不能被继承，因此不能被重写，但可以被重载。
 * <p>
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/25 下午5:24
 */
public class Test extends Parent {
    Test(String s) {
        super(s);
    }

}
