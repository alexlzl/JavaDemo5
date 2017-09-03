package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/25 下午3:52
 */
public class Test {
    /**
     * 在Java 5以前，switch(expr)中，expr只能是byte、short、char、int以及对应的包装类型从Java 5开始，Java中引入了枚举类型，expr也可以是enum类型，从Java 7开始，expr还可以是字符串（String），但是长整型（long）在目前所有的版本中都是不可以的。
     *
     * @param strings
     */
    public static void main(String[] strings) {
        byte b = 100;
        switch (b) {
            case 100:
                System.out.println("byte==100");
                break;
        }

        char ch = '你';
        switch (ch) {
            case '你':
                System.out.println("char====你");
                break;
        }
        //不可以是long类型
//        long l=100l;
//        switch (l){
//            case 100:
//                break;
//        }
        S ss = S.a;
        switch (ss) {
            case a:
                System.out.println("enum====a");
                break;
            case b:
                break;
            case c:
                break;
        }

        String string = "abc";
        switch (string) {
            case "abc":
                System.out.println("str====abc");
                break;

        }

        Character character = 'c';
        switch (character) {
            case 'c':
                System.out.println("character====c");
                break;

        }
        /**
         * 2 << 3（左移3位相当于乘以2的3次方，右移3位相当于除以2的3次方）。

         */
        System.out.println(2 << 3);
        System.out.println(2 >> 3);

    }

    enum S {
        a, b, c, d
    }
}
