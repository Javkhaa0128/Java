package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Digits_Letters {
    public static void main(String[] args) {
        /*
        write a program that can remove digits and letters for an
        ArrayList of character;
         */

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll( Arrays.asList( 'a', 'b', 'c', '3', '4', '%','@', '#'   ));

        chars.removeIf( p -> Character.isDigit(p) || Character.isLetter(p));

        System.out.println(chars);

        System.out.println("=========================================");


        ArrayList<Character> list = new ArrayList<>();
        list.addAll( Arrays.asList( 'a', 'b', 'c', '3', '4', '%','@', '#'   ));

        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll( list );
        digits.removeIf( p -> !Character.isDigit(p));
        System.out.println("Digits: "+digits);   // if the character is not digit, then remove it from the list



        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll( list );
        letters.removeIf( p -> !Character.isLetter(p));
        System.out.println("Letters: "+letters); // if the character is not letter, then remove it from the list



        ArrayList<Character> specialChar = new ArrayList<>();
        specialChar.addAll(list);
        //specialChar.removeIf( p -> Character.isLetter(p) || Character.isDigit(p));
       specialChar.removeAll(letters);
       specialChar.removeAll(digits);
        System.out.println("Special Character: "+specialChar); // if the character is not char, then remove it from the list



















    }
}
