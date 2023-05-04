package com.itheima.test;

import java.security.KeyStore;
import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        // 需求： 键盘录入一个整数x，判断该整数是否为一个质数
        // 1. 键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int number  = sc.nextInt();

        // 定义一个变量， 表示标记
        // 标记着number 是否为一个质数
        // true: 是一个质数
        // false: 不是质数
        boolean flag = true;

        // 2.循环
        for(int i = 2; i<number; i++){
            if(number % i == 0 ){
                flag = false;
                break;
            }
            }
        if(flag){
            System.out.println("是一个质数");
        }else{
            System.out.println("不是一个质数");
        }
        }
    }

