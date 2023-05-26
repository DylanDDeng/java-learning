package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
        定义方法实现随机产生一个5位的验证码
        验证码格式：
        长度为5
        前四位是大写字母或者小写字母
        最后以为是数字
         */

        // 分析： 如果要随机从没什么规律的数据中随机抽取，那么可以先把这些数据放到数组里，通过随机抽取索引的方式，随机抽取数据
        // 1. 将大写字母和小写字母放入数组中
        char [] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<=25){
                // 添加小写字母
                chs[i] = (char)(97+i);
            }else{
                chs[i] = (char)(65 + i - 26);
            }

        }
        // 定义一个字符串类型的变量，用来记录最终的结果
        String result = "";
        // 随机抽取4次
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            // System.out.println(chs[randomIndex]);
            result += chs[randomIndex];
        }
        // 随机抽取0~9
       int number =  r.nextInt(10);
        // 生成最终的结果
        result += number;

        // 打印
        System.out.println(result);






    }
}
