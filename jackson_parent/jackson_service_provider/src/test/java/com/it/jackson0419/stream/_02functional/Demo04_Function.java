package com.it.jackson0419.stream._02functional;

import java.util.function.Function;

public class Demo04_Function {
    public static void main(String[] args) {

        fun(t -> Integer.parseInt(t));
        // 方法引用
        // fun(Integer::parseInt);

        // a的b次方
        fun2(t -> (int) Math.pow(2, t));

    }


    private static void fun(Function<String, Integer> f) {
        Integer i = f.apply("123");
        System.out.println(i);
    }

    private static void fun2(Function<Integer, Integer> f) {
        Integer i = f.apply(10);
        System.out.println(i);
    }
}
