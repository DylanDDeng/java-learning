package test;

public class test17 {
    public static void main(String[] args) {
        // 1. 定义一个变量， 记录山峰的厚度
        double height = 8844430;

        // 2. 定义一个变量来记录纸张的初始厚度
        double paper = 0.1;

        // 3. 定义一个变量统计次数
        int count = 0;

        // 4. 循环折叠纸张，只要纸张的厚度小于山峰的高度，那么循环就继续
        while(paper < height){
            paper *= 2;
            count ++ ;
        }

        System.out.println(count);
    }
}
