package day15_String;

public class aaaClassNotes {
}
/*
06/27/2020
Topics: String class
		String manipulation

package name: day15_String

so far:
	Variables (done)
	if
	Ternary
	switch (done)
	scanner(done)

import statement:
		import java.util.Scanner;
		import PackageName.ClassName;

		import java.lang.String;

String class: presented in "java.lang"
			any class in "java.lang" package will be imported automatically

			1. object, there are ONLY two ways we can create string object:
								1. String literals
										String name = "Cybertek";

								2. by new keyword:
										String name = new String("Cybertek");


				java heap: memory location in java where all the objects will be saved at

				String pool: a special memory location for ALL string literals.
								DOES NOT CREATE DUPLICATED OBJECTS
								ONLY FOR STRING LITERALS


			2. String is IMMUTABLE:
					once the object is created we cannot modify it, cannot change


			3. String is sequneces of characters

					each charcater in string has representive number called index number

					index: starting from zero

					String str = "Cybertek12 $"
					// index:     0123456789...



String methods:
		charAt(index): returns the char at the given index. char

		length(): returns the total number of the character. returns it as int

		concat(str): concatenation, concates the given string to the string. returns string

			"Cybertek".concat(" School") ==> "Cybertek School"

		toLowerCase(): creates the lowercase version of the string, returns new String

		toUpperCase(): creates the uppercase version of the string, returns new String

		trim(): removes the unused space (white space). returns new string
					will not trim the spaces between words


		substring(): creates the subString of the String
			1. substring(beg index, ending index): cerates the substring from the given beginning index till ending index (ending index will be excluded)

				"Cybertek"

			2. substring(beg idex): creates substring from the given beginning index till end of String

					"Muhtar".substring(1); ==>uhtar




task:
	1. write a program that ask user to enter sentence.
		then print out the first and last characters

	2. write a program to ask user to enter first naame and last name
			then print the full name in all upper case

	3. write a program that asks user to enter two string
			then print the longest string

	4. ask the user to enter two words. then add them together and print
			ex:
				input:
					one
					eight

				output:
					oneeight

					DO NOT use + operator




5 hours
3 hours
2 hours

14 hours left
4 hours sleeping
10 hours coding





 */