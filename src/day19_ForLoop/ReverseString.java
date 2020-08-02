package day19_ForLoop;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Cyber";  // "rebyC"

      //  String result = ""+ str.charAt( str.length()-1) + str.charAt(3) + str.charAt(2) + str.charAt(1)+ str.charAt(0);
        String result = "";

        for( int i = 4; i >= 0; i-- ){
            result += str.charAt(i);
        }

        System.out.println(result);

        System.out.println("================================");

        String str1 = "Javkhlantugs";
        String result1 = "";

        for(int a = str1.length()-1; a >= 0; a--){
            result1 += str1.charAt(a);
        }
        System.out.println(result1);


    }
}
