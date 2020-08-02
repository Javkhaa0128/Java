package Office_Hours.Practice_07_13_2020;

public class FrequencyOfChars1 {
    public static void main(String[] args) {
        String str = "OOPQQ";  // "O2P1Q2"
        String nonDup = "";    // "OPQ"

        for(int i = 0; i <= str.length()-1; i++){
            String s = ""+str.charAt(i);     // O O P Q Q
            if(!nonDup.contains(s)){
                nonDup +=""+s;
            }
        }
        System.out.println(nonDup);

        String result = "";

        // nonDup = "OPQ"     str = "OOPQQ"     ==>  O2P1Q2
        for(int j = 0; j <= nonDup.length()-1; j++) {
            char ch1 = nonDup.charAt(j);   // O
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {     // counting frequency of char
                char each = str.charAt(i);  // O O P Q Q
                if (each == ch1) {
                    count += 1;
                }
            }
            result += ""+ch1+count;
        }

        System.out.println(result);




















    }
}
