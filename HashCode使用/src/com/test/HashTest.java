package com.test;

import java.util.HashSet;
import java.util.Set;

/**
 * Describe:1、hashCode的存在主要是用于查找的快捷性，如Hashtable，HashMap等，hashCode是用来在散列存储结构中确定对象的存储地址的；
 * 2、如果两个对象相同，就是适用于equals(Java.lang.Object) 方法，那么这两个对象的hashCode一定要相同；
 * 3、如果对象的equals方法被重写，那么对象的hashCode也尽量重写，并且产生hashCode使用的对象，一定要和equals方法中使用的一致，否则就会违反上面提到的第2点；
 * 4、两个对象的hashCode相同，并不一定表示两个对象就相同，也就是不一定适用于equals(java.lang.Object) 方法，只能够说明这两个对象在散列存储结构中，如Hashtable，他们“存放在同一个篮子里”。
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/17 下午3:06
 */
public class HashTest {
    private int i;
    private String[] str=new String[9];
    private String[] s=new String[]{"s","t"};
    private String[] ss=new String[]{};

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    /**
     * Describe: 以上这个示例，我们只是重写了hashCode方法，从上面的结果可以看出，虽然两个对象的hashCode相等，但是实际上两个对象并不是相等；，我们没有重写equals方法，那么就会调用object默认的equals方法，是比较两个对象的引用是不是相同，显示这是两个不同的对象，两个对象的引用肯定是不定的。这里我们将生成的对象放到了HashSet中，而HashSet中只能够存放唯一的对象，也就是相同的（适用于equals方法）的对象只会存放一个，但是这里实际上是两个对象a,b都被放到了HashSet中，这样HashSet就失去了他本身的意义了。
     * 此时我们把equals方法给加上：
     * <p>
     * Author: lzl
     * <p>
     * Time: 2017/5/17 下午3:09
     */
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof HashTest)) {
            return false;
        }
        HashTest other = (HashTest) object;
        if (other.getI() == this.getI()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return i % 10;
    }

    public final static void main(String[] args) {
        HashTest a = new HashTest();
        HashTest b = new HashTest();
        a.setI(1);
        b.setI(1);
        Set<HashTest> set = new HashSet<HashTest>();
        set.add(a);
        set.add(b);
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(set);
    }
}
