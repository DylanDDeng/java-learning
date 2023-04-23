package test;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        /*
        商场都有VIP会员制，根据不同的会员有不同的折扣
        假设商品的总价为1000.
        键盘录入会员级别，并计算出实际支付的钱。
        会员1级，打9折
        会员2级，打8折
        会员3级，打7折
        非会员：不打折，要打也是打骨折
         */
        // 1. 定义变量记录总价
        int price =  1000;

        // 2. 键盘录入会员的级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入会员的级别");
        int vip = sc.nextInt();

        // 3. 根据级别来计算实际要支付的钱
        if (vip ==1){
            System.out.println("实际支付的钱为" + (price * 0.9));
        }else if(vip==2){
            System.out.println("实际支付的钱为" + (price * 0.8));
        }else if (vip==3){
            System.out.println("实际支付的钱为" + (price * 0.7));
        }else{
            System.out.println("实际致富的钱为" + price);
        }
    }
}
