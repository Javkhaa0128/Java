package day29_CustomMethods;
/*
write a program that can print out the unique values from a String Array
   Ex:
    if arr -> {"A","A","B","C","C"}
    output: B
    MUST USE for each loop
 */

public class Uniques {
    public static void main(String[] args) {

        String[] arr = {"A","B","B","C"};

        for(String a : arr) {           // gets each of element

            int count = 0;
            for (String each : arr) {    // gets the frequency of the element
                if (a.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {            // unique
                System.out.println(a);
            }
        }








    }
}
