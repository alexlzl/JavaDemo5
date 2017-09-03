package com.test;

/**
 * Describe:在这个例子中是个二重for循环，我们给外层循起始处加了标签（也就是说给外层循环起了个名字）“outerCycle”，在内层循环使用“continue outerCycle”时，就相当于在outerCycle这个循环中直接使用continue语句。
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/25 下午4:21
 */
public class LableTest {
    public static void main(String[] args) {
        outerCycle:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    System.out.println("j==5跳转到标签处继续执行");
                    continue outerCycle;
                }
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
