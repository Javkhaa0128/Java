package day04_Variables;

public class aaaClassNotes {
}
/*
06/07/2020
topics: primitives continue
        String, +
        Review

warmup task:
    Task0: EVERYONE MUST!!!!
        go to Canvas -> Java Programming -> modules -> Programming lab -> Repl.it programming lad and click "Open Repl.it Programming Lab in new Browser"
            it will enroll you to new classroom "Java Programming - B20"

    Task01:
        create a subfolder "Day04" under  "B20 Java Class"
        create a package named day04_Variables in "Summer2020_B20" project
        create a class called varibales_Practice:
                declear the following variables:
                         byte   num1 = 100;
                         short   num2 = 10000;
                         double   num3 = 3.5;
                         float  num4 = 2.5f;
                         long   num5 = 999999999999L;
                          int  num6 = 850000;

                print each of the variables above on the console

decleare variables:
    DataType variableName = data;

    DataType decides what can be assigned


primitives: byte, short, int, long, float, double, boolean, char

        Integers: byte, short, int, long
                int is preferred

        decimals: float, double
                    double is preferred

        double > float > long > int > short > byte

        Larger primitive type CAN NOT be assigned to smaller primitive types
        smaller primitive type CAN BE assigned to larger primitive type


local variables: variables that are declared within the block or methods
                MUST be initialized before use


=: assignment operator
    used for initializing values to variables


boolean: expression of true or false
        MUST be evaluted to true or false

        boolean result = true;
        boolean result2 = false;

        boolean  result3 = 10 > 20


char: used for single character. character MUST be given in a single quote

           char ch1 = '1';

           EVERY SINGLE CHARS HAS ITS OWN CORRESPONDING NUMBER

           char ch2 = 65;

           'A' + 2 ==> 67
           int num = 'A';   ==> 65


int: Integer numbers
double: decimal numbers
boolean: true/false
char: single characters, ''



String: sequence of characters, string of text. must be given in ""
        NOT A PRIMITIVE

            Cybertek

            String  schoolName = "Cybertek School";


            + with String: concates and returns the string

                        any data can be concated to a string


"123"+1 ==>1231
123 + 1 ==> 124

task:
    declare the following variables:
          String  employeeName
          int  employeeID
          String  jobTitle
          double  salary
          char  gender (char)
          boolean  isFullTime (boolean)


task:
    create a class called PersonalInfo:
            first name
            last name
            country
            SSN
            Gender
            isEmployeed


            Ex:
                first Name: firsname
                SSN is: 123
                Gender is: M
                ...



Concatenation VS Addition:

      number + number ==> addition

      text + number


concatenation: append
    "Hello" + 123 ==> Hello123
    "12" + 13 ==> 1213

addition:
        12 + 13 ==> 25
        'A' + 'B' ==> 65 + 66 ==> 131



Task:
    create a class called CarInfo:
            Year
            Brand
            Model
            Mileage
            Price

            print the info of the car

            Ex:
                2020
                BMW
                X5
                30000
                45000

            output:
                2020 BMW X5, 3000 miles, $45000
 */