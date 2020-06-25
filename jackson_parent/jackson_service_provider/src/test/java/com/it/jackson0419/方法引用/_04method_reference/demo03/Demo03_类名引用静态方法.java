package com.it.jackson0419.方法引用._04method_reference.demo03;

public class Demo03_类名引用静态方法 {
    public static void main(String[] args) {
        // 匿名内部类
        /*printAbs(new Calculator() {
            @Override
            public int getAbs(int num) {
                return Math.abs(num);
            }
        });*/

        // lambda
        printAbs(n -> Math.abs(n));

        // 方法引用
        // A中的B功能
        printAbs(Math::abs);
    }

    private static void printAbs(Calculator lambda) {
        System.out.println(lambda.getAbs(-10));
    }
}
