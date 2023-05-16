package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        // 掌握带返回值的方法的定义和调用

//        // 直接调用
//
//        getSum(30, 20, 10);
//
//        // 赋值调用
//        int sum = getSum(30, 20, 10);
//        System.out.println(sum);
//
//        // 输出调用
//        System.out.println(getSum(30, 20, 10));
        // 计算第一个季度的营业额
        int sum1 = getSum(30, 20, 10);
        int sum2 = getSum(40, 50, 10);
        int sum3 = getSum(50, 30, 10);
        int sum4 = getSum(60, 10, 10);

        // 加总

        int sum = sum1 + sum2 + sum3 + sum4;

        System.out.println(sum);

    }
    public static int getSum(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}
