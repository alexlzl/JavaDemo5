package com.test;

import java.util.HashSet;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/16 上午10:29
 */
public class V {
    int i;

    public V(int i) {
        this.i = i;
    }

    public int getI() {
        return this.i;
    }

    /**
     * Describe: hashcode相同才调用equals方法比较
     * <p>
     * Author: lzl
     * <p>
     * Time: 2017/5/16 上午10:30
     */
    public boolean equals(Object o) {
        V v = (V) o;
        System.out.print("hashcode相同的，然后才执行的equals()方法的!");
        System.out.println(v.getI() == this.i);
        return v.getI() == this.i;
    }

    //如果不重写，将会产生不同的hashcode,所以可以加进set里面
    public int hashCode() {
        System.out.println("先执行hashCode()方法的!");
        return i;
    }

    public static void main(String[] args) {
        HashSet set = new HashSet();
        for (int i = 0; i < 10; i++)
            set.add(new String("test"));//默认重写equals().hashcode()
        //产生相同的hashcode，而且equals返回true所以不加进去;
        System.out.println(set.size());
        set.clear();

        for (int i = 0; i < 10; i++) {
            set.add(new V(1));
        }
        System.out.println(set.size());
    }
}
