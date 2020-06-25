package com.it.jackson0419.方法引用._04method_reference.demo01;

public class Demo01_冗余的lambda {
    public static void main(String[] args) {
        // 我们要做的是方法的调用
        // 匿名内部类
        /*printString(new Printable() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        });*/

        // lambda
        printString(s -> System.out.println(s));


        printString(System.out::println);
    }

    private static void printString(Printable lambda) {
        lambda.print("Hello");
    }
}
