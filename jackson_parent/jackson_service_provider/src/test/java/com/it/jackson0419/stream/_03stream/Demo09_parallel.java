package com.it.jackson0419.stream._03stream;

import java.util.stream.Stream;

public class Demo09_parallel {

    public static void main(String[] args) {
        //并发
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach(System.out::println);

        System.out.println("~~~~~~~~~");

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).parallel().forEach(System.out::println);

    }

}
