package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = "Conor";
        String lastName = "McNugget";
        String fullName = firstName+" "+lastName;
        int age = 21;
        String citizen1 = "USA";
        String citizen2 = "France";

        boolean eligibleAge = age >= 18;
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";

        boolean eligibleToVote = eligibleAge && usCitizen;
        System.out.println(eligibleToVote);

        System.out.println(fullName);

                int ApplesCount = 20;
                int OrangeCounts = 30;
                int PearsCounts = 30;

        boolean comp = ApplesCount < OrangeCounts || OrangeCounts >= PearsCounts;
                        //   true  or true
        System.out.println(comp);


}}
