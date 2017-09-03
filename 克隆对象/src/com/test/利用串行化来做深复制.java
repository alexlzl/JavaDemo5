package com.test;

import java.io.*;

/**
 * Describe:把对象写到流里的过程是串行化（Serilization）过程，但是在Java程序师圈子里又非常形象地称为“冷冻”或者“腌咸菜（picking）”过程；而把对象从流中读出来的并行化（Deserialization）过程则叫做 “解冻”或者“回鲜(depicking)”过程。

 应当指出的是，写在流里的是对象的一个拷贝，而原对象仍然存在于JVM里面，因此“腌成咸菜”的只是对象的一个拷贝，Java咸菜还可以回鲜。
 在Java语言里深复制一个对象，常常可以先使对象实现Serializable接口，然后把对象（实际上只是对象的一个拷贝）写到一个流里（腌成咸菜），再从流里读出来（把咸菜回鲜），便可以重建对象。
 如下为深复制源代码。

 这样做的前提是对象以及对象内部所有引用到的对象都是可串行化的，否则，就需要仔细考察那些不可串行化的对象可否设成transient，从而将之排除在复制过程之外。
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午6:02
 */
public class 利用串行化来做深复制 {

    public static void main(String[] arg){
        Teacher t=new Teacher("tangliang",30);
        Student3 s1=new Student3("zhangsan",18,t);
        Student3 s2= null;
        try {
            s2 = (Student3)s1.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        s2.t.name="tony";
        s2.t.age=40;
        System.out.println("name="+s1.t.name+","+"age="+s1.t.age);//学生1的老师不改变
    }

    public Object deepClone()
    {
//将对象写到流里
        ByteArrayOutputStream bo=new ByteArrayOutputStream();
        ObjectOutputStream oo= null;
        try {
            oo = new ObjectOutputStream(bo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oo.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
//从流里读出来
        ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi= null;
        try {
            oi = new ObjectInputStream(bi);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return(oi.readObject());
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}
