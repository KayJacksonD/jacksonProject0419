package com.it.jackson0419.stream._03stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Demo11_sorted {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(3, 2, 4, 1, 5);

        // 默认升序
        // stream.sorted().forEach(System.out::println);


        // 降序
        stream.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
