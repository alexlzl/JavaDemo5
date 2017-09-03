package com.test;

/**
 * Describe:说明：
 ①为什么我们在派生类中覆盖Object的clone()方法时，一定要调用super.clone()呢？在运行时 刻，Object中的clone()识别出你要复制的是哪一个对象，然后为此对象分配空间，并进行对象的复制，将原始对象的内容一一复制到新对象的存储空 间中。
 ②继承自java.lang.Object类的clone()方法是浅复制。以下代码可以证明之。


 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午4:50
 */
public class Student implements Cloneable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() {
        Object o = null;
        try {
            o = (Student) super.clone();//Object 中的clone()识别出你要复制的是哪一个对象。
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }
}
