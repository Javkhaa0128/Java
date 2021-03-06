package day29_CustomMethods;

public class aaaClassNotes {
}
/*
07/19/2020
Topic: Custom methods

package name: day29_CustomMethods
			  return keyword

warmup task:
    1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B

                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C

            MUST use for each loop


methods: function, grouping a series of code fragments

		step1: reverse a string
		step2: statement
		step3: reverse a string
		step4: statement

		advantage: re-usable
				   easy to maintain



declaring methods: MUST BE created within the class


		public     static       void    main(String[]  args){ }

	Access-Modifier  Specifiers  return-type   MethodName(parameter){

			statements;

	}


	Access-modifier: public, protected, default, private
			public: open to world. can always be accessible

	specifiers: static, final, abstract, synchronized
			static: can be called through class name

	return-type: void, any dataType

	parameter: any dataType



	method without parameter: if all info are given or known

		Access-Modifier  Specifiers  return-type   name(){
				statements;
		}



	method with parameter: we needed if the method requires extra info to complete the functionality

		Access-Modifier  Specifiers  return-type   name(parameter){
				statements;
		}

		argument: the info that will be given to the parameter

				if method passes parameter(s), it's MANDATORY to give argument(s)


branching statements:
	continue: skips
	break: exits the switch and loop
	return: exits the current method
	System.exit(0): exits the entire system




task:
	1. create a method that can print odd numbers between 1~100 in a same line seperated by space

	2. create a method that can print even numbers between 1~100

	3. create a method that can calculate the age of the person


	4. check eligibility to vote

	5. check eligibility to buy alcohol

	5.1 create a method that can calculate two numbers: num1,  operator, num2

	6. calculate the garde of the student based on the score

	7. create a method that can reverse any String

	8. write a method that can print out the unique elements from an array of string

	9. write a method that can check if a string is plaindrome, print true if it's  otherwise print false

	10. write a method that can remeove the duplicates from the string
			"abababa"
			"ab"

	11. wirte a method that can print out the maximum number from any array of integers

	12. wirte a method that can print out the minimum number from any array of integers




tomorrow:







 */