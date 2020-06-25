package com.it.jackson0419.方法引用._03programing.demo03;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03_Lambda作为方法的返回值 {
    public static void main(String[] args) {
        Integer[] arr = {3, 2, 4, 1, 5};
        Arrays.sort(arr, getComparator());

        System.out.println(Arrays.toString(arr));
    }

    private static Comparator<Integer> getComparator() {
        // 方法的返回值类型是 函数式接口
        // 实际返回的该接口的实现类对象

        // 父类引用指向子类对象
        /*Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        return comp;*/

//        Comparator<Integer> comp = (o1, o2) -> o2 - o1;

        return (o1, o2) -> o2 - o1;

    }
}
