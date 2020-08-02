package day12_Switch_Scanner;
/*
 write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
 */
public class AgeGroups {
    public static void main(String[] args) {
        int age = 19;

        String ageGroup = "";

        if(age>0 && age<=150){
            if( age < 21){
                ageGroup = "Teenager";
            }else if(age<55){
                ageGroup = "Adult";
            }else{
                ageGroup = "Senior";
            }
        }else{
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);


/*  switch statement:

          syntax:
              switch(expression){
                    case caseValue1:
                           statementsA;
                           break;

                    case caseValue2:
                           statementsB;
                           break;

                    default:
                           statementsC;
                           break;
              }
    caseValue MUST match with switch statement's expression data type
    caseValue MUST be unique

 */



    }
}
