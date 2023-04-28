package com.itheima.infiniteloop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i == 3){
                continue; // 结束本次循环，继续下次循环，不跳出循环
            }
            System.out.println("小老虎在吃第"+ i + "个包子");
        }
    }
}
