package com.test;

import java.util.Arrays;

/**
 * Describe:如果相同的对象有不同的hashCode，对哈希表的操作会出现意想不到的结果（期待的get方法返回null），要避免这种问题，只需要牢记一条：要同时复写equals方法和hashCode方法，而不要只写其中一个。
 * <p>
 * 同时复写equals方法和hashCode方法,必须保证“相等的对象必须具有相等的哈希码”，也就是当两个对象通过equals()比较的结果为true时，这两个对象调用hashCode（）方法生成的哈希码必须相等。
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/8 下午2:58
 */
public class 对象比较 implements Cloneable {
    static String[] strings = new String[9];
    static String[] strings1 = strings;
    static float f1 = 10.0f;
    static float f2 = 10.0f;
    Unit unit = new Unit();

    private void test() {
        try {
            strings.wait();
            strings.getClass();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Describe: [Ljava.lang.String;@6e0be858
     * 1846274136
     * 1846274136
     * true
     * <p>
     * Author: lzl
     * <p>
     * Time:
     */
    public static void main(String[] args) {
        System.out.println(strings.toString());
        System.out.println(strings.hashCode());
        System.out.println(strings1.hashCode());
        System.out.println(strings1.equals(strings) + "===" + Arrays.equals(strings, strings1));
        System.out.println(f1 == f2);
//        System.out.println("====="+类加载.a);
        System.out.println("====="+类加载.a1);
    }

    /**
     * Describe: 需要注意的是当equals()方法被override时，hashCode()也要被override。按照一般hashCode()方法的实现来说，相等的对象，它们的hash code一定相等。
     * <p>
     * Author: lzl
     * <p>
     * Time:
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Describe: 3.当改写equals()的时候，总是要改写hashCode()
     * 根据一个类的equals方法（改写后），两个截然不同的实例有可能在逻辑上是相等的，但是，根据Object.hashCode方法，它们仅仅是两个对象。因此，违反了“相等的对象必须具有相等的散列码”。
     * <p>
     * <p>
     * <p>
     * <p>
     * equals 默认比较内存地址，如果重写两个不同的实例可能出现相等，然而相等的对象必须具备相同的hashcode值，所以需要重写hashcode方法
     * Author: lzl
     * <p>
     * Time:
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public 对象比较 clone() throws CloneNotSupportedException {
        return (对象比较) super.clone();
    }
}
