package com.test;

import java.io.UnsupportedEncodingException;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/26 下午6:15
 */
public class Test {
    public static void main(String[] strings){
        String s1 = "你好";
        try {
            String s2 = new String(s1.getBytes("GB2312"), "GBK");
            System.out.print(s2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
