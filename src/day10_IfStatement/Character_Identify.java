package day10_IfStatement;

public class Character_Identify {
    public static void main(String[] args) {
    // write a program that identify if the given character is Alphabet

     char character = 'A';
//                            65<=character<=90                          97 <= character <= 127
     boolean isAlphabetic = (character>=65 && character<=90) || (character>=97 && character<=127);
//                                upper case letter               lower case letter


        String alphabet = "";

        if(isAlphabetic){
            //  System.out.println(character+" is Alphabetic character");
           alphabet = character+" is Alphabetic character";
         }else{
            //  System.out.println(character + " in not Alphatetic character");
            alphabet = character + " in not Alphatetic character";
}

        System.out.println(alphabet);

        System.out.println("======================================================");

        boolean isDigit = character >=48 && character <=57;

        String digit = "";
        if(isDigit){
            digit = character+" is a digit";
        }else{
            digit = character+" is not a digit";
        }
        System.out.println(digit);

        System.out.println("=========================================================");

        boolean specialChar = !isAlphabetic && !isDigit;
//                    isAlphabetic == fasle && isDigit == false

        String specialCharacter = "";
        if(specialChar){
            specialCharacter = character+" is a special char";
        }else {
            specialCharacter = character + " is not a special char";
        }
        System.out.println(specialCharacter);










    }
}
