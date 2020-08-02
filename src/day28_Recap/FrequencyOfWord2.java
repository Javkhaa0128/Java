package day28_Recap;

import java.util.Scanner;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String word = scan.next();
        int length = word.length();


        int count  = 0;
        for(int i = 0; i <= str.length()-length; i++){
            String a = str.substring(i, i+length);
            if(a.equalsIgnoreCase(word)){
               count++;
            }
        }

        System.out.println(count);













    }
}
