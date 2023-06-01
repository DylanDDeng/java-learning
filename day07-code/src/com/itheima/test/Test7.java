package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        // 把整数上的每一位添加到数组中

        // 1.计算数的长度
        int number = 12345;
        // 记录一个临时变量，记录number的值
        int temp = number;

        int count  = 0 ;
        while(number !=0){
            number /= 10;
            count ++ ;
        }
        System.out.println("输入的数字的长度为" + count);

        // 2. 定义数组
        // 动态初始化
        int [] arr = new int [count];
        int index = arr.length -1 ;
        // 3. 把整数中的每一位数都添加到数组里
        while(temp!=0){
            int ge = temp % 10;
            temp /= 10;
            arr[index] = ge;
            index --;
        }
        // 验证
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }


    }
}
