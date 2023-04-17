package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        // 现在要强制转换的是b1 + b2
        // 数据过大， 强制转换会发生错误
        byte result = (byte) (b1 + b2);
        System.out.println(result); // 30
    }
}

