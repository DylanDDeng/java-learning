package com.itheima.switchdemo;

/*
    default的位置和省略
    1. 位置：default不一定是写在最下面，我们可以写在任意位置，只不过习惯写在最下面
    2. 省略： default可以省略，语法不会报错，但是不建议省略
 */

public class SwitchDemo2 {
    public static void main(String[] args) {
        int number = 100;
        switch(number){
            case 1 -> System.out.println("number的值为1");
            case 10 -> System.out.println("number的值为10");
            case 20 -> System.out.println("number的值为20");
            default -> System.out.println("没有number的值");
        }

    }
}
