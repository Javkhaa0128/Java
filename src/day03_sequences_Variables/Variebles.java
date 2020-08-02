package day03_sequences_Variables;
/*
declare variable:
        DataType variableName = Data;
 */
public class Variebles {
    public static void main(String[] args) {
        // length: 2, width: 4,  =    area: 8

        byte length = 2;
        byte width = 4;
        System.out.println( length * width);

        short num2 = 140;
        int salary = 150000;
        long largenumber = 9999999999l;
        double PI = 3.14;

        System.out.println(PI);

    float decimal1 = 3.5f;

    }
}
/*
for whole number: byte, short, int, long, (int is prefered by compiler)
0, 1, 2, 3, .....

for decimal number: float, double (double is prefered by compiler)
 2.5, 3.5 .....

 */
 // PI = 3.14

 /*    rules for variable name
          1: has to be unique (CANNOT to be duplicated)
          2: has to start with letter
          3. there are only 2 special character you can use ( $ and _ )
          4. you CANNOT Java reserved words
          5. variable names should be readable, we apply camelCase


  */