package day37_ArrayList;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Collections;

/*
write a program that can find the unique character from a string
        DO NOT USE nested loop
        "AABBCDDEE"
        output: "C"
 */
public class Uniques {
    public static void main(String[] args) {
        String str = "AABBCDDEE";
        String uniques = "";

        ArrayList<Character> list = new ArrayList<>();

        for(char each: str.toCharArray() ){
            list.add(each);
        }

   /*     ArrayList<String> list = new ArrayList<>();

        for(String each : str.split("")){
            list.add(each);
        }
*/
        for(char each : list){
            int count = Collections.frequency(list, each);
            if(count==1){
                uniques += each;
            }
        }
        System.out.println(uniques);






    }
}
