package com.test;

/**
 * Describe:Static Nested Class是被声明为静态（static）的内部类，它可以不依赖于外部类实例被实例化。而通常的内部类需要在外部类实例化后才能实例化
 * <p>
 * <p>
 * Java中非静态内部类对象的创建要依赖其外部类对象，上面的面试题中foo和main方法都是静态方法，静态方法中没有this，也就是说没有所谓的外部类对象，因此无法创建内部类对象，如果要在静态方法中创建内部类对象，可以这样做：
 * <p>
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/26 下午2:16
 */
public class Test {

    public static void main(String[] strings) {
        Outer outer = new Outer();
        Outer.InnerOne innerOne = outer.new InnerOne();
//        Outer.InnerOne innerOne=new Outer.InnerOne();
        Outer.Inner inner = new Outer.Inner();
    }
}
