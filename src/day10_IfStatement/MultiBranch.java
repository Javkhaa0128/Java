package day10_IfStatement;

public class MultiBranch {
    public static void main(String[] args) {
        int number = 100;

        if(number>0){
            System.out.println(number +" is positive");
        }

        if(number<0){
            System.out.println(number+" is negative");
        }

        if(number==0){
            System.out.println(number+"is zero");
        }
        System.out.println("===============================================");

        if(number>0){
            System.out.println(number+" is positive");
        }else if(number<0){
            System.out.println(number+" is negative");
        }else{ //number == 0
            System.out.println(number+" is zero");
        }


       /*  ternary: short cut of if & else statements
           int num = 100;
           String result ="";

           if(num%w == 0){
              result = "Even";
           }else{
              result ="Odd";
           }

           ?: if keyword, condition needs to be places before if
           : else


        */



    }
}
