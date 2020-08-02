package day24_Arrays;

public class Uniques2 {
    public static void main(String[] args) {

        String str = "aabcc";
        String expectedResult = "";

        for(int j = 0; j<= str.length()-1; j++) {  // because we need the frequency of every single character

            char ch1 = str.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                char each = str.charAt(i);
                if (ch1 == each) {
                    count++;
                }
            }
            if(count ==1){
                expectedResult += ch1;
            }
        }
        System.out.println(expectedResult);













    }
}
