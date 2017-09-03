package com.test;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/27 上午10:06
 */
public class Test {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);    // 0 - 11
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        // Java 8
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());     // 1 - 12
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());
        //如何取得从1970年1月1日0时0分0秒到现在的毫秒数？
        Calendar.getInstance().getTimeInMillis();
        System.currentTimeMillis();
        Clock.systemDefaultZone().millis(); // Java 8

        //如何取得某月的最后一天
        Calendar time = Calendar.getInstance();
        int lastday = time.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("最后一天"+lastday);


    }
}
