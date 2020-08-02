package day14_Recap;

import java.util.Scanner;

public class nextLine_VS_rest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
           int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Full Name: ");
           String fullName = scan.nextLine();




;   }
}
