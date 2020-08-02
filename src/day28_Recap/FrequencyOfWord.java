package day28_Recap;
// write a prog return the frequency of a word from string

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "javajava";

        // substring(0, 4) ==> java
        // Substring(1, 5) ==> avaj
        // Substring(2, 6) ==> vaja
        // Substring(3, 7) ==> ajav
        // Substring(4, 8) ==> java

        //Substring(i, i+4)

        int count = 0;
        for(int i = 0; i <= str.length()-4; i++){     //i:0, 1, 2, 3, 4,

            String s = str.substring(i, i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }
        }

        System.out.println(count);















    }
}
