package com.itheima.test;

public class ArrTest4 {
    public static void main(String[] args) {
        // 求最大值  33， 5， 22， 44， 55

        // 1. 定义数组
        int [] arr = {33, 5, 22, 44, 55};

        // 2. 定义一个变量max用来存储最大值
        int max = arr[0];

        // 3. 循环进行比较
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max); // 55

        // 求最小值
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min); // 5



    }
}
