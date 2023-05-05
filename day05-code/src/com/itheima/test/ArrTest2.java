package com.itheima.test;

public class ArrTest2 {
    public static void main(String[] args) {
        // 统计个数
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 ==0){
                count ++;
            }
        }
        // 打印个数
        System.out.println(count);
    }
}
