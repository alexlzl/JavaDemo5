package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/14 下午1:12
 */
class Bird implements Comparable<Bird>
{
    int size;

    public Bird(int s)
    {
        size = s;
    }

    public String toString()
    {
        return size + "号鸟";
    }

    @Override
    public int compareTo(Bird o)
    {
        return size - o.size;
    }

}