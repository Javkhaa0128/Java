package day30_CustomMethods;
/*
1. create a fumction that can print out the maximum number between two numbers
2. create a fumction that can print out the array of int in descending order
3. create a fumction that can print out the combination of two int arrays
4. step1: create a function that can check if the given int is positive, negative or zero
   step2: Use the above  method to write a program that can check every single
   elements of an array of int     MUST USE for each loop
 */

import java.util.Arrays;
public class WarmUpTasks {

    public static void main(String[] args) {
        maxNum(1,2);

        int arr[]={1,2,5,6,8,7,5,6,4,98};
        printDesc(arr);

        int[] a1 = {1,2,3};
        int[] a2 = {4,5,6};
        combine2Arrays(a1,a2);

        PosNegZero(100);
        System.out.println("================================");
        int[] a3 = {1,2,3,0,0,-1,-2,-3};

        for(int each : a3){
            PosNegZero(each);
        }
    }

    //task01:
    public static void maxNum(int a, int b){
        if(a==b){
            System.out.println("Equal");
            return;
        }
        if(a>=b){
            System.out.println(a+" is maximum");
        }else{
            System.out.println(b+" is maximum");
        }
    }

    //task02:
    public static void printDesc(int[] arr){
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print( arr[i]+" " );
        }
        System.out.println();
    }

    //task03:
    public static void combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];

        int i = 0;
        for(int each : arr1){
           arr3[i] = each;
           i++;
        }

        for(int each : arr2){
            arr3[i] = each;
            i++;
        }
        System.out.println( Arrays.toString( arr3));
    }

    //task04:
    public static void PosNegZero(int num){
        if(num>0){
            System.out.println(num+" is positive");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }


















}
