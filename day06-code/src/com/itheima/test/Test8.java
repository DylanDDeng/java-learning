package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        /*
        定义一个方法 CopyofRange(int[]arr, int from, int to)
        功能：
        将数组arr中从索引from（包含from） 开始，到索引to结束，（不包含to）的元素复制到新数组中，将新数组返回
         */
        //1. 定义数组
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 2. 调用
        int [] copyArr = copyOfRange(arr, 3, 7);
        // 3. 遍历
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }


    }
    public static int[] copyOfRange(int[]arr, int from, int to){
        // 1. 定义数组：

        int [] newArr = new int[to - from];

        int index = 0;
        // 2. 拷贝
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index ++;

        }
        return newArr;

    }
}
