package day29_CustomMethods;

public class Method_Practice {
    /*
1. create a method that can print odd number 1~100 in a same line separated by space
2. create a method that can print even number 1~100 in a same line separated by space
 */
    public static void main(String[] args) {

        oddNumbers();
        System.out.println("Hello");

        evenNUmbers();
    }



    // task1
    public static void oddNumbers(){
        for(int i = 1; i <= 100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //task2
    public static void evenNUmbers(){
        for(int i = 2; i <=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
