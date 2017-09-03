package com.test;

import java.io.*;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午6:10
 */
public class Student3 {
    String name;//常量对象
    int age;
    Teacher t;//学生1和学生2的引用值都是一样的。
    Student3(String name,int age,Teacher t){
        this.name=name;
        this.age=age;
        this.t=t;
    }
    public Object deepClone() throws IOException,
            OptionalDataException,ClassNotFoundException{//将对象写到流里
        ByteArrayOutputStream bo=new ByteArrayOutputStream();
        ObjectOutputStream oo=new ObjectOutputStream(bo);
        oo.writeObject(this);//从流里读出来
        ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi=new ObjectInputStream(bi);
        return(oi.readObject());
    }
}
