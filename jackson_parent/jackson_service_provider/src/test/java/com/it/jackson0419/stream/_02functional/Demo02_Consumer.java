package com.it.jackson0419.stream._02functional;

import java.util.function.Consumer;

public class Demo02_Consumer {
    public static void main(String[] args) {
        // lambda
        // 让我们操作t, 操作的方式可以是任意
        fun(t -> System.out.println(t.toUpperCase()));
    }

    // 我们模拟的方法
    private static void fun(Consumer<String> c) {
        c.accept("Hello");
    }
}
