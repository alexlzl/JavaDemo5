package com.test;

/**
 * Describe:&运算符有两种用法：(1)按位与；(2)逻辑与。&&运算符是短路与运算。逻辑与跟短路与的差别是非常巨大的，虽然二者都要求运算符左右两端的布尔值都是true整个表达式的值才是true。&&之所以称为短路运算是因为，如果&&左边的表达式的值是false，右边的表达式会被直接短路掉，不会进行运算。很多时候我们可能都需要用&&而不是&，例如在验证用户登录时判定用户名不是null而且不是空字符串，应当写为：username != null &&!username.equals(“”)，二者的顺序不能交换，更不能用&运算符，因为第一个条件如果不成立，根本不能进行字符串的equals比较，否则会产生NullPointerException异常。注意：逻辑或运算符（|）和短路或运算符（||）的差别也是如此。
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/25 下午2:52
 */
public class Test {

    public static void main(String[] strings) {
        //四舍五入的原理是在参数上加0.5然后进行下取整。
        System.out.println(Math.round(11.5));//12
        System.out.println(Math.round(-11.5));//-11
        /**
         * a = a + b 与 a += b 的区别？
         += 隐式的将加操作的结果类型强制转换为持有结果的类型。如果两这个整型相加，如 byte、short 或者 int，首先会将它们提升到 int 类型，然后在执行加法操作。如果加法操作的结果比 a 的最大值要大，则 a+b 会出现编译错误，但是 a += b 没问题，如下：
         */
        byte a = 127;
        byte b = 127;
//        b = a + b; // error : cannot convert from int to byte
        b += a; // ok
        System.out.println(b + "");
        /**
         * java支持的基本数据类型有以下9种:byte,shot,int,long,float,double,char,boolean,void.
         自动拆装箱是java从jdk1.5引用，目的是将原始类型自动的装换为相对应的对象，也可以逆向进行，即拆箱。这也体现java中一切皆对象的宗旨。
         所谓自动装箱就是将原始类型自动的转换为对应的对象，而拆箱就是将对象类型转换为基本类型。java中的自动拆装箱通常发生在变量赋值的过程中，
         */
        Integer object = 3; //自动装箱
        int o = object; //拆箱
    }
}
