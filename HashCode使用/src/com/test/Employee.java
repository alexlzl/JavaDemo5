package com.test;

/**
 * Describe:  hashCode重要么？不重要，对于List集合、数组而言，他就是一个累赘，但是对于HashMap、HashSet、HashTable而言，它变得异常重要。所以在使用HashMap、HashSet、HashTable时一定要注意hashCode。对于一个对象而言，其hashCode过程就是一个简单的Hash算法的实现，其实现过程对你实现对象的存取过程起到非常重要的作用。
 * <p>
 * 在前面LZ提到了HashMap和HashTable两种数据结构，虽然他们存在若干个区别，但是他们的实现原理是相同的，这里我以HashTable为例阐述hashCode对于一个对象的重要性。
 * <p>
 * 一个对象势必会存在若干个属性，如何选择属性来进行散列考验着一个人的设计能力。如果我们将所有属性进行散列，这必定会是一个糟糕的设计，因为对象的hashCode方法无时无刻不是在被调用，如果太多的属性参与散列，那么需要的操作数时间将会大大增加，这将严重影响程序的性能。但是如果较少属相参与散列，散列的多样性会削弱，会产生大量的散列“冲突”，除了不能够很好的利用空间外，在某种程度也会影响对象的查询效率。其实这两者是一个矛盾体，散列的多样性会带来性能的降低。
 * <p>
 * 那么如何对对象的hashCode进行设计，LZ也没有经验。从网上查到了这样一种解决方案：设置一个缓存标识来缓存当前的散列码，只有当参与散列的对象改变时才会重新计算，否则调用缓存的hashCode，这样就可以从很大程度上提高性能。
 * <p>
 * 在HashTable计算某个对象在table[]数组中的索引位置，其代码如下：
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/15 下午3:17
 */
public class Employee {
    private Integer id;
    private String firstname;
    private String lastName;
    private String department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Describe: 重写比较规则
     * <p>
     * Author: lzl
     * <p>
     * Time:
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Employee e = (Employee) o;
        return (this.getId() == e.getId());
    }

//    @Override
//    public int hashCode() {
//        final int PRIME = 31;
//        int result = 1;
//        result = PRIME * result + getId();
//        return result;
//    }
}
