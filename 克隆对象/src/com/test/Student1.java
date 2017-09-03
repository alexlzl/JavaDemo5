package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午4:56
 */
public class Student1 implements Cloneable {
    String name;// 常量对象。
    int age;
    Professor p;// 学生1和学生2的引用值都是一样的。
    Student1(String name,int age,Professor p)
    {
        this.name=name;
        this.age=age;
        this.p=p;
    }
    public Object clone()
    {
        Student1 o=null;
        try
        {
            o=(Student1)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e.toString());
        }
//        try {
//            o.p=(Professor)p.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
        return o;
    }
}
