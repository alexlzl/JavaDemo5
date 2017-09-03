package com.test;


/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/10 下午2:19
 */
public class Person implements Comparable<Person> {
    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " - " + age;
    }

    /**
     * 比较两个Person是否相等：若它们的name和age都相等，则认为它们相等
     */
    boolean equals(Person person) {
        if (this.age == person.age && this.name == person.name)
            return true;
        return false;
    }


    /**
     * @desc 实现 “Comparable<String>” 的接口，即重写compareTo<T t>函数。
     * 这里是通过“person的名字”进行比较的
     */
    public int compareTo(Person person) {
        return name.compareTo(person.name);
        //return this.name - person.name;
    }
}
