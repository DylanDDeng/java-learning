package com.itheima.test;

public class Test9 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用方法前："+ number); // 100
        change(number);
        System.out.println("调用方法后：" + number); // 100 不改变结果

    }
    public static void change(int number){
        number = 200;
    }
}
