package com.itheima.test;

public class ArrTest6 {
    public static void main(String[] args) {
        /*
        交换首尾对应的元素
        交换前 1，2，3，4，5
        交换后 5，2，3，4，1
         */

        // 1. 定义数组，存储数据
        int [] arr = {1,2,3,4,5};

        // 2. 利用循环 交换数据
        for(int i=0, j = arr.length-1; i<j; i++, j--){
            // 交换变量i， j 指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            //  break;
            // 原视频中的讲解是最后变成 5，4，3，2， 1； 若要变成 5， 2， 3， 4， 1 可以直接加个break 只循环一次，跳出循环
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
