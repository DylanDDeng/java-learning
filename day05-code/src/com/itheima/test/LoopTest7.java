package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        // 需求： 程序自动生成一个1-100之间的随机数字，使用程序实现才出这个数字是多少
        // 注意事项： 生成随机数的代码不能写在循环里面
        Random r = new Random();
        int number = r.nextInt(100)+1; // 1~100
        // 猜这个数字是多少
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();
            // 判断
            if(guessNumber > number){
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            }else{
                System.out.println("猜中了");
                break;
            }
        }


    }
}
