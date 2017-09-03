package com.test;

import java.util.HashSet;

/**
 * Describe:一个按着Hash算法来存储集合中的元素，其元素值可以是NULL。它不能保证元素的排列顺序。同样，HashSet是不同步的，如果需要多线程访问它的话，可以用 Collections.synchronizedSet 方法来包装它：
 * <p>
 * Set s = Collections.synchronizedSet(new HashSet(...));
 * 同上一节一样，用迭代器的时候，也要注意 并发修改异常ConcurrentModificationException。
 * <p>
 * <p>要注意的地方是，HashSet集合判断两个元素相等不单单是equals方法，并且必须hashCode()方法返回值也要相等。看下面的例子：
 * <p>
 * <p>
 * 哈希表是通过使用称为散列法的机制来存储信息的，元素并没有以某种特定顺序来存放；
 * Author: lzl
 * <p>
 * Time: 2017/5/14 下午1:21
 */
public class TestHashSet {

    /**
     * Describe: HashSetObj 类满足我们刚刚的要求，所以集合中只有一个且它的HashCode值为2。
     * <p>
     * HashCodeObj 类虽然它们HashCode值为1，但是他们不相等。（其实当HashCode值一样，这个存储位置会采用链式结构保存两个HashCodeObj对象。）
     * <p>
     * 同样,EqualsObj 类他们相等，但是他们HashCode值不等，分别为1471cb25、3acff49f。
     * <p>
     * <p>
     * <p>
     * 因此，用HashSet添加可变对象，要注意当对象有可能修改后和其他对象矛盾，这样我们无法从HashSet找到准确我们需要的对象。
     * <p>
     * Author: lzl
     * <p>
     * Time:
     */
    public static void main(String[] args) {
        HashSet objs = new HashSet();
        objs.add(new EuqalsObj());
        objs.add(new EuqalsObj());
        objs.add(new HashCodeObj());
        objs.add(new HashCodeObj());
        objs.add(new HashSetObj());
        objs.add(new HashSetObj());

        System.out.println("HashSet Elements:");
        System.out.print("\t" + objs + "\n");
    }

    static class EuqalsObj {
        public boolean equals(Object obj) {
            return true;
        }
    }

    static class HashCodeObj {
        public int hashCode() {
            return 1;
        }
    }

    static class HashSetObj {
        public int hashCode() {
            return 2;
        }

        public boolean equals(Object obj) {
            return true;
        }
    }
}
