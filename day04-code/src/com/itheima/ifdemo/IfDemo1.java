package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    // 需求： 键盘录入女婿酒量，如果大于2斤，老丈人给出回应，反之不回应
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine = sc.nextInt();

        // 对酒量进行判断
        if (wine>2){
            System.out.println("小伙子，不错哦");
        }
    }

}
