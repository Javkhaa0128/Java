package day20_WhileLoops;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {

        int num1 = 1;
        while(num1 <= 5){
            System.out.println("Javkhlantugs");
            num1++;
        }
        System.out.println("================================");

        String str = "Cybertek";
        //            01234567

        String result = "";
        int index = str.length()-1;
        while(index >= 0){
            result += str.charAt(index);

            index--;
        }
        System.out.println(result);    // ketrebyC


/*
        String name = "Javkhlantugs";
        String reverse = "";
        int i = name.length()-1;
        while(i <= name.length()-1){
            reverse += (char)name.length()-1;

            System.out.println(reverse);
            i--;
        }

 */









    }
}
