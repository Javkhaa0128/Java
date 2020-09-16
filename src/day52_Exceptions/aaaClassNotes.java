package day52_Exceptions;

public class aaaClassNotes {
}
/*
09/08/2020
Topics: Exceptions Continue:
				Multi-Catch Blocks
				finally block
				throws keyword
				throw keyword
				Custom Exception


package name: day52_Exceptions


Exception: unxpected or unwanted events

		unchecked exception

		checked exception


exception handling:
	1. try&catch blocks: handles the exception permanently

				try{
					exception code
				}catch(ExceptionClass e){
						e.getMessage()
				}

		multi-catch block: parent exception class cannot be placed before child exception class

				Parent exception class can handle any child exceptions

				All exception classes that are extending RunTimeException are unchecked exception

				All exception classes that are not extending RunTimeException are checked exception


		finally block: always gets executed. even if the exception is not handled
						not mandatory


	2. throws: used for handling checked exception. indicates that method throws an exception
				MUST be used in method signature

				handles the exception temporary

				the caller of the method is responsible to handle the exception


throw keyword: manually throwing an exception, does not handle any exception

		object: new ExceptionClass();
		throw:
			throw objectOfException



tomorrow: custom exception:
					1. BreakTimeException
					2. InvalidBrowserException

		  final keyword







 */