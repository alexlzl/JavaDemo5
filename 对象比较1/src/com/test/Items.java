package com.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/11 下午4:34
 */
public class Items implements java.lang.Comparable<Items> {
    private String title;
    private int hits;
    private Date pubTime;

    public Items() {
    }

    public Items(String title, int hits, Date pubTime) {
        super();
        this.title = title;
        this.hits = hits;
        this.pubTime = pubTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    //时间降序 点击量升序 标题降序
    @Override
    public int compareTo(Items o) {
        int result = 0;
        //按照生产时间降序
        result = -this.pubTime.compareTo(o.pubTime);
        if (0 == result) {//如果生产时间相同 就按照销售量升序排列
            result = this.hits - o.hits;
            if (0 == result) {//如果销售量相同 按照名字降序排列
                result = -this.title.compareTo(o.title);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("商品名称").append(this.title);
        sb.append("销售量").append(this.hits);
        sb.append("生产时间").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime)).append("\n");
        return sb.toString();
    }

    //时间降序， 销售量升序， 标题降序
    public static void main(String[] args) {
        List<Items> item
                = new ArrayList<Items>();
        item.add(new Items("abcitems"
                , 30, new Date(System.currentTimeMillis() - 1000 * 60 * 60)));
        item.add(new Items("abcfgitems"
                , 30, new Date(System.currentTimeMillis() - 1000 * 60 * 50)));
        item.add(new Items("abcditems"
                , 100, new Date()));
        item.add(new Items("abefNews"
                , 50, new Date(System.currentTimeMillis() - 1000 * 60 * 60)));
        System.out.println("----------排序前----------");
        System.out.println(item);
        System.out.println("----------排序后----------");
        Collections.sort(item);
        System.out.println(item);
    }
}
