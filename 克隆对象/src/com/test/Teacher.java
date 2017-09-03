package com.test;

import java.io.Serializable;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午6:09
 */
class Teacher implements Serializable {
    String name;
    int age;
    Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }
}


class Test{

}