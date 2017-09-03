package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午4:07
 */
public class CloneFooA implements Cloneable{
    private String strA;
    private int intA;

    public CloneFooA(String strA, int intA) {
        this.strA = strA;
        this.intA = intA;
    }

    public String getStrA() {
        return strA;
    }

    public void setStrA(String strA) {
        this.strA = strA;
    }

    public int getIntA() {
        return intA;
    }

    public void setIntA(int intA) {
        this.intA = intA;
    }

    /**
     * @return 创建并返回此对象的一个副本。
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        //直接调用父类的clone()方法,返回克隆副本
        return super.clone();
    }
}
