package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Describe:类ExampleA继承Exception，类ExampleB继承ExampleA。
 * 有如下代码片断：
 * <p>
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * try {
 * throw new ExampleB("b")
 * } catch（ExampleA e）{
 * System.out.println("ExampleA");
 * } catch（Exception e）{
 * System.out.println("Exception");
 * }
 * 请问执行此段代码的输出是什么？
 * 答：输出：ExampleA。（根据里氏代换原则[能使用父类型的地方一定能使用子类型]，抓取ExampleA类型异常的catch块能够抓住try块中抛出的ExampleB类型的异常）
 * <p>
 * <p>
 * 答：输出：ExampleA。（根据里氏代换原则[能使用父类型的地方一定能使用子类型]，抓取ExampleA类型异常的catch块能够抓住try块中抛出的ExampleB类型的异常）
 * <p>
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/27 下午4:43
 */
public class Test {
    public static void main(String[] strings) {

        System.out.println(test());

    }

    public static String test() {
        try {
//            System.exit(0);

            System.out.println("======");
            return "test";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("====catch");
        } finally {
            System.out.println("主线程结束.");

        }
        return "last";
    }
}
