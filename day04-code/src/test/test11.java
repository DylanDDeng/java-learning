package test;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        // 1. 键盘录入一个整数，表示我们的选择
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的选择");
        int choose = sc.nextInt();

        // 2. 根据选择，执行不同的代码逻辑
        switch(choose){
            case 1-> System.out.println("机票查询");
            case 2-> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            //case 4-> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }


    }
}
