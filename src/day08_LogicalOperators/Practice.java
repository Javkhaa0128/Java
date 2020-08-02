package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
         int age = 18;
         String citizenShip = "USA";

         boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        System.out.println(eligibleToVote);

        String firstName = "Javkhlantugs";
        String lastName = "GAntulga";
        String fullName = firstName+" "+ lastName;
        int age1 = 28;
        String citizenShip1 = "USA";

        boolean eligibletoVote = age1 >= 18 && citizenShip1 == "USA";

        System.out.println(fullName + " is eligible to vote: "+eligibletoVote);



    }
}
