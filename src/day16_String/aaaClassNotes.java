package day16_String;

public class aaaClassNotes {
}
/*
06/28/2020
Topic: String manipulations

class starts at 10:05 am

package name: day16_String

warmup tasks:
    1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

    2. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true

    3. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

    4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

            str1 != str2 && str2 != str3 && str1 != str3



String methods:
    replace(old value, new value): new value will be replaced with all the old values. returns new string

        String str1 = "I like to learn Java, Java is cool"
         String str2 =   str.replace("Java", "C#");  // "I like to learn C#, C# IS cool"


     replaceFirst(oldValue, newValue): replaces the first occured value with new value. returns new String

        String str = "Java is fun, Java is cool"
            str.replaceFirst("Java", "C#") ==>  C# is fun, Java is cool



    indexOf(value): returns the index number of first occured character. as an int

        String str = "Cybertek";
                str.indexOf("r") ==> 4

    lastIndexOf(value): returns the index number of last occured character. as an int

    isEmpty(): checks if the string is empty. returns boolean
                String name = "Muhtar";
                        name.isEmpty(); ==> false
                        !name.isEmpty(); ==> true

    equals(str): checks if the string has same text with the given string. returns boolean
                CANNOT ignore the case sensitivity

    equalsIgnoreCase(str): checks if the string has same text with the given string. returns boolean
                    CAN IGNORE THE CASE SESITIVITY

    contains(str): checks if the given str is contained in the string or not. returns boolean

    startsWith(str): checks if the string is started with the given str. returns boolean

    endsWith(str): checks if the string is ended with the given str. returns boolean


Task:

1. Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"

        NOTE: you will need nested If


2. ask the user to enter a word.
        if the word ends with "ly", print "really???"
        otherwise, print "never mind"

3. write a program that can check if the two strings are equal or not.


4. write a program that can check if the given gmail address is valid gmail account or not
        NOTE: a valid gmail account ends with @gmail.com

5. write a program that can check if the given website is a valid website or not
        note: web address MUST start with "www."



yES, YES, yEs, yeS, yes, YeS   ==>yes




6. write a program to ask the user enter two number and a math operator.
        ex:
            10
            20
            *
        output:
            200

            10
            2
            /
        output:
            5

    valid math operators are: *, / , +, -, %

    Nested If














 */