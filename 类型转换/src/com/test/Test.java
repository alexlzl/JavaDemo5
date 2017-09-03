package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/23 下午3:01
 */
public class Test {

    public static void main(String[] strings) {
        /**
         * java.lang.ClassCastException: com.test.Parent cannot be cast to com.test.Child
         * 会转换异常
         *
         *申明类型，实际类型的转换
         * Author: lzl
         *
         * Time: 2017/5/23 下午3:07
         *
         */
//        Parent parent = new Parent();
//        Child child = (Child) parent;
//        System.out.println(child.string);
        Parent parent = new Child();
        Child child = (Child) parent;
        System.out.println(child.string);//child
        System.out.println(parent.string);//parent
        System.out.println(((Child) parent).string);//child
        System.out.println(((Child) parent).testChild());//testChild
        System.out.println(parent.testParent());//testParent

        /**
         *（译者注：这个地方应该表述的有误，其实无论 a+b 的值为多少，编译器都会报错，因为 a+b 操作会将 a、b 提升为 int 类型，所以将 int 类型赋值给 byte 就会编译出错）
         *
         *
         * += 隐式的将加操作的结果类型强制转换为持有结果的类型。如果两这个整型相加，如 byte、short 或者 int，首先会将它们提升到 int 类型，然后在执行加法操作。如果加法操作的结果比 a 的最大值要大，则 a+b 会出现编译错误，但是 a += b 没问题
         */
        byte a = 127;
        byte b = 127;
//        b = a + b; // error : cannot convert from int to byte
        b += a; // ok
        System.out.println(b);//-2

        double d1 = 10.33d;
        float f1 = 10.0f;
        d1 = f1;
        f1 = (float) d1;//高精度向低精度转换，需要做强制转换
        System.out.println(3*0.1);
        System.out.println(3*0.1 == 0.3);
        String jdkBit = System.getProperty("sun.arch.data.model");
        System.out.println(jdkBit);

    }
}
