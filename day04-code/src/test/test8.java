package test;

public class test8 {
    public static void main(String[] args) {
        boolean isLightGreen = false;
        boolean isLightYellow = true;
        boolean isLightRed = false;

        if(isLightGreen){
            System.out.println("GoGoGo");
        }else if (isLightYellow){
            System.out.println("Slow");
        }else if(isLightRed){
            System.out.println("Stop");
        }
    }
}
