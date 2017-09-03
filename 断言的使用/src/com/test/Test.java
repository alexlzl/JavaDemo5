package com.test;

/**
 * Describe:断言在软件开发中是一种常用的调试方式，很多开发语言中都支持这种机制。一般来说，断言用于保证程序最基本、关键的正确性。断言检查通常在开发和测试时开启。为了保证程序的执行效率，在软件发布后断言检查通常是关闭的。断言是一个包含布尔表达式的语句，在执行这个语句时假定该表达式为true；如果表达式的值为false，那么系统会报告一个AssertionError。断言的使用如下面的代码所示：
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/27 下午2:29
 */
public class Test {
    private static int a = -1;

    /**
     * 断言可以有两种形式：
     * assert Expression1;
     * assert Expression1 : Expression2 ;
     * Expression1 应该总是产生一个布尔值。
     * Expression2 可以是得出一个值的任意表达式；这个值用于生成显示更多调试信息的字符串消息。
     * <p>
     * 要在运行时启用断言，可以在启动JVM时使用-enableassertions或者-ea标记。要在运行时选择禁用断言，可以在启动JVM时使用-da或者-disableassertions标记。要在系统类中启用或禁用断言，可使用-esa或-dsa标记。还可以在包的基础上启用或者禁用断言。
     * <p>
     * 注意：断言不应该以任何方式改变程序的状态。简单的说，如果希望在不满足某些条件时阻止代码的执行，就可以考虑用断言来阻止它。
     *
     * @param strings
     */
    public static void main(String[] strings) {
        assert (a > 0);
        System.out.println("a>0执行断言");
    }
}
