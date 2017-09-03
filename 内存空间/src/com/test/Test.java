package com.test;

/**
 * Describe:通常我们定义一个基本数据类型的变量，一个对象的引用，还有就是函数调用的现场保存都使用内存中的栈空间；而通过new关键字和构造器创建的对象放在堆空间；程序中的字面量（literal）如直接书写的100、”hello”和常量都是放在静态区中。栈空间操作起来最快但是栈很小，通常大量的对象都是放在堆空间，理论上整个内存没有被其他进程使用的空间甚至硬盘上的虚拟内存都可以被当成堆空间来使用。
 * <p>
 * <p>
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/25 下午3:42
 */
public class Test {
    /**
     * 上面的语句中变量str放在栈上，用new创建出来的字符串对象放在堆上，而”hello”这个字面量放在静态区。
     * <p>
     * 补充：较新版本的Java（从Java 6的某个更新开始）中使用了一项叫”逃逸分析”的技术，可以将一些局部对象放在栈上以提升对象的操作性能。
     *
     * @param strings
     */
    public void main(String[] strings) {
        String str = new String("hello");
    }
}
