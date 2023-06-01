package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        /*
        某系统的数字密码(>0)比如1983，采用加密的方式进行传输。
        规则如下：
        每位数加上5
        再对10求余
        最后对所有数字进行反转
        得到一串新数
         */

        // 分析：
        // 1. 把整数每一位放到数组中去
        int [] arr = {1, 9, 8, 3};

        // 2. 加密

        // 每位数加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5 ;
        }

        // 对10取余数
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10 ;
        }

        // 将所有数字反转
        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        // 把数组里的每一个数字进行拼接，变成加密之后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 +arr[i];
        }
        System.out.println(number);



    }
}
