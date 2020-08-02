package day08_LogicalOperators;

public class Odd_Even {
    public static void main(String[] args) {
        int num = 100;

        boolean even = num%2 == 0;
        boolean odd = num%2 != 0;    // odd = !even

        if(even) {
            System.out.println("It is even number");
        }
        if(odd){
            System.out.println("It is odd number");
        }







    }
}
