package com.test;

/**
 * Describe:访问静态常量，如果编译器可以计算出常量的值，则不会加载类,例如:public static final int a =123;否则会加载类,例如:public static final int a = math.PI
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午2:12
 */
public class 类加载 {
    public static final int a = 123;
    public static final int a1 = get();
    static int i;

    static {
        System.out.print("加载类了static");
    }

    public 类加载() {
        System.out.print("加载类了");
    }

    public static int get() {

        return i;
    }
}
