package day12_Switch_Scanner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;        // only imports scanner class from java.util
// import java.util.*;              // imports everything from java util

public class UserInput {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        //int num1 = input.nextInt();
        //long num2 = input.nextLong();
        double num3 = input.nextDouble();

       System.out.println( "You entered: "+num3);







}}

/* Scanner: used for to get user inputs
     presented in package "java.util"
     syntax of import:
            import packageName.ClassName;            // imports a specific class

            import java.util.Scanner
declare scanner:
      Scanner variableName = new Scanner(System.in);

scanner methods: reads the user input
      nextInt(): only allows user to enter integer, returns the input as int primitive
      nextLong(): only allows user to enter integer, returns the input as long primitive
      nextDouble():only allows user to enter decimals, returns the input as double primitive
 */