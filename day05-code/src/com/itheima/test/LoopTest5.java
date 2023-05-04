package com.itheima.test;

import java.util.Random;

public class LoopTest5 {
    public static void main(String[] args) {
        // 创建对象
        Random r = new Random();
        // 生成随机数
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(10); // 0~99
            System.out.println(number);
        }
    }
}
