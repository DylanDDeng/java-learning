package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /*
        打印数组，在同一行 例如{11,22,33,44,55}
         */
        // 1. 定义数组
        int [] arr = {11,22,33, 44, 55};
        printArr(arr);

        /*
        System.out.println("abc"); 先打印abc，再换行
        System.out.print("abc"); 只打印abc，不换行
        System.out.println() 不打印任何数据
         */
    }
    public static void printArr(int[]arr){
        System.out.print("[");
        for (int  i = 0;  i < arr.length;  i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
