package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午5:07
 */
public class Student2  implements Cloneable  {
    String name;
    int age;
    Professor1 p;
    Student2(String name,int age,Professor1 p)
    {
        this.name=name;
        this.age=age;
        this.p=p;
    }
    public Object clone()
    {
        Student2 o=null;
        try
        {
            o=(Student2)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e.toString());
        }
        o.p=(Professor1)p.clone();
        return o;
    }
}
