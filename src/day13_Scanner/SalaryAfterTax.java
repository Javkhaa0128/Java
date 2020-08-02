package day13_Scanner;
/*
1. write program that can calculate the state tax, federal tax and salary after tax
           needed info:
                annual salary
                state tax rate
                federal tax rate
            MUST use scanner

 */

import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

         System.out.println("Enter your annual salary: ");
             int salary = input.nextInt();

        System.out.println("Enter your state tax rate: ");
             double stateTaxRate = input.nextDouble();
             double stateTax = salary * stateTaxRate;

        System.out.println("Enter your federal tax rate: ");
             double federalTaxRate = input.nextDouble();
             double federalTax = salary * federalTaxRate;

             double salaryAfterTax = salary - stateTax - federalTax;

        System.out.println("Your annual salary: $"+salary);
        System.out.println("Your state tax: $"+stateTax);
        System.out.println("Your federal tax: $"+federalTax);
        System.out.println("Your salary after tax: $"+salaryAfterTax);

    }
}
