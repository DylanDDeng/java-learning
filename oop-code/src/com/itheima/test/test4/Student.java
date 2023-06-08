package com.itheima.test.test4;

public class Student {
   private String name;
   private int age;

   // 构造函数
   public Student(){
       System.out.println("看看我执行了嘛");
   }

   public Student(String name, int age){
       this.name = name;
       this.age = age;
   }

   public String getName() {
       return name;

   }

   public void setName(String name) {
       this.name = name;
   }

   public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }





    }

