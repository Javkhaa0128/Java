package day08_LogicalOperators;
/*
 A traingle is valid if the sum of three angles are equal to 180.
 write a program that check whether a traingle is valid or not. If valid
 print valid otherwise print invalid
 */
public class Traingle {
    public static void main(String[] args) {
        double angle1 = 100;
        double angle2 = 60;
        double angle3 = 20;

        boolean valid = angle1 + angle2 + angle3 == 180;
        boolean invalid = !valid;

        if(valid){
            System.out.println("Valid Traingle");
        }
        if(invalid){
            System.out.println("Invalid traingle");
        }




    }
}
