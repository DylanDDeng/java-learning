package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求： 把一个数组中的元素复制到另一个新数组中去。
         */

        // 1. 定义一个数组
        int [] arr = {1, 2, 3, 4, 5};
        // 2. 定义一个新数组 
        int [] newArr = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
