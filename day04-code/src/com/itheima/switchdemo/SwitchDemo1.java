package com.itheima.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        // 兰州拉面，武汉热干面，北京炸酱面，陕西油泼面
        // 1. 定义想吃的面
        String noodles = "武汉热干面";
        switch (noodles) {
            case "兰州拉面" -> System.out.println("吃兰州拉面");
            case "武汉热干面" -> System.out.println("吃武汉热干面");
            case "北京炸酱面" -> System.out.println("吃北京炸酱面");
            case "陕西油泼面" -> System.out.println("吃陕西油泼面");
            default -> System.out.println("吃方便面");
        }

    }
}
