package com.itheima.test.test4;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        // 调用空参构造
        // Student s = new Student();
        Student s = new Student("zhangsan", 24);
        System.out.println(s.getName());
        System.out.println(s.getAge());



    }
}
