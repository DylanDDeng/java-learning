package com.itheima.twodimensionarr;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        // 二维数组动态初始化

        // 1.利用动态初始化格式创建二维数组
        int [][]arr = new int [3][5]; // 二维数组中有3个一维数组，每个一维数组中有5个int类型的元素
        // 赋值
        arr[0][0] = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
