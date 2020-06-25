package com.it.jackson0419.stream._02functional;

import java.util.function.Supplier;

public class Demo01_Supplier {

    public static void main(String[] args) {

        // 我要调用已经定义好的fun方法, fun方法中需要传入Supplier
        // 它的作用就是让我们生产数据
        // lambda
        fun(() -> "Hello");

    }


    // 模拟的方法
    private static void fun(Supplier<String> s) {
        System.out.println(s.get());
    }

}
