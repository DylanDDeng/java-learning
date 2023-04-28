package test;

public class test19 {
    public static void main(String[] args) {
        /* 需求: 给定两个整数，被除数和除数（都是正数，且不超过int的范围）
        将两数相除，要求不使用乘法，除法和%运算符
        得到商和余数
         */

        // 1. 定义被除数
        int dividend = 100;
        // 2. 定义除数
        int divisor = 37;
        // 循环 while
        int count = 0;
        while (dividend >= divisor && dividend >=0 && divisor>0) {
            dividend = dividend - divisor;
            count++;


        }
        System.out.println("商为" + count);
        System.out.println("余数为" + dividend);

    }

}

