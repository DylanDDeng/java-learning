package test;

public class test18 {
    public static void main(String[] args) {
        /* 需求： 给一个整数 x:
        如果是回文数，则打印true， 如果不是，则返回false；
        解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
        例如：121是回文，而123不是。
         */
/*
        // 1. 定义数字
        int x = 12;
        // 2. 获取个位
        int ge = x % 10;
        // 3. 获取十位
        int shi = x / 10 % 10;

        // 拼接
        int result = ge * 10 + shi;

 */
        int x = 121;
        // 定义一个临时变量用于记录x原来的值
        int temp = x;
        // 记录倒过来后的值
        int num = 0;
        // 利用循环
        while(x != 0){
            // 从右往左获取每一位数字
            int ge = x % 10;
            //
            x = x/10;
            //
           num =  num * 10 + ge;

        }
        // 比较
        System.out.println(num == temp);

    }
}
