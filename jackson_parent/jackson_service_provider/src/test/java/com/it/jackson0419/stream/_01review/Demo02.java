package com.it.jackson0419.stream._01review;

public class Demo02 {
    public static void main(String[] args) {

        /*method(new MyInter() {
            @Override
            public String fun() {
                return "Hello";
            }
        });*/

        // lambda
        // method(() -> "Hello");

        // method(new MyClass()::get);

        // new MyClass()::get  使用MyClass中的get方法

        method2("abc");

        method(new MyClass()::get);

        // 匿名内部类 -> lambda -> 方法引用, 接口的实现类对象

    }


    private static void method2(String s) {

    }


    private static void method(MyInter mi) {
        System.out.println(mi.fun());
    }
}
