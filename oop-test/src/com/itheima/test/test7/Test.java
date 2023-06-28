package com.itheima.test.test7;

public class Test {
    public static void main(String[] args) {
        /* 定义一个长度为3的数组，数组存储1-3名学生对象作为初始数据，学生对象的学号，姓名各不相同
        学生的属性：学号，姓名，年龄
        要求1： 再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        要求2：添加完毕后遍历所有的学生信息
        要求3： 通过id删除学生信息 ，如果存在，就删除，如果不存在，就提示删除失败
        要求4：删除完毕后，遍历所有的学员信息




         */
        // 1. 创建一个数组，用来存储学生对象
        Student [] arr = new Student[3] ;
        // 2. 创建学生对象并添加到数组中
        Student stu1 = new Student(1,"张三", 23 );
        Student stu2 = new Student(2,"李四", 24 );
        Student stu3 = new Student(3,"王五", 25 );
        // 添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        // 要求1： 再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student(4,"赵六", 26 );

        boolean flag = contains(arr, stu4.getId());
        if(flag){
            // 已存在 --- 不用添加
            System.out.println("id已存在，请修改id后再添加");
        }else {
            // 不存在 ---- 可以添加
            // 数组满了 --- 需要新数组 + 1  or 没满 可以直接添加
            int count = getCount(arr);
            if(count == arr.length) {
                // 已经存满
                // 创建新数组， 长度  = 老数组+ 1； 老数组添加到新数组中
                //
                Student[]newArr = creatNewArr(arr);
                // 添加stu4
                newArr[count] = stu4;

                // 要求2：添加完毕后遍历所有的学生信息
                printArr(newArr);



            }else {
                // 没有存满
                // [stu1, stu2, null]
                // getCount获取到的是2， 还有一层意思就是下一次添加新的数据，是添加到索引2的位置

                arr[count] = stu4;

                // 要求2：添加完毕后遍历所有的学生信息
                printArr(arr);


            }

        }





    }

    public static void printArr(Student[]arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu  = arr[i];
            if(arr[i] !=null) {
                System.out.println(stu.getId() + ", "+ stu.getName() + "," + stu.getAge());

            }
        }

    }

    // 创建一个新数组， 新数组长度 = 老数组 + 1； 老数组拷贝到新数组中
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];

        // 循环遍历， 老数组添加到新数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;



    }
    // 判断数组中有几个元素
    public static int getCount(Student[]arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null) {
                count++;
            }

        }
        return count;



    }
    public static boolean contains(Student[]arr, int id){
        for (int i = 0; i < arr.length; i++) {
            // 依次获取到数组里的每一个学生对象
            Student stu = arr[i];
            if(stu != null){
                // 获取每个学生对象的id
                int sid = stu.getId();
                // 比较
                if(sid == id){
                    return true ;
                }


            }

        }
        // 当循环结束之后还没找到一样的，才能说明数组中不存在要查找的id
        return false;

        }

    }

