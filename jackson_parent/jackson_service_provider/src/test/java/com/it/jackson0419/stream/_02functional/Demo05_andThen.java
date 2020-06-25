package com.it.jackson0419.stream._02functional;

import java.util.function.Consumer;

public class Demo05_andThen {
    public static void main(String[] args) {

        fun(t -> System.out.println(t.toUpperCase()),
                t -> System.out.println(t.toLowerCase()));


    }

    // 需要传入两个Consumer接口的参数
    private static void fun(Consumer<String> one, Consumer<String> two) {
        // 调用andThen()方法
         one.andThen(two).accept("Hello");

        String s = "Hello";
        one.accept(s);
        two.accept(s);


    }
}
