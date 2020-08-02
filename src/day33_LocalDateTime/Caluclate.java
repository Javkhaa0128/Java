package day33_LocalDateTime;

public class Caluclate {
    /*
    1. create a method that can calculate the addition of two int
    2. create a method that can calculate the addition of two decimals

    3. create a method that can calculate the multiplication of two int
    4. create a method that can calculate the multiplication of two decimals
     */
    public static void main(String[] args) {
        double a = 10;
        int b = 20;
        System.out.println(addition(a,b));

        float num1 = 10;
        float num2 = 9;
        System.out.println(addition(num1,num2));

        System.out.println(addition(90,10));

        long l1 = 100;
        long l2 = 200;
        System.out.println(multiplication(l1,l2));


    }

    public static int addition(int a, int b){
        return a+b;
    }

    public static double addition(double a, double b){
        return a+b;
    }



    public static int multiplication(int a, int b){
        return a * b;
    }

    public static double multiplication(double a, double b){
        return a * b;
    }








}
