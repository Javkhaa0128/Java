package day21_Loops;
// 1. write a prog that asks user to enter 5 number and returns and maximum number
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648;

        for(int i = 1; i <= 5; i++){

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num > max){
                max = num;
            }

        }
        System.out.println(max);






    }

}
