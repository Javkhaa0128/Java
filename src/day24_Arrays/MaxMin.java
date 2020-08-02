package day24_Arrays;

import java.util.Scanner;
/*
asks user how many numbers he wants to enter, an get all the user inputs and
store them into an array variable, then return maximum and minimum numbers
 */
public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i <= n-1; i++){     // get user input and storing them into array
            System.out.println("Enter a number");
            int num = scan.nextInt();
            arr[i] = num;
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i <= arr.length-1; i++){
          if(arr[i] > max){
              max = arr[i];
          }
          if(arr[i] < min){
              min = arr[i];
          }
        }
        System.out.println("Maximum Number: "+max);
        System.out.println("Minumum Number: "+min);














    }
}
