package com.itheima.test;

public class ArrTest1 {
    public static void main(String[] args) {
        /*
        定义一个数组，存储1，2，3，4，5
        遍历数组得到每个元素，求数组里的数据和
         */
        int [] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // 打印加总
        System.out.println(sum);
    }
}
