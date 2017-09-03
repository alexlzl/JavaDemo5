package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/27 下午5:09
 */
public class CustomerException  extends  Exception{
    private   String test="test";

    public CustomerException(String msg)
    {
        super(msg);
    }
}
