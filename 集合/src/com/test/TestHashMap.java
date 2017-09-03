package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Describe:http://www.cnblogs.com/chenssy/p/3521565.html
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * HashMap提供了三个构造函数：
 * <p>
 * HashMap()：构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap。
 * <p>
 * HashMap(int initialCapacity)：构造一个带指定初始容量和默认加载因子 (0.75) 的空 HashMap。
 * <p>
 * HashMap(int initialCapacity, float loadFactor)：构造一个带指定初始容量和加载因子的空 HashMap。
 * <p>
 * 在这里提到了两个参数：初始容量，加载因子。这两个参数是影响HashMap性能的重要参数，其中容量表示哈希表中桶的数量，初始容量是创建哈希表时的容量，加载因子是哈希表在其容量自动增加之前可以达到多满的一种尺度，它衡量的是一个散列表的空间的使用程度，负载因子越大表示散列表的装填程度越高，反之愈小。对于使用链表法的散列表来说，查找一个元素的平均时间是O(1+a)，因此如果负载因子越大，对空间的利用更充分，然而后果是查找效率的降低；如果负载因子太小，那么散列表的数据将过于稀疏，对空间造成严重浪费。系统默认负载因子为0.75，一般情况下我们是无需修改的。
 * <p>
 * HashMap是一种支持快速存取的数据结构，要了解它的性能必须要了解它的数据结构。
 * Author: lzl
 * <p>
 * Time: 2017/5/15 上午11:12
 */
public class TestHashMap {
    /**
     * Describe:
     * 运行结果是
     * 政治: 5
     * 生物: 7
     * 历史: 4
     * 数学: 2
     * 化学: 8
     * 语文: 1
     * 英语: 3
     * 地理: 6
     * <p>
     * <p>
     * Author: lzl
     * <p>
     * Time:
     */
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("语文", 1);
        map.put("数学", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
