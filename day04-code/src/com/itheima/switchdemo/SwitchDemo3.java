package com.itheima.switchdemo;
/*

case 穿透:
如果没有发现break，会继续执行下一个break语句体
 */

public class SwitchDemo3 {
    public static void main(String[] args) {
        int number = 10;
        switch(number){
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                // break;
            case 20:
                System.out.println("number的值为20");
                // break;
            default:
                System.out.println("number的值不是1，10，20");
                // break;

        }

    }
}
