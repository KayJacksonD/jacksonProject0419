package com.it.jackson0419.方法引用._04method_reference.demo07;

public class
Demo07_类名引用成员方法 {
    public static void main(String[] args) {
        /*printString(new MyInter() {
            @Override
            public String fun(String s) {
                return s.toUpperCase();
            }
        });*/

        printString(s -> s.toUpperCase());

        // 类名引用成员方法
        printString(String::toUpperCase);
    }

    private static void printString(MyInter lambda) {
        System.out.println(lambda.fun("Hello"));
    }
}
