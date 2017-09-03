package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午4:59
 */
public class 浅克隆1 {
    public static void main(String[] args) {
        Professor p=new Professor("wangwu",50);
        Student1 s1=new Student1("zhangsan",18,p);
        Student1 s2=(Student1)s1.clone();
        s2.p.name="lisi";
        s2.p.age=30;
        System.out.println("name="+s1.p.name+","+"age="+s1.p.age);//学生1的教授成为lisi,age为30。

    }
}
