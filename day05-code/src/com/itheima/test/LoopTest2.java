package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根
        结果只保留整数部分，小数部分被舍去
         */
        // 1. 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int number = sc.nextInt();

        // 2. 从 1开始循环判断
        for(int i = 1; i<=number; i++){
            if(i * i == number){
                System.out.println(i + "就是" + number + "的平方根");
                break; // 一旦找到了，就不用再找了，跳出循环
            }else if(i * i > number){
                System.out.println((i-1) + "就是" + number + "的平方根的整数部分");
                break;
            }
        }
    }
}
