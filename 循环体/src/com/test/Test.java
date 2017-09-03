package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/25 下午4:31
 */
public class Test {
    public static void main(String args[]) {
        Test test = new Test();
        test.testBreak1();

        test.testContinue1();

        test.testBreak2();
        test.testContinue2();
    }

    /**
     * 测试continue
     * continue用来结束本次循环
     */
    public void testContinue1() {
        System.out.println("--------测试continue-------");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("i=3结束本次循环");
                continue;
            }
            System.out.println("i=" + i);
        }
    }

    /**
     * break用来结束整个循环体
     */
    public void testBreak1() {
        System.out.println("--------测试break1-------");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("i=3执行break跳出循环体");
                break;
            }

            System.out.println("i=" + i);
        }
    }

    /**
     * 测试带标签的break语句
     * 标签只能写在循环体之前，顺便学习一下java中语句标签的定义和使用
     */
    public void testBreak2() {
        System.out.println("--------测试break2-------");
        int i = 1;
        int k = 4;
        lable1:
        for (; i <= 5; i++, k--) {
            if (k == 0) break lable1;
            System.out.println("i=" + i + " ; k=" + k);
        }
    }

    public void testContinue2() {
        System.out.println("--------测试continue2-------");
        lable1:
        for (int i = 1; i < 10; i++) {
            lable2:
            System.out.println("i=" + i);
            for (int j = 0; j < 10; j++) {
                if (j == 9) continue lable1;
            }
        }
    }
}
