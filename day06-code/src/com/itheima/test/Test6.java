package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        // 需求：设计一个数组，求最大值

        // 1. 定义数组
        int [] arr = {1, 5, 7, 3, 8, 11};

        int max = getMax(arr);

        System.out.println(max);

    }
    public static int getMax(int[] arr){

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];

            }
        }
        return max;

    }
}
