package com.it.jackson0419.方法引用._03programing.demo01;

public class Demo01_Lambda的延迟执行 {
    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "World";
        String msgC = "Java";


        log1(2, msgA + msgB + msgC);
        log3(2, () -> msgA + msgB + msgC);

        // log2(2, msgA, msgB, msgC);

        /*log3(1, new MessageBuilder() {
            @Override
            public String buildMessage() {
                return msgA + msgB + msgC;
            }
        });*/


    }

    // 调用fun方法时 , 可以传入任意个int类型的值
    private static void fun(int... a) {
    }

    /*
        模拟日志打印的方法

          弊端:
            无论给的日志信息是否需要打印, 都完成了字符串的拼接操作
    */
    private static void log1(int level, String message) {
        // 如果等级为1, 打印
        if (level == 1) {
            System.out.println(message);
        }
    }

    /*

        使用可变参数解决日志打印性能浪费问题

        可变参数:
            格式:  (数据类型 ... 数组名)
            作用: 可以传入任意个该类型的参数

     */
    private static void log2(int level, String... arr) {
        if (level == 1) {
            // 拼接
            String result = "";
            // 遍历可变参数(数组)
            for (String s : arr) {
                result += s;
            }
            System.out.println("执行了拼接操作!~");

            System.out.println(result);
        }
    }

    /*
        使用lambda解决性能浪费的问题

     */
    private static void log3(int level, MessageBuilder lambda) {
        // 判断等级是否为1
        if (level == 1) {
            System.out.println("执行了拼接操作");
            System.out.println(lambda.buildMessage());
        }
    }
}
