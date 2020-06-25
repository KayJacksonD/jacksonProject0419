package com.it.jackson0419.方法引用._02interface.demo03;
/*
    请定义一个函数式接口Eatable ，内含抽象eat 方法，没有参数或返回值。
    使用该接口作为方法的参数，并进而通过Lambda来使用它。
 */
public class Demo03_自定无参无返回的函数式接口 {
    public static void main(String[] args) {

        // 匿名内部类
        /*fun(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃饭啦!~");
            }
        });*/

        fun(() -> System.out.println("吃饭啦!~"));



    }

    // 实际传入的一定是接口的实现类对象
    private static void fun(Eatable lambda) {
        lambda.eat();
    }
}
