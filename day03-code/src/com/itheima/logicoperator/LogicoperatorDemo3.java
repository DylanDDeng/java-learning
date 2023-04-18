package com.itheima.logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        // 1. 短路与
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);

        // 2. 短路或
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);

        // 3. 短路逻辑运算符具有短路效果
        // 当左边的表达式能确定最终的结果，那右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b<5;
        System.out.println(result); //false
        System.out.println(a); // 11
        System.out.println(b);  // 10
    }
}
