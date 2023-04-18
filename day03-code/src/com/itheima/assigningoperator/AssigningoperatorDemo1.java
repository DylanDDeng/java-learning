package com.itheima.assigningoperator;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        // +=
        // 规则： 将左边和右边进行相加，然后把结果赋值给左边
        int a = 10;
        int b = 20;
        a += b; // a = a+b
        System.out.println(a); //30
        System.out.println(b); //20

        // 细节：
        // 包含强制类型转换
        short s = 1;
        s += 1;
        System.out.println(s); // 2
    }
}
