package day05_ArithmeticOperators;
/*    Arithmetic operators:
                +: addition                 10 + 9 ==> 19
                -: subtraction              10 - 9 ==> 1
                *: multiplication           10 * 9 ==> 90
                /: division                 10/2 ==> 5
                                            10/3 ==> 3
                                            10.0/3 ==> 3.333...
                                            10/3.0 ==> 3.333...

                %: remainder                remainder:        10 - (3 * 3) =1
                                            15 / 3 ==> 5      15 - (3*5)=0
                                            15%3 ==> 0
                                            10%3 ==> 1
                      formula for finding remainder:
          remainder = numerator - (denominator * whole number of result)

          100 / 3 = 33.333..
          remaidner: 100 - (3 * 33)
                     100 - 99 = 1

           remainder 100 % 3 = 1

 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(20+3-2+1);
        System.out.println(20*3);
        System.out.println(2+3-1*4);

        System.out.println(10/3);          // int/int ==> int
        System.out.println(10.0/3);        // double/int ==> double
        System.out.println(10/3.0);        // int/double ==> double
        System.out.println(10.0/3.0);      // double/double ==> double

        System.out.println(10%4);          // 10/4=2
                                           // 10 - (4*2) = 2
        System.out.println(10/4.0);
        System.out.println(30%8);          // 30 - (8*3) = 6

        System.out.println(99%4);           // 99 - (4*24) = 3

        System.out.println(8+12*2-4);



    }
}


