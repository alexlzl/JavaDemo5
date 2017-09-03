package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午5:08
 */
public class Professor1  implements Cloneable {
    String name;
    int age;
    Professor1(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public Object clone()
    {
        Object o=null;
        try
        {
            o=super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e.toString());
        }
        return o;
    }
}
