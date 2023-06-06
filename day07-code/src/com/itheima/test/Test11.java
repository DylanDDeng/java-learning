package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        // 1. 生成随机中奖号码
        int[] arr = createNumber();

        System.out.println("===================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("==========");

        // 2. 输入中奖号码（红球 + 蓝球）
        int [] userInputArr = userInput();

        // 3. 判断中奖情况
        // 红球 蓝球
        int redCount = 0;
        int blueCount = 0;

        // 判断红球

        for (int i = 0; i < userInputArr.length-1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length-1; j++) {
                if(redNumber == arr[j]){
                    redCount++;
                    break;

                }
            }
        }

        // 判断蓝球
        int blueNumber = userInputArr[userInputArr.length-1];
        if(blueNumber == arr[arr.length-1]){
            blueCount++;
        }

        // 根据红球的个数和篮球的个数来判断中奖情况
        if(redCount ==6 && blueCount==1){
            System.out.println("恭喜你，中奖1000万");
        }else if(redCount==6 && blueCount==0){
            System.out.println("恭喜你，中奖500万");
        }else if(redCount==5 && blueCount==1){
            System.out.println("恭喜你，中奖3000块");
        }else if((redCount ==5 && blueCount ==0) || (redCount ==4 && blueCount ==1)){
            System.out.println("恭喜你，中奖200块");
        }else if ((redCount ==4 && blueCount ==0) || (redCount ==3 && blueCount ==1)){
            System.out.println("恭喜你，中奖10块");
        }else if ((redCount ==2 && blueCount ==1) || (redCount ==1 && blueCount ==1) || (redCount ==0 && blueCount ==1)){
            System.out.println("恭喜你，中奖5块");
        }else{
            System.out.println("谢谢惠顾");
        }


    }
    public static int[] userInput(){
        // 创建数组，用于添加用户购买的中奖号码
        int [] arr = new int[7];

        // 利用键盘输入
        Scanner sc =  new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" +(i+1)+"个红球号码");
            int redNumber = sc.nextInt();
            // 红球号码 在1-33之间，唯一不重复
            if(redNumber>=1 && redNumber<=33){
                boolean flag = contains(arr, redNumber);
                if (!flag){
                    // 不存在
                    arr[i] = redNumber;
                    i++;

                }else{
                    // 存在
                    // 给提示
                    System.out.println("当前红球号码已存在，请重新输入");
                }

            }else{
                System.out.println("红球号码超出范围");
            }
        }
        // 输入蓝球号码 1-16
        System.out.println("请输入蓝球号码");
        while(true){
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 && blueNumber <=16){
                arr[arr.length-1] = blueNumber;
                break;
            }else{
                System.out.println("当前蓝球号码超出范围");
            }
        }
        return arr;



    }
    public static int[] createNumber(){
        int [] arr = new int[7];

        // 随机生成号码并添加到数组里
        // 红球：不能重复， 蓝球可以跟红球重复
        Random r = new Random();
        for(int i =0; i<6;){
            int redNumber = r.nextInt(33)+1;
            boolean flag = contains(arr, redNumber);
            if(!flag){
                // 把红球号码添加到数组中
                arr[i] = redNumber;
                i++;
            }

        }
        // 生成随机蓝球号码添加到数组中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length-1] = blueNumber;
        return arr;
    }

    public static boolean contains(int[]arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;

    }
}
