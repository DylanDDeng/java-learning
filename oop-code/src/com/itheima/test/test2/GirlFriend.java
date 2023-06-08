package com.itheima.test.test2;

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
    public void setName(String name){
        // 等号的左边表示成员位置的name
        this.name = name;
    }
    // 对外提供name属性
    public String getName(){
        return name ;
    }

    // age
    public void setAge(int age){
        if(age >=18 && age <=50){
            this.age = age;
        }else{
            System.out.println("非法数据");
        }
    }

    public int getAge(){
        return age;
    }
    // gender
    public void setGender(String gender){
        this.gender = gender ;
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
