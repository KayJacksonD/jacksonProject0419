package com.it.jackson0419.stream._03stream;

import java.util.stream.Stream;

public class Demo06_count {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("马华腾", "马赛", "马云", "李彦宏", "雷军",
                "马明哲", "马黑程序员", "马超越", "马超", "马冬梅");
        Stream<String> stream1 = stream.filter(t -> t.startsWith("马"));


        Stream<String> stream2 = stream1.filter(t -> t.length() == 3);

        Stream<String> stream3 = stream1.limit(3);


        // 使用forEach方法, 打印流中的元素
        // stream1.forEach(System.out::println);

        // System.out.println(stream1.count());





    }
}
