package day09_IfStatement;

public class MediumNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aIsMed = (a > b && a < c) || (a > c && a < b);
        boolean bIsMed = (b > c && b < a) || (b < c && b > a);
        boolean cIsMed = aIsMed == false && bIsMed == false;
        //             = !aIsMed && !bIsMed

        double med = 0;

        if(aIsMed){
            med = a;
        }
        if(bIsMed){
            med = b;
        }
        if(cIsMed){
            med = c;
        }
        System.out.println(med);



    }
}
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