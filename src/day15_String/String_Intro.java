package day15_String;

public class String_Intro {
    public static void main(day15_String.String_Intro[] args) {
            String str = "Cybertek";


            String schoolName = "Cybertek school";
            String whereILive = "Virginia";

            String todayDate = new String("June27");
            String isEmployeed = new String ("Yes");

            String d1 = "Dog";  // String literal
            String d2 = "Dog";  // String literal

            System.out.println(d1==d2);  // true

            String t1 = new String("Tiger");
            String t2 = new String("Tiger");

            System.out.println(t1 == t2);  // false

            System.out.println("===============================================");

            String c1 = "Cybertek";
            String c2 = new String("Cybertek");





        }
    }
/*
    import statement :
         import java.util.Scanner;
         import PackageName.ClassName;

         import java.lang. String;

    String class: presented in "java.lang"
         any class in "java.lang" package will be imported automatically

         1. object, there are only two ways we can create string object:
                         1. String literals
                               String name = "Cybertek";
                         2. by new keyword:
                               String name = new String("Cybertek");

     java heap: memory location in java, all the objects will be saved at

     String pool: a special memory location for ALL STRING literals
            DOES NOT CREATE DUPLICATED OBJECTS
            ONLY FOR STRING LITERALS

          2. String is IMMUTABLE:
                once the object is created we cannot modify it, cannot change

          3. String is sequences of character

                   each character in string  has representive number called index number

                   index: starting from zero

                   String str = "Cybertek12 $";
                 // index:       0123456789....

String methods:
    charAt(index): returns the char at the given index

    length(): returns the total number of the characters. returns it as int

    concat(str): concatination, concats the given string to the string. returns string
         "Cybertek".concat(" School") ==> "Cybertek School"

    toLowerCase(): creates the lower case version of the string, returns new String

    toUpperCase(): creates the upper case version of the string, returns new String

    trim(): removes the unused space. returns new string
            will not trim the spaces between the words

    substring(); creates the substring of hte String
       1. substring(beg index, ending index): creates the substring from the beginning index till  ending index
          (ending index will be excluded)





          */



