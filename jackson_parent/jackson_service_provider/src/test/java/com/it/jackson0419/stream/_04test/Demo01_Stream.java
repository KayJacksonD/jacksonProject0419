package com.it.jackson0419.stream._04test;

import com.it.jackson0419.stream._03stream.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo01_Stream {
    /*
        1. 第一个队伍只要名字为3个字的成员姓名；
        2. 第一个队伍筛选之后只要前3个人；
        3. 第二个队伍只要姓张的成员姓名；
        4. 第二个队伍筛选之后不要前2个人；
        5. 将两个队伍合并为一个队伍；
        6. 根据姓名创建Person 对象；
        7. 打印整个队伍的Person对象信息。
     */
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");

        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        /*
            1. 第一个队伍只要名字为3个字的成员姓名；
            2. 第一个队伍筛选之后只要前3个人；
         */
        Stream<String> stream1 = one.stream().filter(t -> t.length() == 3).limit(3);
        System.out.println(stream1);

        /*
            3. 第二个队伍只要姓张的成员姓名；
            4. 第二个队伍筛选之后不要前2个人；
         */
        Stream<String> stream2 = two.stream().filter(t -> t.startsWith("张")).skip(2);

        /*
            5. 将两个队伍合并为一个队伍；
            6. 根据姓名创建Person 对象；
            7. 打印整个队伍的Person对象信息。
         */
         Stream.concat(stream1, stream2).map(Person::new).forEach(System.out::println);

    }

}