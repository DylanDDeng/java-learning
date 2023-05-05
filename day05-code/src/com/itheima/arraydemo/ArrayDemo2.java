package com.itheima.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        // 获取数组中的第一个元素
        int number = arr[0];
        System.out.println(number); // 1

        System.out.println(arr[1]); //2

        // 把数据存储到数组中
        arr[0] = 100;
        System.out.println(arr[0]); // 100
    }
}
