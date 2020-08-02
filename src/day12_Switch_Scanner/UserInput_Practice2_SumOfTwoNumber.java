package day12_Switch_Scanner;
/*  Task2:
write a program that can ask user to enter two number, and the prints the sum of
two number Enter your first number
10
enter your second number
20

 */

import java.util.Scanner;

public class UserInput_Practice2_SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           System.out.println("Enter your first number");
               int num1 = scan.nextInt();

           System.out.println("Enter your second number");
               int num2 = scan.nextInt();
                    String sum = num1 + num2+ " is sum of two numbers";
        System.out.println(sum);


    }

}
