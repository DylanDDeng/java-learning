package com.itheima.test.test7;

public class Test1 {
    public static void main(String[] args) {
        /* 定义一个长度为3的数组，数组存储1-3名学生对象作为初始数据，学生对象的学号，姓名各不相同
        学生的属性：学号，姓名，年龄
        要求1： 再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        要求2：添加完毕后遍历所有的学生信息
        要求3： 通过id删除学生信息 ，如果存在，就删除，如果不存在，就提示删除失败
        要求4：删除完毕后，遍历所有的学员信息
        要求5：查询数组中id为2的学生，如果存在就将他的年龄+1岁


         */
        // 1. 创建一个数组，用来存储学生对象
        Student[] arr = new Student[3];
        // 2. 创建学生对象并添加到数组中
        Student stu1 = new Student(1, "张三", 23);
        Student stu2 = new Student(2, "李四", 24);
        Student stu3 = new Student(3, "王五", 25);
        // 添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        // 要求3： 通过id删除学生信息 ，如果存在，就删除，如果不存在，就提示删除失败

        // 判断 是否存在
        int index = getIndex(arr,2);
        if(index >=0){
            // 找到id在数组中对应的索引
            // 如果存在就删除
            arr[index] = null;
            // 要求4：删除完毕后，遍历所有的学员信息
            printArr(arr);

        }else{
            System.out.println("当前id不存在，删除失败");
        }





    }

    // 找到id在数组中的索引
    public static int getIndex(Student[]arr, int id){
        for (int i = 0; i < arr.length; i++) {
            // 依次得到每一个学生对象
            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return i;
                }

            }
        }
        // 当循环结束之后，还没有找到，就表示不存在
        return -1;

    }

    public static void printArr(Student[]arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu  = arr[i];
            if(arr[i] !=null) {
                System.out.println(stu.getId() + ", "+ stu.getName() + "," + stu.getAge());

            }
        }

    }
}
