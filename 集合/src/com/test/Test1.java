package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/12 上午11:17
 */
public class Test1 {
    private static List<Test1> list = new ArrayList<>();
    private static Test1[] tests=new Test1[list.size()];

    public static void main(String[] strings) {
//        List list = new ArrayList();
//        Object[] objectArray1 = list.toArray();
//        String[] array1 = (String[]) list.toArray(new String[list.size()]);
        for (int i = 0; i < 10; i++) {
            Test1 test = new Test1();
            list.add(test);
        }
//        tests = (Test1[]) list.toArray(new Test1[list.size()]);
        Object[] objects=list.toArray();
        for(int i=0;i<objects.length;i++){
//           Test1 test= (Test1) objects[i];
        }
//        tests= (Test1[]) objects;
        System.out.print(objects.toString()+"=="+objects.length);
    }
}
