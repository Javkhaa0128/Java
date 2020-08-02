package day23_Arrays;
/*
write a program that can return the frequency of every single character from the string:
   ex:
     str1 = "aabbccaa";
     output: a4b2c2

     HINT:
       easier approach:
          1. remove duplicate ==> st2 = "abc"
          2. then find each of str2 'character' frequancy str1 ==> 4,2,2
          3. result: a4b2c2
  previos section we learned to find the frequency of one character, you will need ro repeat the same step
 */

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "ABAB";   //"A2B2"
        String nonDup = "";    // "AB"
        String result = "";    // "A2B2"

        for(int i = 0; i <= str.length()-1; i++){
            String ch = ""+ str.charAt(i);       // A, B, A, B
            if(!nonDup.contains( ch )){
                nonDup += ch;
            }
        }

        System.out.println(nonDup);

        // str="ABAB"       nonDup="AB"

        for(int j =0; j<=nonDup.length()-1; j++) {


            char ch = nonDup.charAt(j);  // A
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count += 1;
                }

            }
            result += "" + ch + count;
        }
        System.out.println(result);

























    }
}
