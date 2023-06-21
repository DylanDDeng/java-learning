package com.itheima.test.test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        // 1. 定义数组
        GirlFriend [] arr = new GirlFriend[4];

        // 2. 创建女朋友对象
        GirlFriend gf1 = new GirlFriend("小诗诗", 18, "萌妹子","吃零食");
        GirlFriend gf2 = new GirlFriend("小丹丹", 19, "萌妹子","玩游戏");
        GirlFriend gf3 = new GirlFriend("小慧慧", 20, "萌妹子","看书，学习");
        GirlFriend gf4 = new GirlFriend("小莉莉", 21, "憨妹子","睡觉");

        // 3.把对象添加到数组中
        arr[0] = gf1;
        arr[1]= gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        // 4. 求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum += gf.getAge();

        }
        // 5. 求平均值
        int avg = sum / arr.length;

        // 6. 统计年龄比平均值小的有几个，打印他们的信息
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge()<avg){
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getHobby());
                count ++;
            }
        }
        System.out.println(count + "个");


    }
}
