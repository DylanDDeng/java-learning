package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        // 定义两个变量 记录正确的用户名和密码
        String rightUserName = "zhangsan";
        String rightPassword = "123456";


        Scanner sc = new Scanner(System.in);

        // 键盘输入用户名和密码
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String userName = sc.next();

            System.out.println("请输入密码");
            String password = sc.next();

            // 比较
            if(userName.equals(rightUserName) && password.equals(rightPassword)){
                System.out.println("用户登录成功");

            }else{
                if(i==2){
                    // 如果最后一次，要提示账号被锁定
                    System.out.println("账户"+userName + "已被锁定" );

                }else{
                    System.out.println("用户登录失败，用户名或密码错误,您还剩下"+(2-i)+ "次机会");
                }

            }
        }


    }
}
