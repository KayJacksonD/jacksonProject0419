package com.it.jackson0419.方法引用._02interface.demo01;

public class Demo01_语法糖 {
    public static void main(String[] args) {

        // 如果方法的参数列表是接口, 那么实际传入的是该接口的实现类对象
        /*method(new MyInter() {
            @Override
            public void fun() {
                System.out.println("Hello");
            }
        });

        method(new MyInter() {
            @Override
            public void fun() {
                System.out.println("Hello");
            }
        });*/

        method(() -> System.out.println("Hello"));

    }

    // 创建方法, 方法的参数列表是接口
    public static void method(MyInter mi) {
        mi.fun();
    }
}
