package day13_Scanner;
/*
Scanner methods:
      nextByte(): byte
      nextInt(): int
      nextlong(): long
      nextDouble(): double

      nextBoolean(): boolean
      next(): returns the user input as string
                "Today is Tuesday" ==> today

 */
import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Car has 4 doors");
           boolean result = scan.nextBoolean();

        System.out.println(result);


    }
}
