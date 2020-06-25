package com.it.jackson0419.方法引用._04method_reference.demo05;

import java.util.Arrays;

public class Demo05_数组构造的方法引用 {
    public static void main(String[] args) {
        // 匿名内部类
        /*printArray(new ArrayBuilder() {
            @Override
            public int[] buildArray(int len) {
                return new int[len];
            }
        });*/

        // lambda
        printArray(len -> new int[len]);

        // 方法引用
        // A中的B功能  数组中的 创建 功能
        printArray(int[]::new);
    }

    private static void printArray(ArrayBuilder lambda) {
        int[] arr = lambda.buildArray(3);
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(Arrays.toString(arr));

    }
}
