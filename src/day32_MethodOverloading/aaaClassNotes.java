package day32_MethodOverloading;

public class aaaClassNotes {
}
/*
07/22/2020
Topic: Method Overloading
	   Method Recap


package name: day32_MethodOverloading

Warmup tasks:
	1. write a method that can retunr the full name of a person in regular format

			ex:
				formatFullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"


	2. write a return method that accepts two numbers and an operator, then returns calculation result.
			 if the oerator is invalid, return zero
			 otherwise return the result


	3. write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array

		Ex:
			int[] arr = {1,2,3};
			int num = 4;

			addElement(arr, num); ===> {1,2,3,4}



method overloading: multiple methods have same method name

					parameter MUST be different (either dataType or number of parameters)

					return-type can be same or different

					advantages:
							1. easy to remember
							2. easy to read
							3. reusable
							4. flexible


				substring(beg, end)
				substring(beg)



				substringWithBeginingAndEndingIndex(beg, end)
				substringWithBeginningIndexOnly(beg)


				replace('a', 'a')
				replace("a", "a")


tasks1:
	1. create a method that can find the addition of two numbers
						addition2Numbers

	2. create a method that can find the addition of three numbers
				        addition3Numbers

	3. create a method that can find the addition of four numbers
						addition4Numbers




						addition



Assignments:
tasks2:
	1. create a method that can combine 2 arrays of integers

	2. create a method that can combine 2 arrays of double

	3. create a method that can combine 2 arrays of String

	4. create a method that can combine 2 arrays of char


	first solution: DO NOT use method overloading

	second solution: apply method overloading


 */