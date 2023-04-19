package com.itheima.test;

public class test5 {
    public static void main(String[] args) {
        // 1. 定义3个变量，记录3个和尚的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        // 2. 比较
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;

        System.out.println(max);

    }
}
