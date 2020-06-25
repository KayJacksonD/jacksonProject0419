package com.it.jackson0419.stream._03stream;

import java.util.stream.Stream;

public class Demo07_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("马华腾", "马赛", "马云", "李彦宏", "雷军", "马明哲", "马黑程序员", "马超越", "马超", "马冬梅");

        // String -> Person
        // stream.map(t -> new Person(t)).forEach(System.out::println);
        stream.map(Person::new).forEach(System.out::println);

    }

    private static void demo01() {
        // String -> Integer
        Stream<String> stream = Stream.of("10", "20", "30");

        // map
        // stream.map(t -> Integer.parseInt(t))
        stream.map(Integer::parseInt).forEach(t -> System.out.println(t + 100));
    }
}
