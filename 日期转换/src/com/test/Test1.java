package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/27 上午10:40
 */
public class Test1 {

    public static void main(String[] strings) {

        /**
         *  使用Date类中对应的get方法，可以获得Date类对象中相关的信息，需要注意的是使用getYear获得是Date对象中年份减去1900以后的值，所以需要显示对应的年份则需要在返回值的基础上加上1900，月份类似。在Date类中还提供了getDay方法，用于获得Date对象代表的时间是星期几，Date类规定周日是0，周一是1，周二是2，后续的依次类推。
         */
        Date date = new Date();
        System.out.println(date);
        System.out.println("年" + (date.getYear() + 1900));
        System.out.println("毫秒" + date.getTime());
        System.out.println("小时" + date.getHours());
        System.out.println("秒" + date.getSeconds());
        System.out.println("分" + date.getMinutes());
        System.out.println("月" + date.getMonth());
        // 完整显示今天日期时间
        String str = (new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss:SSS")).format(new Date());
        System.out.println(str);
        try {
            //字符串-date-字符串
            Date date1 = new SimpleDateFormat("yyyyMMdd").parse("20150304");
            String s = new SimpleDateFormat(" yyyy-MM-dd HH:mm:ss").format(date1);
            System.out.println("转换后解析" + s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
