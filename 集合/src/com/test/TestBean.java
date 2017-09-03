package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/12 下午2:05
 */
public class TestBean implements Comparable<TestBean>{
    private int id;

    public TestBean(int id){
        this.id=id;

    }

    public int getId(){

        return id;

    }

    @Override
    public int compareTo(TestBean o) {
        return this.id-o.id;
    }
}
