package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        // 需求：定义一个方法，求长方形的周长，并将结果在方法中进行打印
        lengthRectangle(30.0, 40.0);
        // 目标：根据不同的需求，选择定义无参数的方法还是带参数的方法
    }
    public static void lengthRectangle(double height, double width){
        double result = (height + width) * 2;
        System.out.println(result);
    }
}
