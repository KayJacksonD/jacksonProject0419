package com.it.jackson0419.方法引用._04method_reference.demo02难点;

public class Demo02_对象引用成员方法 {
    public static void main(String[] args) {

        // 匿名内部类
        /*printString(new Printable() {
            @Override
            public void print(String s) {
                // toUpperCase() : 将字符串中的字母转换成大写
                // toLowercase() : 将字符串中的字母转换成小写
                System.out.println(s.toUpperCase());
            }
        });*/

        // lanmbda
        // printString(s -> System.out.println(s)); // System.out::println

        // printString(s -> System.out.println(s.toUpperCase()));

//        printString(new MyMethodRef()::printUpper);
        printString(new MyMethodRef()::printUpper2);
    }

    private static void printString(Printable lambda) {
        lambda.print("JHGJ");
    }
}
