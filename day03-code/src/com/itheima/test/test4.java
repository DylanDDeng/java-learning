package com.itheima.test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        // 1. 键盘录入： 两只老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int weight2 = sc.nextInt();

        // 2. 比较
        System.out.println(weight1>weight2? weight1: weight2);

        String result = weight1 == weight2? "相同": "不同";
        System.out.println(result);

    }
}
