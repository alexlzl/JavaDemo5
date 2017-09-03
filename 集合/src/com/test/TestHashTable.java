package com.test;

import java.util.Hashtable;

/**
 * Describe:HashTable和HashMap存在很多的相同点，但是他们还是有几个比较重要的不同点。
 * <p>
 * 第一：我们从他们的定义就可以看出他们的不同，HashTable基于Dictionary类，而HashMap是基于AbstractMap。Dictionary是什么？它是任何可将键映射到相应值的类的抽象父类，而AbstractMap是基于Map接口的骨干实现，它以最大限度地减少实现此接口所需的工作。
 * <p>
 * 第二：HashMap可以允许存在一个为null的key和任意个为null的value，但是HashTable中的key和value都不允许为null。如下：
 * <p>
 * <p> 而当HashTable遇到null时，他会直接抛出NullPointerException异常信息。
 * <p>
 * <p>
 * 第三：Hashtable的方法是同步的，而HashMap的方法不是。所以有人一般都建议如果是涉及到多线程同步时采用HashTable，没有涉及就采用HashMap，但是在Collections类中存在一个静态方法：synchronizedMap()，该方法创建了一个线程安全的Map对象，并把它作为一个封装的对象来返回，所以通过Collections类的synchronizedMap方法是可以我们你同步访问潜在的HashMap。
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/16 下午1:37
 */
public class TestHashTable {
    /**
     * Describe: ConcurrentHashMap和Hashtable的区别
     * <p>
     * Hashtable和ConcurrentHashMap有什么分别呢？它们都可以用于多线程的环境，但是当Hashtable的大小增加到一定的时候，性能会急剧下降，因为迭代时需要被锁定很长的时间。因为ConcurrentHashMap引入了分割(segmentation)，不论它变得多么大，仅仅需要锁定map的某个部分，而其它的线程不需要等到迭代完成才能访问map。简而言之，在迭代的过程中，ConcurrentHashMap仅仅锁定map的某个部分，而Hashtable则会锁定整个map。
     * <p>
     * Author: lzl
     * <p>
     * Time: 2017/5/19 下午5:56
     */
    private static Hashtable hashtable;

    public static void main(String[] args) {
        hashtable = new Hashtable();
//        hashtable.put(null,null);

    }
}
