package com.itheima.test;
import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        /*
        直播抽奖，分别有{2, 588, 888, 1000, 10000}五个奖金
        用代码模拟抽奖，打印每个奖项，奖项的出现顺序要随机且不能重复

         */
        // 1. 定义数组
        int [] arr = {2, 588, 888, 1000, 10000};

        // 2. 定义新数组， 存储抽奖的结果
        int [] newArr = new int[arr.length]; 
        
        // 3. 抽奖
        Random r = new Random();

        for (int i = 0; i < 5;) {
            int randomIndex = r.nextInt(arr.length);
            // 获取奖项
            int prize = arr[randomIndex] ;
            // 判断当前的奖项是否存在，如果存在就重新抽取，不存在就有效奖项
            boolean flag = contains(newArr, prize);
            if(!flag){
                // 把当前抽取到的奖项添加到newArr中
                newArr[i] = prize;
                i++;

            }

        }
        // 4. 遍历newArr
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }

    // 判断 奖金是否已经存在
    public static boolean contains(int[]arr, int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == prize){
                return true;
            }

        }
        return false; 

    }
}
