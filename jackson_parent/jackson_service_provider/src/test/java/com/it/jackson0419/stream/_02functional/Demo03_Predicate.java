package com.it.jackson0419.stream._02functional;

import java.util.function.Predicate;

public class Demo03_Predicate {
    public static void main(String[] args) {
        fun(t -> t.startsWith("ni"));
    }

    private static void fun(Predicate<String> p) {
        System.out.println(p.test("nihao"));
    }
}
