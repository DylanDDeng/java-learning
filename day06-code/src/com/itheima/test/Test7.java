package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        /*
        判断数字是否存在数组中
         */

        // 1. 定义数组
        int [] arr = {1, 5, 8, 12, 56, 89, 34, 67 };

        // 2. 判断数字是否存在数组中
        boolean flag = contains(arr, 90);
        System.out.println(flag);
    }
    public static boolean contains(int[] arr, int num){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        // 想明白什么时候才return false
        // 是所有数组中的数字都遍历一遍之后才返回false
        return false;
    }
}
