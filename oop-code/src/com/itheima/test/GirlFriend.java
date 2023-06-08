package com.itheima.test;

public class GirlFriend {
     // 属性
    private String name;
    private int age;
    private String gender;

    // 针对每一个私有化成员变量，提供set 和get 方法
    // set方法给变量赋值
    // get 方法获取值

    // name

    // 赋值
    public void setName(String n){
        name = n;
    }
    // 对外提供name属性
    public String getName(){
        return name ;
    }

    // age
    public void setAge(int a){
        if(a >=18 && a <=50){
            age = a;
        }else{
            System.out.println("非法数据");
        }
    }

    public int getAge(){
        return age;
    }
    // gender
    public void setGender(String g){
        gender = g ;
    }
    public String getGender(){
        return gender;
    }





    // 行为
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }

    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
