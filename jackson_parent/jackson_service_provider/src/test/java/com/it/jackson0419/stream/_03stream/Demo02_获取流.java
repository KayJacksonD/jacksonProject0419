package com.it.jackson0419.stream._03stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo02_获取流 {

    public static void main(String[] args) {

        // 获取流: 得到Stream类型的对象
        // List
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        // Set
        HashSet<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        // Map
        HashMap<String, Integer> map = new HashMap<>();
        // 所有键
        Stream<String> stream3 = map.keySet().stream();
        // 所有值
        Stream<Integer> stream4 = map.values().stream();
        // 所有键值对
        Stream<Map.Entry<String, Integer>> stream5 = map.entrySet().stream();

        // 数组
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> stream6 = Stream.of(arr);

        // 一堆数据
        Stream<Integer> stream7 = Stream.of(1, 2, 3, 4, 5, 6);

    }

}
