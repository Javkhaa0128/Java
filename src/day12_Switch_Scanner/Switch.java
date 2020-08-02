package day12_Switch_Scanner;
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
    whichever case is same with expression that case will be executed
    default: gets executed if none of the cases are matching, can be placed at anywhere, not mandatory
    break: used for exiting switch
    */
public class Switch {
    public static void main(String[] args) {
        switch(10){

            case 5:
                System.out.println("Five");
                break;

            case 1:
                System.out.println("One");
                break;

            default:
                System.out.println("Invalid case");
                break;



        }
















    }
}
