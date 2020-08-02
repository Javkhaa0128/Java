package day19_ForLoop;

public class PalindromeTest {
    public static void main(String[] args) {

        String str = "kayak";
        String reverseStr = "";

        for(int i = str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
           // reverseStr += str.substring(i, i+1);
        }
        System.out.println(reverseStr);
        System.out.println(str.equals(reverseStr));





    }
}
