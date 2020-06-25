package com.it.jackson0419.stream._04test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    现在有两个List集合存储队伍当中的多个成员姓名，要求使用Stream流的方式依次进行以下若干操作步骤：

    第一个队伍：{"tom", "kobe", "jordan", "tracy","westbrook","yaoming","ace","stephen"}

    第二个队伍：{"beyonce", "jay_z", "adele", "taylor","bieber","ladygaga"}

    1：第一个队伍只要名字长度大于4的前三名

    2：第二个队伍只要名字中带有a的;筛选后不要第一个

    3：将两个队伍合并为一个队伍,并最终转换为List集合

    4：将最终的队伍中的名字按照名字的字母降序排列（非自然顺序，与自然排序相反，如zyx...cba）

    5：使用foreach(增强for)进行遍历打印最终的名字

 */
public class Demo02_Stream {
    public static void main(String[] args) {
        // 第一个队伍
        ArrayList<String> list1 = new ArrayList<>();

        Collections.addAll(list1, "tom", "kobe", "jordan", "tracy", "westbrook", "yaoming", "ace", "stephen");

        // 第二个队伍
        ArrayList<String> list2 = new ArrayList<>();

        Collections.addAll(list2, "beyonce", "jay_z", "adele", "taylor", "bieber", "ladygaga");

        // 1：第一个队伍只要名字长度大于4的前三名
        Stream<String> stream1 = list1.stream().filter(t -> t.length() > 4).limit(3);

        // 2：第二个队伍只要名字中带有a的;筛选后不要第一个
        Stream<String> stream2 = list2.stream().filter(t -> t.contains("a")).skip(1);

        // 3：将两个队伍合并为一个队伍,并最终转换为List集合
        List<String> list = Stream.concat(stream1, stream2).collect(Collectors.toList());

        // 4：将最终的队伍中的名字按照名字的字母降序排列（非自然顺序，与自然排序相反，如zyx...cba）
        // Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        Collections.sort(list, Comparator.reverseOrder());

        // 5：使用foreach(增强for)进行遍历打印最终的名字
        for (String s : list) {
            System.out.println(s);
        }
    }
}
