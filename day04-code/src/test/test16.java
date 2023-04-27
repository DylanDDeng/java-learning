package test;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        // 1. 键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字，表示范围的开始");
        int start = sc.nextInt();

        System.out.println("请在输入一个数字");
        int end = sc.nextInt();

        int count = 0;
        // 2. 利用循环获取这个范围中的每一个数字
        for(int i = start; i<=end; i++){
            // 3. 对每一个数字进行判断，统计有多少个数字满足要求
            if(i % 3 ==0 && i % 5==0){
                // System.out.println(i);
                count++ ;

            }
        }
        System.out.println(count);





    }
}
