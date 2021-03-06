package com.it.jackson0419.stream._03stream;

import java.util.stream.Stream;

public class Demo04_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("马华腾", "马赛", "马云", "李彦宏", "雷军", "马明哲", "马黑程序员", "马超越", "马超", "马冬梅");
        // filter
        stream.filter(t -> t.startsWith("张")).forEach(System.out::println);
    }
}
