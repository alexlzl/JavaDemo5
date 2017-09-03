package com.test;

/**
 * Describe:基本类型作为参数传递时，是传递值的拷贝，无论你怎么改变这个拷贝，原值是不会改变的，输出的结果证明了这一点：
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/26 上午10:21
 */
public class 基本类型传参 {
    /**
     * Before change, n = 3
     * After changeData(n), n = 3
     *
     * @param args
     */
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Before change, n = " + n);//3
        changeData(n);
        System.out.println("After changeData(n), n = " + n);//3
    }

    public static void changeData(int n) {
        n = 10;
    }
}
