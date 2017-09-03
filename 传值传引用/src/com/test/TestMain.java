package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/25 下午5:43
 */
public class TestMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        add(list);
        for (Integer j : list) {
            System.err.print(j + ",");
            ;
        }//0-10,100
        System.err.println("");
        System.err.println("*********************");
        String a = "A";
        append(a);//string类型是不可变的，一旦进行运算产生新对象
        System.err.println(a);//A
        int num = 5;
        addNum(num);//传递值
        System.err.println(num);//5

        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println("Before change, sb = " + sb);
        changeData(sb);
        System.out.println("After changeData(n), sb = " + sb);
    }

    static void add(List<Integer> list) {
        list.add(100);
    }

    static void append(String str) {
        str += "is a";
    }

    static void addNum(int a) {
        a = a + 10;
    }

    public static void changeData(StringBuffer strBuf) {
        strBuf.append("World!");
    }
}
