package com.test;

/**
 * 第一种方法
 * 在CMD窗口中使用java -version 命令进行查看
 * 如果是64位的则会显示 Java HotSpot<TM>64-Bit 字样，32位的则没有类似信息。
 * 注：这是Sun的JDK，其它版本的JDK不知道输出会是什么样子的
 * <p>
 * 第二种方法
 * <p>
 * String arch = System.getProperty("sun.arch.data.model");
 * <p>
 * System.out.println(arch);
 * <p>
 * 使用如上代码即可输出是32位还是64位的；
 * 第三种方法
 * 在CMD窗口中运行 java -Xms4095M -Xmx4096M -version
 * 如果报错：Invalid  maximum heap size: -Xmx4096M …… 则说明是32位的，64位的可以正常执行
 * 如何判断JDK是32位还是64位
 * <p>
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/23 下午6:01
 */
public class Test {
    public static void main(String[] args) {
        String jdkBit = System.getProperty("sun.arch.data.model");
        System.out.println(jdkBit);
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
    }
}
