package day08_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        //   System.out.println(a+" is the larger number");

        if(a > b){
            System.out.println(a+" is the larger number");
        }
        if(b > a){
            System.out.println(b+" is the larger number");
        }
        if(a == b){
            System.out.println("Both are equal");
        }
        System.out.println("=======================================");
            boolean BreakTime = true;

            if(BreakTime == true){
                System.out.println("Take 15 min break!");
            }
        boolean greater = b > a;
        if(greater){
            System.out.println(b +" is greater");
        }







    }
}
