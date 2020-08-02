package day22_NestedLoop;
/*
        Write a program that can asks user to enter one string and one char
          and then returns the frequency of str2 in str1
        Ex
              Input: AABAAC
                     A
              Output: 4
         */
public class OccurancesOfChar {
    public static void main(String[] args) {
        String str = "ababc";
        char ch = 'a';

        int count = 0;

        for(int i = 0; i <= str.length()-1; i++){

            char each = str.charAt(i);   // a b a b c

            if(each == ch){
                count += 1;
            }

        }












    }
}
