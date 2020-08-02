package day11_NestedIf_Ternary;

public class NestedIf_Parctice2 {
    public static void main(String[] args) {
        int day = 8;
       // boolean validNumber = day>=1 && day<=7;
        String result = "";

     /*   if(validNumber){
            if(day ==1){
                result = "Monday";
            }else if(day ==2){
                result = "Tuesday";
            }else if(day ==3){
                result = "Wednesday";
            }else if(day ==4){
                result = "Thursday";
            }else if(day ==5){
                result = "Friday";
            }else if(day ==6){
                result = "Saturday";
            }else{
                result = "Sunday";
            }

        }else{
            result = "Invalid number";
        }

        System.out.println(result);    */

        result = (day==1)?"Mon":(day==2)?"Tue":(day==3)?"Wedn"
                :(day==4)?"Thurs":(day==5)?"Fri":(day==6)?"Sat"
                :(day==7)?"Sunday":"No such a Day";
        System.out.println(result);





    }
}
