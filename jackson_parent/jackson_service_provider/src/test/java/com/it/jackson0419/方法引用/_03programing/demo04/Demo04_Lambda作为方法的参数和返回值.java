package com.it.jackson0419.方法引用._03programing.demo04;
/*
请自定义一个函数式接口MySupplier ，含有无参数的抽象方法get
得到Object 类型的返回值。并使用该函数式接口分别作为方法的参数和返回值。
 */
public class Demo04_Lambda作为方法的参数和返回值 {
    public static void main(String[] args) {
        // 匿名内部类
        /*printData(new MySupplier() {
            @Override
            public Object get() {
                return "Hello";
            }
        });*/

        // lambda作为方法的参数
        printData(() -> "Hello");

        printData(getData());
    }

    private static void printData(MySupplier lambda) {
        System.out.println(lambda.get());
    }

    // lambda作为方法返回值
    private static MySupplier getData() {
        // 匿名内部类
        /*return new MySupplier() {
            @Override
            public Object get() {
                return "World";
            }
        };*/

        return () -> "World";
    }
}
