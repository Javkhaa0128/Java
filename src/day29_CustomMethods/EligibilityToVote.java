package day29_CustomMethods;

public class EligibilityToVote {
    /*
    task4: check eligible to vote
          age, citizenship,name

    task5: check eligible to buy alcohol
    task5.1 create method that can calculate 2 numbers: num1, operator, num2,
     */
    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID && age >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }
    }


    public static void main(String[] args) {

        vote("Jack",28,true,"Biden");
        vote("Angie", 17,true,"Jack");

        eligibleToBuyAlcohol(true, 19);

        calcualter(100, '-',20);

    }
    public static void vote(String name, int age, boolean citizen, String candidatetName){
        boolean eligibleToVote = age>=18 && citizen == true;
        if(eligibleToVote){
            System.out.println(name+" is eligible to vote for "+candidatetName);
        }else{
            System.out.println(name+" is not eligible to vote");
        }

    }

    public static void calcualter(double num1, char operator, double num2 ){
       // +, /, *, -, %, invalid

        switch(operator){
            case'+':
                System.out.println("Addition "+(num1+num2));
                break;
            case'-':
                System.out.println("Subtraction "+(num1-num2));
                break;
            case'*':
                System.out.println("MUltiplication "+(num1*num2));
                break;
            case'/':
                System.out.println("Division "+(num1/num2));
                break;
            case'%':
                System.out.println("Remainder "+(num1*num2));
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
