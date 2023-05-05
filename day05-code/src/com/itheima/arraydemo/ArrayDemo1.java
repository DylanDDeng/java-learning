package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 格式：
        // 静态初始化：
        // 数据类型 [] 数组名 = {元素1， 元素2,...}


        // 需求1： 定义数组存储4个学生的年龄
        int[] arr1 = new int[]{11, 12, 13, 14}; // 格式1
        int[] arr2 = {11, 12, 13, 14};  // 格式2

        // 需求2： 定义数组存储3个学生姓名
        String[] arr3 = new String[]{"zhangsan", "lisi", "wangwu"};
        String[] arr4 = {"zhangsan", "lisi", "wangwu"};

        // 需求3： 定义数组存储4个学生的身高
        double[] arr5 = new double[]{1.93, 1.75, 1.81, 1.80};
        double[] arr6 = {1.93, 1.75, 1.81, 1.80};



    }
}
