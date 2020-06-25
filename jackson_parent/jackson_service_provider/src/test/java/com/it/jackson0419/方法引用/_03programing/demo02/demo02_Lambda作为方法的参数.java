package com.it.jackson0419.方法引用._03programing.demo02;

public class demo02_Lambda作为方法的参数 {

    public static void main(String[] args) {
        /*startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程!~");
            }
        });*/

        startThread(() -> System.out.println("新线程!~"));
    }

    private static void startThread(Runnable r) {
        new Thread(r).start();
    }

}
