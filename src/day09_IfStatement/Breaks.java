package day09_IfStatement;

public class Breaks {
    public static void main(String[] args) {
        String itsBreakTime = "yes";

        if(itsBreakTime == "yes"){
            System.out.println("Take 15min of break");
        }else{
            System.out.println("Continue the class");
        }
        System.out.println("=============================");
        int a = 100;
        int b = 200;

        boolean aMax = a > b;
        boolean bMax = b > a;

        if(aMax){
            System.out.println(a+" is the greater number");
        }else{
            System.out.println(b+" is the greater number");
        }




    }
}
