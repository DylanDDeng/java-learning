package com.itheima.test.test3;

import com.itheima.test.test3.Phone;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建手机对象
        Phone p = new Phone();
        // 给手机赋值
        p.brand = "小米";
        p.price = 1998.98;

        // 获取 对象的值，并且打印
        System.out.println(p.brand);
        System.out.println(p.price);

        // 调用方法
        p.call();
        p.playGame();

        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price=8999;

        p2.call();
        p2.playGame();


    }

}
