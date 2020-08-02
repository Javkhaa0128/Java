package day08_LogicalOperators;

public class Practice4 {
    public static void main(String[] args) {

        double aa = 20;
        double bb = 80;
        double cc = (aa + bb) * 25;
        double remainder = cc % 40;
        boolean dd = remainder <= 20;

        System.out.println(dd);          // true

    }
}
/*  single if: conditions

        if(Boolean) {   codes;   }

        if boolean is true: codes in if statement get executed
        if boolean is false: codes in if statemen WILL NEVER gets executed

 */