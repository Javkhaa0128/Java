package day33_LocalDateTime;

public class aaaClassNotes {
}
/*
07/25/2020
Topics: Method Overloading Continue
		Decimal Formatting
		LocalDate & Time
		Time formatting

package name: day33_LocalDateTime

warmup tasks:
	Task01:
		1. create a method that can calculate the addition of two integers
		2. create a method that can calculate the addition of two decimals

		3. create a method that can calculate the multiplication of two integers
		4. create a method that can calculate the multiplication of two decimals

	Task02:
		1. create a return method that can return an int array in descending order
		2. create a return method that can return a double array in descending order
		3. create a return method that can return a String array in descending order
		4. create a return method that can return a char array in descending order

	Task03:
		1. create a method that can print out the unique numbers from an array of integer
		2. create a method that can print out the unique numbers from an array of double
		3. create a method that can print out the unique words from an array of String
		4. creata a method that can print out the unique characters from an array of chars

			MUST use for each loop


decimal formatting:

		20/3.0  ==> 6.66666...   = 6.67
		10/3.0 ==> 3.333333      = 3.33



LocalDate: year, month, day
		year-month-day

		declare:
			of(year, month, day)

		methods:
			now(): gets the current date

			format(DateTimeFormatter)



LocalTime: hours, minutes, seconds, nanoOfSeconds

		hour:minutes:seconds
		24hr


		declare:
			of()

			now()

			format(DateTimeFormatter)



LocalDateTime: combination of LocalDate & localTime

			year-month-day hour:minutes:seconds

			format(DateTimeFormatter)




			month/day/year

			day/month/year


			am, pm

			month/day/year hour:minutes am/pm



DataTimeFormatter:
		DateTimeFormatter.ofPatter("");

			  20  2020
		year: yy, yyyy
		Month: MM(number), MMM(three letters), MMMM
		days: dd

		hours: hh
		minutes: mm
		seconds: ss
		am/pm: a



		January



task:
	1. create an array of String and store 5 of your classmates' names
	2. create an array of LocalDate and put class mate' birthdays in it

	use for loop to iterate those two arrays to print out the name & birthdate of each students




Tomorrow:
		Warrapper class

	next topic:
		ArrayList






 */