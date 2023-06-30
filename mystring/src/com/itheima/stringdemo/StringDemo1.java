package com.itheima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        // 1. 直接赋值字符串对象
        String s1 = "abc";
        System.out.println(s1);

        // 2.使用new来获取对象
        // 空参
        String s2 = new String();
        System.out.println("@"+s2+"!");


        //
        String s3 = new String("abc");
        System.out.println(s3);


        // 创建一个字符数组，再根据字符数组的内容创建一个新的字符串对象
        char[]chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);

        // 创建一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        // ASCII 码表转换
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);





    }

}
