package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午4:10
 */
public class CloneDemo {
    public static void main(String args[]) throws CloneNotSupportedException {
        //CloneFooA克隆前
        CloneFooA fooA1 = new CloneFooA("FooA", 11);
        System.out.println("CloneFooA的对象克隆前对象fooA1值为: " + fooA1.getStrA() + "," + fooA1.getIntA());
        //CloneFooA克隆后
        CloneFooA fooA2 = (CloneFooA) fooA1.clone();
        System.out.println("CloneFooA的对象克隆后对象fooA2值为: " + fooA2.getStrA() + "," + fooA2.getIntA());
        //比较fooA1和fooA2内存地址
        if (fooA1 == fooA2) System.out.println("比较fooA1和fooA2内存地址:相等!");
        else System.out.println("比较fooA1和fooA2内存地址:不相等!");

        System.out.println("-------------------------");

        //CloneFooB克隆前
        CloneFooB fooB1 = new CloneFooB(fooA1, new Double("33"));
        System.out.println("CloneFooB的对象克隆前对象fooB1值为: " + fooB1.getFooA().getStrA() + "," + fooB1.getFooA().getIntA() + " | " + fooB1.getDouB());
        //CloneFooB克隆后
        CloneFooB fooB2 = (CloneFooB) fooB1.clone();
        System.out.println("CloneFooB的对象克隆前对象fooB2值为: " + fooB2.getFooA().getStrA() + "," + fooB2.getFooA().getIntA() + " | " + fooB2.getDouB());

        if (fooA1 == fooA2) System.out.println("比较fooB1和fooB2内存地址:相等!");
        else System.out.println("比较fooB1和fooB2内存地址:不相等!");
    }
}
