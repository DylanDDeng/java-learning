package com.itheima.test.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    // 空参
    public Role(){

    }

    // 全参
    public Role(String name, int blood){
        this.name = name;
        this.blood = blood;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getBlood(){
        return blood;
    }

    public void setBlood(int blood){
        this.blood = blood;
    }

    // 定义一个方法攻击别人
    // r1 攻击r2
    // r1 是方法调用者
    public void attack(Role role){
        // 计算伤害 1~20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        // 挨揍的人的剩下的血量
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0: remainBlood;
        role.setBlood(remainBlood);

        // this表示方法调用者
        System.out.println(this.getName() + "举起拳头打了" + role.getName() +  "一下" + "造成了" + hurt + "点伤害"+ role.getName() + "还剩下"+ remainBlood + "血量");

    }



}
