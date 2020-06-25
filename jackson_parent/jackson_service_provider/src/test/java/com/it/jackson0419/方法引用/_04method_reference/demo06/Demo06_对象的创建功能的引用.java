package com.it.jackson0419.方法引用._04method_reference.demo06;

public class Demo06_对象的创建功能的引用 {
    public static void main(String[] args) {
        /*printPerson(new PersonBuilder() {
            @Override
            public Person buildPerson(String name) {
                return new Person(name);
            }
        });*/

        // lambda
        printPerson(name -> new Person(name));

        // 方法引用
        // A中的B功能: Person中的创建功能
        printPerson(Person::new);
    }

    private static void printPerson(PersonBuilder lambda) {
        System.out.println(lambda.buildPerson("高圆圆"));
    }
}
