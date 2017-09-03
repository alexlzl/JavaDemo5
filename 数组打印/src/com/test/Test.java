package com.test;

import java.util.Arrays;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/24 下午4:01
 */
public class Test {
    private static String[] test = new String[]{"a", "b", "c", "d", "f"};

    /**
     * Describe: 你可以使用 Arrays.toString() 和 Arrays.deepToString() 方法来打印数组。由于数组没有实现 toString() 方法，所以如果将数组传递给 System.out.println() 方法，将无法打印出数组的内容，但是 Arrays.toString() 可以打印每个元素
     * <p>
     * Author: lzl
     * <p>
     * Time: 2017/5/24 下午4:03
     */
    public static void main(String[] strings) {
        System.out.println(strings.toString());
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.toString(test));
        //返回指定数组“深层内容”的字符串表示形式。如果数组包含作为元素的其他数组，则字符串表示形式包含其内容等。此方法是为了将多维数组转换为字符串而设计的。
        System.out.println(Arrays.deepToString(test));
    }
}
