package com.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * Describe:HashSet: 2954271
 * TreeSet: 3029169
 * LinkedHashSet: 953525
 * <p>
 * 可见，TreeSet因为需要进行比较，所以性能比较差。
 * <p>
 * <p>
 * 总结
 * <p>
 * HashSet：equlas hashcode
 * <p>
 * LinkedHashSet：链式结构
 * <p>
 * TreeSet：比较，Comparable接口，性能较差
 *
 *
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/14 下午1:18
 */
public class Set性能比较 {

    public static void main(String[] args) {
        Random r = new Random();

        HashSet<Bird> hashSet = new HashSet<Bird>();
        TreeSet<Bird> treeSet = new TreeSet<Bird>();
        LinkedHashSet<Bird> linkedSet = new LinkedHashSet<Bird>();

        // start time
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            hashSet.add(new Bird(x));
        }
        // end time
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("HashSet: " + duration);

        // start time
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            treeSet.add(new Bird(x));
        }
        // end time
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("TreeSet: " + duration);

        // start time
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            linkedSet.add(new Bird(x));
        }
        // end time
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedHashSet: " + duration);
    }
}
