package day09_IfStatement;
/*      If statement: conditional statement
             single if statement: for one condition
               if(boolean){
                   codes
               }
        codes: gets executed if boolean is true
 */
public class alcohol {
    public static void main(String[] args) {
        // write a java program that can identify if a person is eligible to buy alcohol
        boolean hasID = true;
        int age = 19;

        boolean eligible = hasID && age >= 21;
        //                 true  && false ==> false

        String result = "";

        if(eligible == true){
            //  System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";
        }

        if(eligible == false){
           //  System.out.println("Go buy your milk");
            result = "You are not old enough to buy alcohol";
        }

        System.out.println(result);

    }
}
