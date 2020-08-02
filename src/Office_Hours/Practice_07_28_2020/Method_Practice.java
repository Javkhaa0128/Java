package Office_Hours.Practice_07_28_2020;

import java.util.ArrayList;

public class Method_Practice {
    public static void main(String[] args) {
        String name = "Javkhlantugs";
        String reveredName = reverseStr(name);

        System.out.println(reveredName);
        System.out.println( reverseStr("Javkhlantugs"));

        isPalindrome("Level");

        System.out.println("=======================================");
        String[] names = {"Aslam","Ramazan","Alex","Erfan","Aalia","Ayhan"};
        ArrayList<String> nameList = new ArrayList<>();

        for(String each : names){
            nameList.add( reverseStr(each) );
            //     System.out.println(  reverseStr(each)   )
            //     isPalindrome( each );
        }
        System.out.println(nameList);
    }






    public static String reverseStr(String str){
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static void isPalindrome(String str){
        String reversedStr = reverseStr(str);
        boolean palindrome = str.equalsIgnoreCase(reversedStr);

        System.out.println(  (palindrome)?str+" Is Palindrome":str+" Is not Palindrome"    );


    }











}
