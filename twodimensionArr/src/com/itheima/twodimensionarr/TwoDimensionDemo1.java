package com.itheima.twodimensionarr;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        // 二维数组静态初始化
        int [][] arr = new int[][]{{1,2,3}, {2,3,4}};
        // 简化
        int [][] arr2 = {{1,2,3}, {2,3,4}};

        // 建议这样定义二维数组
        int[][]arr3 = {
                {1,2,3},
                {2,3,4}
        };

        // 获取元素
        // System.out.println(arr3[0]);  //  获取二维数组中一维数组地址值
        System.out.println(arr3[0][0]); // 获取二维数组中的一维数组的第一个元素 1

        // 二维数组遍历
        // 外循环： 遍历一维数组
        for (int i = 0; i < arr3.length; i++) {
            // 遍历一位数组中的元素
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();


        }

    }
}
