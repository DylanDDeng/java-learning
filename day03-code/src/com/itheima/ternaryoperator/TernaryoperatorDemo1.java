package com.itheima.ternaryoperator;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        // 需求：使用三元运算符，获取两个数的较大值

        // 1.定义两个变量记录整数
        int num1 = 10;
        int num2 = 20;

        // 2. 使用三元运算符获取两个整数的较大值
        int max = num1 > num2 ? num1: num2;
        System.out.println(max);

        // 另一种表达方式
        System.out.println(num1 > num2? num1:num2);

    }
}
