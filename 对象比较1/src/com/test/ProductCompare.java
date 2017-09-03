package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/11 下午4:50
 */
public class ProductCompare implements java.util.Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        return -( o1.getPrice()-o2.getPrice()>0?1: (o1.getPrice()==o2.getPrice()?0:-1));
    }
}
