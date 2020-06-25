package com.it.jackson0419.方法引用._04method_reference.demo04;

import java.util.concurrent.TimeUnit;

public class Zi extends Fu {
    @Override
    public void sayHello() {
        System.out.println("我系古天乐, 反映来到叹惋揽月");
    }

    public void fun(Greetable lambda) {
        lambda.greet();
    }

    public void method() {
        // 分别调用父类和子类的sayHello方法
       /*fun(new Greetable() {
           @Override
           public void greet() {
               // 访问Zi类的super 中的sayHello()方法
               Zi.super.sayHello();
           }
       });

       fun(new Greetable() {
           @Override
           public void greet() {
               Zi.this.sayHello();
           }
       });*/

       // lambda
        fun(() -> super.sayHello());

        fun(() -> this.sayHello());

        // 方法引用
        // A中的B功能
        fun(super::sayHello);
        fun(this::sayHello);

    }

}
