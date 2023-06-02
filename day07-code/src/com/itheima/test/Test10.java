package com.itheima.test;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        // Test 9 的第二种思路
        /*
         直播抽奖，分别有{2, 588, 888, 1000, 10000}五个奖金
        用代码模拟抽奖，打印每个奖项，奖项的出现顺序要随机且不能重复
         */

        // 1. 打乱顺序
        int [] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            // 获取随机索引
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        
    }
}
