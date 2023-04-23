package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        // 1.键盘录入一个整数表示电影票票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个票号");
        int ticket = sc.nextInt();
        // 只有当ticket在0-100之间，才是真实有效的票号
        if (ticket >= 0 && ticket <= 100) {
            // 2. 判断是偶数还是奇数
            if (ticket % 2 == 1) {
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        }

    }
}
