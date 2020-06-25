package com.it.jackson0419.stream._03stream;

import java.util.stream.Stream;

public class Demo08_concat {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("白百何");
        Stream<String> stream2 = Stream.of("小鲜肉");

        Stream.concat(stream1, stream2).forEach(System.out::println);

    }
}
