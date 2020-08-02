package day24_Arrays;

import java.util.Arrays;
/*   str.toCharArray() returns char array.

     split(value): returns String Array, splits the string by given value
         String sentence = "Java is cool";
            sentence.split(" ") ==> ["Java", "is", "cool"]
 */
public class String_Methods {
    public static void main(String[] args) {
        String str = "ABCD";
        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("==============================================");

        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray();  // [D, C, E, B, A]
        char[] ch2 = str2.toCharArray();  // [A, D, C, B, E]

        Arrays.sort(ch1);  // [A,B,C,D,E]
        Arrays.sort(ch2);  // [A,B,C,D,E]

        boolean r1 = Arrays.equals(ch1, ch2);
        System.out.println(r1);

        System.out.println("=======================================");

        String sentence = "I love Programming Language";

        // Language Programing love I

       String[] words = sentence.split(" ");    // { I, love, Programming, Language }
        System.out.println( Arrays.toString(words));

        for(int i = words.length-1; i>=0; i--){
            System.out.print( words[i]+" ");
        }
        System.out.println();

        System.out.println("===========================================");
        String s = "JAVA";
        String[] arr = s.split("");     // every single elements are string
        System.out.println(Arrays.toString(arr));

        char[] c = s.toCharArray();  // every single elements are char
        System.out.println(Arrays.toString(c));



















    }
}
