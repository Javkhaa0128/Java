package day11_NestedIf_Ternary;

public class DaysInMonth {
    public static void main(String[] args) {
        /* write a program that can find the number of days in a month
   (Assume that Feb has 28 days)
   HINT:
   28 days : 2
   30 days : 4,6,9,11
   31 days : 1,3,5,7,8,10,12
   Invalid : num<1 || num>12
 */
     int month = 3;

     boolean days28 = month == 2;    // for the months that has 28 days
     boolean days30 = month == 4|| month == 6|| month ==9|| month ==11;
     boolean invalid = month < 1 || month > 12;
     String result = "";

     if(days28){
         result = "28days";
     }else if(days30){
         result = "30days";
     }else if(invalid){
         result = "invalid";
     }else{
         result = "days31";
     }
        System.out.println(result);
        System.out.println("========================================================");

        int num = 9;
        if(num++ ==10){
            System.out.println("hello "+num);
        }else{
            System.out.println("uni "+num);
        }
        System.out.println("========================================================");



   // ternary: short cut of if statement










    }
}
