package com.it.jackson0419.stream._03stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo10_collect {
    public static void main(String[] args) {

        List<Integer> list = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());

        System.out.println(list);

    }
}
