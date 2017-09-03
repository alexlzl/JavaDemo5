package com.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Describe:HashSet的子类，也同样有HashCode值来决定元素位置。但是它使用链表维护元素的次序。记住两个字：有序。
 * <p>
 * 有序的妙用，复制。比如泥瓦匠实现一个HashSet无序添加，然后复制一个一样次序的HashSet来。代码如下：
 * <p>
 * 以元素插入的顺序来维护集合的链接表，允许以插入的顺序在集合中迭代
 * Author: lzl
 * <p>
 * Time: 2017/5/14 下午2:23
 */
public class TestLinkedHashSet {
    public static void main(String[] args) {
        /* 复制HashSet */
        Set h1 = new HashSet<String>();//散列法的机制来存储信息的，元素并没有以某种特定顺序来存放
        h1.add("List");
        h1.add("Queue");
        h1.add("Set");
        h1.add("Map");

        System.out.println("HashSet Elements:");
        System.out.print("\t" + h1 + "\n");

        Set h2 = copy(h1);
        System.out.println("HashSet Elements After Copy:");
        System.out.print("\t" + h2 + "\n");
        LinkedHashSet linkedHashSet = new LinkedHashSet<String>();//按元素插入的顺序来排序
        linkedHashSet.add("List");
        linkedHashSet.add("Queue");
        linkedHashSet.add("Set");
        linkedHashSet.add("Map");
        System.out.print("\t" + "LinkedHashSet" + linkedHashSet + "\n");
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static Set copy(Set set) {
        Set setCopy = new LinkedHashSet(set);
        return setCopy;
    }

}
