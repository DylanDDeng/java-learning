package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo5 {
    public static void main(String[] args) {
        // ++ 和 --
        // a ++ 和 ++a 不赋值的时候效果一致。

        int a = 10;
        a++;
        System.out.println(a); //11
        ++a;
        System.out.println(a); //12
        // a ++ 和 ++a 不赋值的时候效果一致。

        a--;
        System.out.println(a); //11
        --a;
        System.out.println(a); //10
    }
}
