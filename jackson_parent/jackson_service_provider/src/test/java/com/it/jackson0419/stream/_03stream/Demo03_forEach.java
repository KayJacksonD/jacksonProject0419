package com.it.jackson0419.stream._03stream;

import java.util.stream.Stream;

public class Demo03_forEach {
    public static void main(String[] args) {
        // 获取流, 通过一堆数据
        // home: 光标移动到一行的头部
        // end: 光标移动到一行的尾部
        Stream<String> stream =
                Stream.of("马华腾", "马赛", "马云", "李彦宏", "雷军", "马明哲", "马黑程序员", "马超越", "马超", "马冬梅");

        // forEach
        // stream.forEach(t -> System.out.println(t));
        stream.forEach(System.out::println);

    }
}
