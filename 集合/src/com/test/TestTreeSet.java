package com.test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Describe:Run一下,控制台输出如下：
 * <p>
 * ?
 * 1
 * 2
 * 3
 * 4
 * 5
 * Exception in thread "main" java.lang.ClassCastException: Bird cannot be cast to java.lang.Comparable
 * at java.util.TreeMap.compare(Unknown Source)
 * at java.util.TreeMap.put(Unknown Source)
 * at java.util.TreeSet.add(Unknown Source)
 * at com.sedion.bysocket.collection.TreeSetTest.main(TreeSetTest.java:29)
 * 答案很明显，TreeSet是排序的。所以Bird需要实现Comparable此接口。
 * <p>
 * java.lang.Comparable此接口强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。
 * <p>
 * <p>
 * 提供一个使用树结构存储Set接口的实现，对象以升序顺序存储，访问和遍历的时间很快。
 * <p>
 * <p>
 * TreeSet使用树结构实现（红黑树），集合中的元素进行排序，但是添加、删除和包含的算法复杂度为O（log（n））
 * Author: lzl
 * <p>
 * Time: 2017/5/14 下午1:12
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Bird> bSet = new TreeSet<Bird>();
        bSet.add(new Bird(1));
        bSet.add(new Bird(3));
        bSet.add(new Bird(2));

        Iterator<Bird> iter = bSet.iterator();

        while (iter.hasNext()) {
            Bird bird = (Bird) iter.next();
            System.out.println(bird);
        }
    }

}
