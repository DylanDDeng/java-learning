package test;

public class test2 {
    public static void main(String[] args) {
        // 判断红绿灯
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;

        if(isLightGreen){
            System.out.println("GoGoGo!!");
        }
        if(isLightYellow){
            System.out.println("slow!!");
        }
        if (isLightRed){
            System.out.println("stop");
        }

    }
}
