package day11_NestedIf_Ternary;

public class NestedIf {
    /*   90~100 ==> A
         80~90 ==> B
         70~79 ==> C
         60~69 ==> D
         0 ~59 ==> F
    other ==> Invalid


     */
    public static void main(String[] args) {

        int score = 100;
        String result = "";
        if (score >= 0 && score <= 100) {              // valid score
            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 7) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else{
                result = "F";
            }
        }else {                                    // invalid score
                result = "Invalid";
            }
            System.out.println(result);
        System.out.println("===================================================");
/*
        precondition: minimum salary of 30k
            sub condition: minimum 2 years of job history
 */
        int day = 8;
        String outcome = "";

        if(day>=1 && day<=7) {
            if (day == 1) {
                outcome = "Monday";
            } else if (day == 2) {
                outcome = "Tuesday";
            } else if (day == 3) {
                outcome = "Wednesday";
            } else if (day == 4) {
                outcome = "Thursday";
            } else if (day == 5) {
                outcome = "Friday";
            } else if (day == 6) {
                outcome = "Saturday";
            } else {
                outcome = "Sunday";
            }
        }else{
                outcome = "There is no such a day";
            }
            System.out.println(outcome);

























        }
    }


