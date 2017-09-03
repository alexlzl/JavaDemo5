package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午3:46
 */
public class 深度克隆 {

    public static void main(String[] args)
    {
        Professor1 p=new Professor1("wangwu",50);
        Student2 s1=new Student2("zhangsan",18,p);
        Student2 s2=(Student2)s1.clone();
        s2.p.name="lisi";
        s2.p.age=30;
        System.out.println("name="+s1.p.name+","+"age="+s1.p.age);//学生1的教授不 改变。
    }
}
