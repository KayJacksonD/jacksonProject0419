package com.it.jackson0419.stream._01review;

import java.util.Comparator;

/*

    语法糖

    注解
        @Override

    函数式接口: 有且只有一个抽象方法的接口
        @FunctionalInterface

    Lambda的特点: 延迟执行

    lambda作为方法的参数

    lambda作为方法的返回值

    方法引用:
        前提: lambda中使用的功能, 一定是定义好的
        格式: A :: B 使用A中的B功能

        使用方式:
            对象名 引用 成员方法
            类名 引用 静态方法
            this和super 引用 成员方法
            类名 引用 构造方法(new)
            数组 引用 创建功能(new)
            类名 引用 成员方法

    方法(s -> System.out.println(s))
    方法(System.out::println)


 */
public class Demo01 {
    public static void main(String[] args) {

        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开启了一条新线程");
            }
        });

        // lambda
        startThread(() -> System.out.println("开启了一条新线程"));

    }

    private static void startThread(Runnable lambda) {
        new Thread(lambda).start();
    }


    // 如果方法的返回值类型是 函数式接口, 返回可以使用lambda
    private static Comparator<String> get() {
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };*/


        return ((o1, o2) -> o2.compareTo(o1));
    }

}
