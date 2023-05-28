package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*
        在唱歌比赛中，6名评委给选手打分，分数范围是【0-100】之间的整数；
        选手最后得分为：去掉最高分，去掉最低分的4个评委的平均分，请完成上述过程并计算出选手的得分
         */

        // 1. 定义一个数组，用来存储6名评委的打分 （0-100）
        int[] scoreArr = getScore();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }

        // 2. 求出数组中的最大值
        int max = getMax(scoreArr);

        // 3.求出数组中的最小值
        int min = getMin(scoreArr);

        // 4. 求出数组中6个分数的和
        int sum = getSum(scoreArr);

        // 5. (总和 - 最大值 - 最小值）/ 4
        int answer = (sum - min - max) / (scoreArr.length - 2);
        System.out.println("分数为：" + answer);

    }

    // 录入分数
    public static int[] getScore() {
        // 1. 定义数组 存储分数
        int[] scores = new int[6];
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围，继续录入， 当前的i为： " + i);
            }
        }
        return scores;
    }

    // 得到最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    // 得到最小值
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    // 数组求和
    public static int getSum(int[]scoreArr){
        int sum = 0 ;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }

}

