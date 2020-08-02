package day26_MultiDimensionalArray;
/*
    write a prog that can return the number of appearances of java and python anywhere in
    the sentence:
 */

import java.util.Arrays;

public class Java_Python {
    public static void main(String[] args) {
        String sentence = "I love Java, Python is cool Javascript";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        int countJava = 0;
        int countPython = 0;

        for(String each : words){
            if(each.toLowerCase().contains("Java")){
                countJava++;
            }else if(each.toLowerCase().contains("Python")){
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);

        /*
        str = JavaScript

        str.equals("Java")   ==> false
        str.contains("Java") ==> true

         */















    }
}
