package day14_Recap;

public class aaaClassNotes {
}
/*
06/24/2020
Java Recap:
		Scanner
		Switch
		If

class starts at: 7:05 pm

package name: day14_Recap

warmup tasks:
        1. write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:

            and prints the ship to info in the following format:

            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102

        1. write a program that can caluclate the garade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry

            MUST use Scanner and nested IF

            if	0 <= score <= 100 ==> valid
            else ==> Invalid Entry




Scanner: used for getting user input

		"java.util"
		package A;

		import java.util.Scanner;

		class B{

		}

		declare scanner:
			Scanner scan = new Scanner(System.in);

	nextInt(): int
	nextLong(): long

	nextDouble(): double

	nextBoolean(): true or false

	next(): String, only takes the first word
			"Batch20 is a great batch" ==> Batch20

	nextLine(): String, takes everything

	close(): closes the scanner


task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )




next topic:  String manipulation



 */