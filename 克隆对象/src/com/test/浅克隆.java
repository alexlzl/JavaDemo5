package com.test;

/**
 * Describe:1．浅复制与深复制概念
 ⑴浅复制（浅克隆）
 被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来的对象。换言之，浅复制仅仅复制所考虑的对象，而不

 复制它所引用的对象。

 ⑵深复制（深克隆）
 被复制对象的所有变量都含有与原来的对象相同的值，除去那些引用其他对象的变量。那些引用其他对象的变量将指向被复制过的新对象，而不再是原

 有的那些被引用的对象。换言之，深复制把要复制的对象所引用的对象都复制了一遍。
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午3:43
 */
public class 浅克隆 {

    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = (Student) s1.clone();
        s2.name = "lisi";
        s2.age = 20;
        System.out.println("name=" + s1.name + "," + "age=" + s1.age);//修改学生2后，不影响学生1的值。

    }

}
