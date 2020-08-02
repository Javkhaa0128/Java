package repl;
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

        int[] nums = {1, 1, 2, 3, 4, 3, 4};


        for(int each : nums){
            int count = 0;
            for(int n : nums){
                if(each == n){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(each);
            }
        }















    }}