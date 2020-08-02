package day11_NestedIf_Ternary;

public class Ternary_Practice1 {
    public static void main(String[] args) {
        int age = 20;
        boolean eligible = false;

        if(age>21){
            eligible = true;
        }else{
            eligible = false;
        }
        System.out.println(eligible);

        boolean CanBuyAlcohol = (age>21) ? true: false;

        System.out.println("====================================================");
        int age1 = 21;
        boolean canVote = true;
        String result3 = "";

        if(age1 > 21&&canVote==true){
            result3 = "can vote";
        }else{
            result3 = "can not vote";
        }
        System.out.println(result3);

        String result4= (age1 > 21&&canVote==true) ? "can vote" : "can not vote";

        System.out.println("================================================");
        int number = 10;
        int number1 = 10;
        String result5 = "";

        if(number>number1){
            result5 = "not equal";
        }else{
            result5 = "equal";
        }
        System.out.println(result5);

        String result6 = (number>number1) ? "not equal" : "equal";
        System.out.println("===================================================");
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









    }
}
