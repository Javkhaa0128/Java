package day06_ComparisonOperators;
/*   relational operators:
          >: greater then
          <: less than
          >=: greater or equal
          <=: less than equal
          ==: equal
          !=: not equal

         9>8 ==> true
         7>8 ==> false
         7 >= 7 ==> true
         8 >= 6 ==> true
         9 <= 25 ==> true

         10 == 10 ==> true
         true == false ==> false
         'A' == 'A' ==> true
         "Muhtar" == "Good" ==> false

         9 != 10 ==> true
         true != false ==> true


          */
public class RelationalOperators {
    public static void main(String[] args) {
        boolean r1 = 10 > 9;
        System.out.println(r1);        // true

        boolean r2 = 100 < 9000;
        System.out.println(r2);        // true

        // >=
        boolean r3 = 87 >= 85;
        System.out.println(r3);         // true

        boolean r4 = 877 >= 878;
        System.out.println(r4);         // false

        // <=
        boolean r5 = 200<=300;
        System.out.println(r5);         // true

        // ==: equal
        boolean r6 = 900 == 800;
        System.out.println(r6);          // fasle

        boolean r7 = true == false;
        System.out.println(r7);           // false

        boolean r8 = "Muhtar" == "Good Guy";
        System.out.println(r8);           // false

        boolean r11 = "Muhtar" != "Bad Guy";
        System.out.println(r11);           // true

        boolean r12 = true != false;
        System.out.println(r12);           // true

        boolean result1 = 'A' == 65;
        System.out.println(result1);       // true

        boolean result2 = 100 == 100.0;
        System.out.println(result2);        // true

        boolean result4 = "100" == "100.0";
        System.out.println(result4);         // fasle

         // even 100%2 == 0
         // odd 100%2 != 0

        int number = 100;
        boolean even = number%2 == 0;
        System.out.println(even);           // true

        boolean odd = number%2 != 0;
        System.out.println(odd);            // true

        int x = 1000;
        // divisible by 3: 1000 % 3 == 0   if 0
        // divisible by 5:    x % 5 == 0
        System.out.println(1000%3);  // == 1


    }
}
