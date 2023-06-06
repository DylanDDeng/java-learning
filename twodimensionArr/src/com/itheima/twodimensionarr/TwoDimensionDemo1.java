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
    }
}
