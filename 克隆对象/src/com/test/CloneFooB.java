package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/9 下午4:08
 */
public class CloneFooB implements Cloneable{
    private CloneFooA fooA;
    private Double douB;

    public CloneFooB(Double douB) {
        this.douB = douB;
    }

    public CloneFooB(CloneFooA fooA, Double douB) {
        this.fooA = fooA;
        this.douB = douB;
    }

    public CloneFooA getFooA() {
        return fooA;
    }

    public void setFooA(CloneFooA fooA) {
        this.fooA = fooA;
    }

    public Double getDouB() {
        return douB;
    }

    public void setDouB(Double douB) {
        this.douB = douB;
    }

    /**
     * 克隆操作
     *
     * @return 自身对象的一个副本
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        //先调用父类的克隆方法进行克隆操作
        CloneFooB cloneFooB = (CloneFooB) super.clone();
        //对于克隆后出的对象cloneFooB,如果其成员fooA为null,则不能调用clone(),否则出空指针异常
        if (this.fooA != null)
            cloneFooB.fooA = (CloneFooA) this.fooA.clone();

        return cloneFooB;
    }
}
