package com.itheima.test;

public class GirlFriendTest {
    public static void main(String[] args) {
        // 创建女朋友的对象
        GirlFriend gf1 = new GirlFriend();
        //赋值
        gf1.setName("sso");
        gf1.setAge(18);
        gf1.setGender("男");



        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();


    }
}
