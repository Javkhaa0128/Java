package day11_NestedIf_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num>0){
            result = "Positive";
        }else if(num<0){
            result = "Negaitive";
        }else{
            result = "Zero";
        }
        System.out.println(result);
        String result2 = (num>0) ? "Positive" : (num<0)? "Negative" : "Zero";
        System.out.println(result2);
        System.out.println("==================================================");
// write a number that can compare two number    ex: a=10, b=20 output: a is greater
 //


        int a = 10;
        int b = 20;
        String result1 = "";
        if(b<a){
            result1 = "a is greater";
        }else{
            result1 = "b is greater";
        }
        System.out.println(result1);

        String result7 =(b<a)? "a is greater" : "b is greater";
        System.out.println(result7);
        System.out.println("===================================");
        int month = 3;

        boolean days28 = month == 2;    // for the months that has 28 days
        boolean days30 = month == 4|| month == 6|| month ==9|| month ==11;
        boolean invalid = month < 1 || month > 12;
        String result8 = "";

        if(days28){
            result8 = "28days";
        }else if(days30){
            result8 = "30days";
        }else if(invalid){
            result8 = "invalid";
        }else{
            result8 = "days31";
        }
        System.out.println(result8);

        String result9 = (days28) ? "day 28" : (days30) ? "day 30" : (invalid) ? "invalid" : "31 day";
        System.out.println(result9);

    }
}
