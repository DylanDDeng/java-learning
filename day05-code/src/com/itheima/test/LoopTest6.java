package com.itheima.test;

import java.util.Random;

public class LoopTest6 {
    public static void main(String[] args) {
        // 生成任意数到任意数之间的随机数
        Random r = new Random();
        int number = r.nextInt(9)+7; // 7~15
        System.out.println(number);
    }



}
