package day09_IfStatement;

public class Minimum {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aIsMin = a < b && a < c;

        boolean bIsMin = aIsMin == false && b < c;

        boolean cIsMin = !aIsMin && !bIsMin;

        double minimum = 0;

        if(aIsMin){
                minimum = a;
        }
        if(bIsMin){
                minimum = b;
        }
        if(cIsMin){
                minimum = c;
        }
        System.out.println(minimum+" is the minimum number");




    }
}
