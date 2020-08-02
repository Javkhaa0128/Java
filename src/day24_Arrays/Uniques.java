package day24_Arrays;
/*
write a prog that can find the unique characters from string
 */

public class Uniques {
    public static void main(String[] args) {
        String str = "aabcc";

        String unique = "";   // "b"
        for(int i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            int first = str.indexOf(ch);
            int last = str.lastIndexOf(ch);

            if(first==last){
                unique += ch;
            }
        }
        System.out.println(unique);








    }
}
