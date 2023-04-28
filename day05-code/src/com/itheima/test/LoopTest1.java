package com.itheima.test;

public class LoopTest1 {
    public static void main(String[] args) {
        /*
        逢7过
         */
        // 1. 得到1-100之间的每个数字
        for(int i=1; i<=100; i++ ){
            if(i % 10 == 7 || i/10%10==7 || i%7==0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);

        }

    }
}
