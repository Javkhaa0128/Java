package day14_Recap;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gender: ");
             String gender = scan.next();

        System.out.println("Enter your age: ");
             int age = scan.nextInt();
                                     scan.nextLine();

        System.out.println("Enter your country name: ");
             String  countyName = scan.nextLine();

        System.out.println("Enter your zip code: ");
             int zipCode = scan.nextInt();

        System.out.println("Enter your full name: ");
             String fullName = scan.nextLine();
                                     scan.nextLine();

        System.out.println("Enter your company name: ");
            String fullCompanyName = scan.nextLine();

    }
}
/*
task:
  gender             next
  age                nextInt
  country name       nextLine
  zip code           nextInt
  full name          nextLine
  full company name  nextLine

 */