package day11_NestedIf_Ternary;

public class aaaClassNotes {
}
/*
06/20/2020
Topics: ternary
        nested If

package name: day11_NestedIf_Switch

warmup task:
    1. write a java program that can convert numbers between 0 ~ 9 to words,
    if the number is greater than 9 or less than zero, out put should be "Invalid".

    		1

    		one



    2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
                Inavlid:  num < 1 || num > 12


Canavs -> Java - > modules -> day11 -> if statements short quiz
	due by 11:40 am

	DO NOT USE Safari or IE, or Edge browsers
	DO NOT use intelliJ


ternary: short cut of if & else statements

		int num = 100;
		String result = "";

		if(num%2 == 0){
			result = "Even";
		}else{
			result = "Odd";
		}

		?: if keyword, condition needs to be palces before if
		: else

		IN TERNARY TOTAL NUMBER OF ? AND TOTAL NUMBER OF : MUST BE EQUAL



	String result2 =	(num%2 == 0) ? "Even" : "Odd"  ;


		int num = 100;
		String result = "";

		if(num > 0){
			result = "Positive";
		} else if(num < 0){
			result = "Negative";
		}else{
			result = "Zero";
		}


	String result2 =  (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero" ;


nested if: if statement delared in another if statements
		   if the condition can be evaluate to multiple scenarios.
		   if we can have pre condition (mandatory step)

		   if(salary >= 30k ){

		   		if(Job History >= 2){
		   			eligible
		   		}else{
		   			not eligible due to job history
		   		}

		   }else{
		   		not eligible due to salary
		   }



		if( 0 <= score <= 100 ){

			if( 90 <= score  ){
					A
			} else if( 80 <= score  ){
					B
			} else if( 70 <= score ){
					C
			}
			....

		}else{
			Invalid
		}



		if(BreakTime){

		    	if(noTasks){
		    		enjoy your break by drinking coffee
		    	}else{
		    		enjoy your break by coding
		    	}

		}else{ // No break
		      continue the class
		}


come back at 12:27



Tomorrow: Switch
		  Scanner




 */