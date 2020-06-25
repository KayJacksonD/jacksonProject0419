package com.it.jackson0419.方法引用._01review;

import java.net.DatagramPacket;

/*
    C/S  B/S

    网络编程三要素
        1. IP地址: 一台设备在网络上的唯一标识
        2. 端口号: 一个程序在设备上的唯一标识
        3. 协议

    UDP: 面向无连接, 数据不安全, 速度略快
    TCP: 面向连接, 数据安全, 速度略慢

    三次握手:
        1. 客户端向服务器发送请求
        2. 服务器响应客户端, 并且向客户端发送请求
        3. 客户端响应服务器


    TCP:
        Socket: 客户端
        ServerSocket: 服务器
            accept()


 */
public class Demo01 {
    public static void main(String[] args) {
        Integer i5 = Integer.valueOf(100);
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);

    }
}
