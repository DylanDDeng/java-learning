package com.itheima.twodimensionarr;

public class TwoDimensionDemo3 {
    public static void main(String[] args) {
        /*
        某个商城营业额如下：
        第一季度：22， 66， 44
        第二季度：77， 33， 88
        第三季度： 25， 45， 68
        第四季度： 11， 66， 99
        要求计算每个季度的总营业额 以及全年总营业额
         */
        // 1. 创建二维数组
        int[][] yearArrArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 68},
                {11, 66, 99}
        };
        int yearSum = 0;
        for (int i = 0; i < yearArrArr.length; i++) {
            int sum = getSum(yearArrArr[i]);
            System.out.println("第"+i + "个季度的总营业额为"+sum+"元");
            yearSum += sum ;
        }
        System.out.println("全年的总营业额为"+yearSum+"元");
    }
        // 2. 定义一个方法，计算每个季度的营业额
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum ;




        }

}
