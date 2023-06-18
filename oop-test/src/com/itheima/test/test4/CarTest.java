package com.itheima.test.test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // 1. 创建数组
        Car [] arr = new Car[3];

        // 2.创建汽车对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            // 创建汽车对象
            Car c = new Car();
            // 录入品牌
            System.out.println("请输入品牌");
            String brand = sc.next();
            c.setBrand(brand);
            // 录入价格
            System.out.println("请录入价格");
            int price = sc.nextInt();
            c.setPrice(price);

            // 录入颜色
            System.out.println("请录入颜色");
            String color = sc.next();
            c.setColor(color);

            // 把汽车对象添加到数组中去
            arr[i] = c;


        }
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
            System.out.println(arr.length);
        }
    }
}
