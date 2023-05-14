package com.itheima.methoddemo;

public class MethodDemo3 {
    public static void main(String[] args) {
        // 需求： 在方法里定义两个变量并求和打印
        getSum();
    }
    public static void getSum(){
        int a = 10;
        int b = 10;

        int result = a + b;
        System.out.println(result);
    }
}
