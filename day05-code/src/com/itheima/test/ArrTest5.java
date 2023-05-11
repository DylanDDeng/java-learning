package com.itheima.test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        /*
        生成10个1-100之间的随机数存入数组
        1.求出所有数据的和
        2。求所有数据的平均数
        3. 统计有多少个数比平均数小
         */
        int [] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }

        // 求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组中所有数据的和为"+ sum);

        // 求平均数
        int average = sum / arr.length;
        System.out.println("数组中的平均数" + average);

        //  统计有多少个数比平均数小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < average){
                count ++ ;
            }
        }
        System.out.println("有" + count + "个数比平均数小");

        // 遍历数组，验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
