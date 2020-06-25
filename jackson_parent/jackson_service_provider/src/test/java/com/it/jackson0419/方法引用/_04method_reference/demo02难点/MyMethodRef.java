package com.it.jackson0419.方法引用._04method_reference.demo02难点;

public class MyMethodRef {
    /**
     * 将参数转换成大写并打印
     * @param s
     */
    public String printUpper(String s) {
        System.out.println(s.toUpperCase());
        return null;
    }
    public void printUpper2(String s) {
        System.out.println(s.toLowerCase());
    }
}
