package day29_CustomMethods;

import java.util.Scanner;

public class MethodWithParameter {


    public static void main(String[] args) {

        printHello(5);

        System.out.println("================================================");
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter birth year and current year");

        age(scan.nextInt(), scan.nextInt());

    }



    public static void printHello(int numberOfTimes){

        for(int i = 0; i<numberOfTimes; i++){
            System.out.println("Hello World");
        }
    }


    public static void age(int birthYear, int currentYear) {
        if (currentYear < birthYear) {
            System.out.println("Invalid entry");
        } else {
            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");
        }
    }
}

/*
 task3: create a method that can calculate the age of the person
 */

/*
task7: create a method that can reverse any String
 */
