package com.itheima.arithmeticoperator;

import java.sql.SQLOutput;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);
        // -
        System.out.println(3 - 2);
        // *
        System.out.println(3 * 2);

        // 如果在计算的时候有小数参与
        // 结论：
        // 在代码中如果有小数参与计算，结果是有可能不精确的
        System.out.println(1.1 + 2.1);
        System.out.println(1.3 * 1.3);
        System.out.println(1.3 - 1.0);
    }
}


