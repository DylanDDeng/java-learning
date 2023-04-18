package com.itheima.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        // 1. 键盘录入两个整数，表示衣服的时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我们自己的衣服的时髦度");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象的时髦度");
        int girlFashion = sc.nextInt();

        // 2. 把我衣服时髦度跟女孩衣服时髦度进行对比就可以了
        boolean result = myFashion > girlFashion;

        // 3. 打印结果
        System.out.println(result);
    }
}
