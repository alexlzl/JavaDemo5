package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/26 上午11:35
 */
public class Test {
    /**
     * 原因在于 intern 这个方法返回的是 返回字符串对象的规范化表示形式，当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（该对象由 equals(Object) 方法确定），则返回池中的字符串。否则，将此 String 对象添加到池中，并且返回此 String 对象的引用。这时候c和d就是相等的
     *
     * @param args
     */
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
        System.out.println(s1 == s1.intern());//true
        String a = "b";
        String b = "b";

        System.out.println(a == b);//true

        String c = "d";
        String d = new String("d").intern();
        System.out.println(c == d);//true

        String s11 = "ab123";
        String s22 = new String( "ab123" ) ;
        System.out.println( s11 == s22 );//false
        String s33 = s22.intern() ;
        System.out.println( s11 == s33 ) ;//true
    }
}
