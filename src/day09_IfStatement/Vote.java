package day09_IfStatement;
/*  if & else:
        if(Condition){}
        statement1
        }else{          unless, opposite of if condition
        statement2

        statement1: if condition is true
        statement2: if condition is false

        if(EligilbleToVote){
        can vote
        }else{
        can't vote
        }
        ==================================================
        if(Breaktime){
        take coffee break
        }else{
        continue the class
      }



              */
public class Vote {
    public static void main(String[] args) {
        int age = 19;
        boolean usCitizen = true;

        if(age >= 18 && usCitizen){
            System.out.println("Eligible to vote for trump");
        }else{
            System.out.println("Not Eligible to vote for trump");
        }




    }
}
