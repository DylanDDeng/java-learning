package com.itheima.arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 动态初始化
        /*
        定义一个数组，用来存班级50个学生的姓名，
        姓名未知， 等学生报道之后再进行添加
         */
        String [] arr = new String[50];

        // 添加学生
        arr[0] = "zhangsan";
        arr[1] = "lisi";

        // 打印
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]); // null

        // 整数默认初始化值为0
        // 小数默认初始化值为0.0
        // 字符默认初始化值为空格
        // 布尔默认初始化值为false
        // 引用数据类型默认初始化值为null

        int [] arr2 = new int [3];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

    }
}
