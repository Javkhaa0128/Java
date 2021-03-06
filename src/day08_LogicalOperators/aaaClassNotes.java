package day08_LogicalOperators;

public class aaaClassNotes {
}
/*
06/14/2020
Topics: Review ( --, ++, %, Concatenation )
        Logical Operators: ||, &&, !
        Single if statement


package name: day08_LogicalOperators

warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785 gallons

    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785 gallons

    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?

                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;


+ concatenation: append, ALWAYS returns String
        3 +  4  ==> 7 addition
        "3" + 4 ==> "34"

        3 + 4 + "5"
          7  +  "5" ==> "75"

        "3" + 4 + 5
          "34" + 5  ==> "345"

        "3" + ( 4 + 5 )
        "3" + 9 ==> "39"

        "result " + false ==> "result false"

        "A" + 'B'  ==> "AB"

        "3" + 4 + 9==> "34" +9 ==> "349"



%: remainder
    in math:
        10 / 3 =  3.333333;

        remainder: numerator - (denominator * Integer of result)
                    10     -  3 * 3   =  1

        15 / 6 = 2. ....
        remainder: 15 - (6*2) =

    in java:
        10%3 ==> 1
        10 % 2 ==> 0



++a, --a: pre, changes the variable's value by 1 right away

a++, a--: post, first passes the current value, then changes the variable's value by 1


40000 / 2 = 20000

remainder: 40000 - (2*20000) =0


come back at: 11:20 am


logical operators: for Boolean ONLY
        !:  Not, opposite..

        &&: and, in order to return true, both expressions MUST be true

        ||: or, the only time || returns false is when both expressions are false





or vs and:
    or ==> either (one of them)
    and ==> both

    come back at: 2:10 pm


single if: conditions

        if(Boolean){
            codes;
        }


        if boolean is true: codes in if statement get executed
        if boolean is false: codes in if statement WILL NEVER gets executed





come back at: 3:15pm


Tasks:
        1. write a program that can identify the largest number between two numbers
                Ex:
                    a = 10
                    b = 20
                output:
                    20 is the largest number

        2. write a program that can identify the smallest number between two numbers

                Ex:
                    a = 10
                    b = 20

                output:
                    10 is the smallest number

        3. A triangle is valid if the sum of three angles are equal to 180. write a program that check whether a triangle is valid or not. if valid print valid, otherwise print invalid
                Ex:
                    Angle1 =60
                    Angle2 = 120
                    Angle3 = 20

                output:
                        invalid triangle

        4. write a program that can check if the the given number is odd or even number
                Ex:
                    num = 30

                output:
                    30 is even number

                    Odd_Even

        5. write a program that can check if the person is aligible to vote.
                if eligible: print "You are eligible to vote"
                otherwise: print "You are not eligible to vote"



Tuesday;
        single if
        if else
        else if








 */