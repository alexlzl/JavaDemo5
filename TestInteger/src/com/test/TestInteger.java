package com.test;

import java.lang.reflect.Field;

/**
 * Describe:奇怪的Java题：为什么1000 == 1000返回为False，而100 == 100会返回为True?
 * <p>
 * http://www.importnew.com/22386.html
 * Author: lzl
 * <p>
 * Time: 2017/5/19 下午6:16
 */
public class TestInteger {
    /**
     * Describe: 我们知道，如果两个引用指向同一个对象，那么==就成立；反之，如果两个引用指向的不是同一个对象，那么==就不成立，即便两个引用的内容是一样的。因此，结果就会出现false。
     * <p>
     * 这是非常有趣的地方。如果你查看Integer.java类，你会找到IntegerCache.java这个内部私有类，它为-128到127之间的所有整数对象提供缓存。
     * <p>
     * 这个东西为那些数值比较小的整数提供内部缓存，当进行如此声明时：
     * <p>
     * Integer c = 100;
     * <p>
     * 如果值在-128到127之间，它就会返回该缓存的实例。
     * <p>
     * <p>
     * 1
     * Integer c = 100, d = 100;
     * 两者指向同样的对象。
     * <p>
     * 现在你可能会问，为什么会为-128到127之间的所有整数设置缓存？
     * <p>
     * 这是因为在这个范围内的小数值整数在日常生活中的使用频率要比其它的大得多，多次使用相同的底层对象这一特性可以通过该设置进行有效的内存优化。你可以使用reflection API任意使用这个功能。
     * Author: lzl
     * <p>
     * Time: 2017/5/19 下午6:21
     */
    public static void main(String[] args) {
        Integer aa = 1000, bb = 1000;
        System.out.println(aa == bb);//1
        Integer c = 100, d = 100;
        System.out.println(c == d);//2

        /**
         *
         */
        Class cache = Integer.class.getDeclaredClasses()[0]; //1
        Field myCache = null; //2
        try {
            myCache = cache.getDeclaredField("cache");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        myCache.setAccessible(true);//3

        Integer[] newCache = new Integer[0]; //4
        try {
            newCache = (Integer[]) myCache.get(cache);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        newCache[132] = newCache[133]; //5

        int a = 2;
        int b = a + a;
        System.out.printf("%d + %d = %d", a, a, b); //
    }
}
