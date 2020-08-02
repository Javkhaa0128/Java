package day16_String;

import java.util.Scanner;

public class Substring_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first word");
        String word1 = scan.next();           // apple
        System.out.println("Enter a second word");
        String word2 = scan.next();           // banana

        String result = word1.substring(1) + word2.substring(1);

        System.out.println(result);









    }
}
