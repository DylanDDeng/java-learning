package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        /*
        找出101-200有多少素数
         */
        int count = 0;
        for (int i = 101; i < 201; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                System.out.println("当前数字" + i + "是质数");
                count++;

            }
        }
        System.out.println("一共有" + count + "个质数");
        }

    }

