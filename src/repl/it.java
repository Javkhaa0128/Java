package repl;

import day45_Constructor.Constructor;

import java.util.*;
/*
Warmup tasks:
    1. write a method that can returne the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
    2. write a return method that accepts two numbers and an operator, then returns calculation result.
             if the oerator is invalid, return zero
             otherwise return the result
    3. write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array
        Ex:
            int[] arr = {1,2,3};
            int num = 4;
            addElement(arr, num); ===> {1,2,3,4}

 */


public class it {
    public static void main(String[] args) {

  /*     String a = "AAABBCDD";      // A3B2C1D2

        String nonDup = "";


        String[] eachChar = a.split("");



            for(String each : eachChar){
                if(!nonDup.contains(each)){
                    nonDup += each;
                }
            }

   */

   //     "abc","cab" => true
    //    "abc","cbb" => false

        String a = "abc";
        String b = "abb";

        System.out.println(same(a,b));























    }
    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();

        char[]  ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String a1="", a2="";

        for(char each: ch1)

            a1 +=each;



        for(char each: ch2)

            a2 +=each;



        return  a1.equals(a2) ;

    }}






