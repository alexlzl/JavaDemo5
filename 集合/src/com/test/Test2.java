package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Describe:集合转换为数组操作
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/12 下午2:03
 */
public class Test2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestBean test = new TestBean(1);
        TestBean test1 = new TestBean(5);
        TestBean test2 = new TestBean(232);
        TestBean test3 = new TestBean(3);
        TestBean test4 = new TestBean(10);
        TestBean test5 = new TestBean(222);
        List<TestBean> t = new ArrayList<TestBean>();
        t.add(test);
        t.add(test1);
        t.add(test2);
        t.add(test3);
        t.add(test4);
        t.add(test5);
        List<Integer> testInteger = new ArrayList<>();
        testInteger.add(0);
        testInteger.add(1);
        testInteger.add(1);
        testInteger.add(2);
        testInteger.add(4);
        testInteger.add(1, -1);//位置会发生右移动
        System.out.println("集合数据" + testInteger.toString());
        //0，-1，1，1，2，4
        testInteger.set(1, 1000);
        //0, 1000, 1, 1, 2, 4//位置不会改变，替换制定位置

        System.out.println("最后出现1的位置" + testInteger.lastIndexOf(1));
        System.out.println("集合数据" + testInteger.toString());
        System.out.println("截取集合数据" + testInteger.subList(1,3).toString());//1000,1
        testInteger.remove(1);
        System.out.println("移除后的集合数据" + testInteger.toString());

        /**
         * 此处会报错：
         Exception in thread "main" Java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Lcom.Test;
         at com.Test2.main(Test2.java:31)
         其实就是Object 数组不能转对象数组。
         */
//        TestBean[] bb = (TestBean[]) t.toArray();

//        Arrays.sort(bb);
//        for (Object aaa : bb) {
//            TestBean ttt = (TestBean) aaa;
//            System.out.println(ttt.getId());
//        }
        /**
         * 使用集合迭代器============
         */
        Iterator<TestBean> iterator = t.iterator();
        while (iterator.hasNext()) {
            TestBean testBean = iterator.next();
            System.out.println("迭代器输出====" + testBean.getId());
        }


        //解决办法====在循环的时候强转对象
        if (t.isEmpty()) {
            return;
        }


        Object[] bb = t.toArray();

        Arrays.sort(bb);
        for (Object aaa : bb) {
            TestBean ttt = (TestBean) aaa;
            System.out.println(ttt.getId());
        }


        /**
         * 解决办法二
         */
        TestBean[] tt = t.toArray(new TestBean[0]);

        Arrays.sort(bb);
        for (TestBean aaa : tt) {
            System.out.println("====" + aaa.getId());
        }
    }
}
