package Office_Hours.Practice_07_14_2020;

public class Unique {
    public static void main(String[] args) {

        String str = "ABABC";
        String expectedResult = "";       //"C"

        for(int j = 0; j <= str.length()-1; j++) {

            char ch = str.charAt(j);     // "A"
            int count = 0;   // frequancy

            for (int i = 0; i <= str.length() - 1; i++) {   // helps us to calcuate the frequancy
                char each = str.charAt(i);
                //  System.out.println(each);   // A B A B C
                if (each == ch) {
                    count += 1;
                }
            }
            if (count == 1) {
                expectedResult += ch;
            }
        }
        System.out.println(expectedResult);









    }
}
