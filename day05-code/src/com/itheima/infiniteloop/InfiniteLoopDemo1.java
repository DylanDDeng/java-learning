package com.itheima.infiniteloop;

public class InfiniteLoopDemo1 {
    public static void main(String[] args) {
        // for 格式的无限循环
        /*
        for(;;){
            System.out.println("学习");
        }

         */
        while(true){
            System.out.println("学习");
        }
        // 注意事项：
        // 无限循环下面不能再写其他代码，因为循环永远停不下来 ，那么下面的代码永远执行不到
    }
}
