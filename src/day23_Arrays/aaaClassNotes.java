package day23_Arrays;

public class aaaClassNotes {
}
/*
07/10/2020
Topics: nested loops practice
        Arrays Intro

package name: day23_Arrays

Warmup tasks:
    1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is neither yes or no, the the program should repeatedly ask the user re-enter

            HINT: nested loop task, outter loop need to be an infinite loop

    2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve and calculats the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter

            HINT: nested loop task, outter loop need to be an infinite loop

    3. write a prgram that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2

                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character. you will need to repeat the same steps





3 main data structures:
        1. Array
        2. Collection
        3. Map


variable:
        DataType  name = data;

        int  num = 1;

      //  String friends = "Cybertek", "Muhtar", "Nadire"


Array variable:  a variable can have multiple data

                size is fixed

        declare:
            DataType[]  arrayName = { data1, data2, data3 ....  };


            initializing the size only:
                DataType[]  arrayName =  new  DataType[size];




                length: returns the size of the array. total number of elements

                last index: length -1






int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
write a program that can return the min and maximum number from the array








 */