package test;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        // 1. 键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请记录一个整数表示星期");
        int week = sc.nextInt();

        // 2. 利用switch来进行选择
        switch(week){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }
    }
}
