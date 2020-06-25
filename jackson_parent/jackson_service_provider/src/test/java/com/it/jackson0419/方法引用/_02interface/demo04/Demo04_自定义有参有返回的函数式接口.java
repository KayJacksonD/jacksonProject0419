package com.it.jackson0419.方法引用._02interface.demo04;
/*
    请定义一个函数式接口Sumable ，内含抽象sum 方法，
    可以将两个int数字相加返回int结果。
    使用该接口作为方法的参数，并进而通过Lambda来使用它。
 */
public class Demo04_自定义有参有返回的函数式接口 {
    public static void main(String[] args) {
        // 调用方法
        /*fun(new Sumable() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        });*/

        // 方法的参数列表, 又传入了一个方法
        // lambda
        fun((a, b) -> a + b); // 做什么
    }

    //加
    //减
    //乘...


    private static void fun(Sumable lambda) {
        System.out.println(lambda.sum(10, 20));
    }
}
