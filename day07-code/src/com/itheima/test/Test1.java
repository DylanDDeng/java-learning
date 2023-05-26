package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        机票价格计算
        机票价格按淡季，旺季，头等舱，经济舱收费，输入机票原价，月份，和头等舱或经济舱，
        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月-来年4月）头等舱7折，经济舱6.5折
         */

        // 1. 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double ticket = sc.nextInt();

        System.out.println("请输入当前月份：");
        int month = sc.nextInt();

        System.out.println("请输入当前购买的仓位：");
        int seat = sc.nextInt();

        // 2. 判断当前是否为淡季或旺季
        if (month >=5 && month <=10){
            // 旺季 // 3. 判断是经济舱还是头等舱
            ticket = getPrice(ticket, seat, 0.9, 0.85);
        }else if((month>=1 && month <=4) ||(month>=11 && month <=12) ) {
            // 淡季
            ticket = getPrice(ticket, seat, 0.7, 0.65);
        }
            else{
            // 键盘录入的月份有问题
            System.out.println("键盘录入的月份有问题");
        }
        System.out.println(ticket);

    }
    public static double getPrice(double ticket, int seat, double v0, double v1){
        if (seat == 0) {
            // 头等舱
            ticket *= v0;
        } else if (seat == 1) {
            // 经济舱
            ticket *= v1;
        } else {
            System.out.println("没有这个仓位");
        }
        return ticket ;
    }
}
