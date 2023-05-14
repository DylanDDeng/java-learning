package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        // 需求： 定义一个方法，求圆的面积，将结果在方法中进行哦打印
        getArea(3.2);
    }
    public static void getArea(double radius){
        double result = radius* radius * 3.14;
        System.out.println(result);
    }
}
