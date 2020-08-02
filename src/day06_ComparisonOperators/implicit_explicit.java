package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1;           // implicit casting: automatically done

        long l2 = (long)s1;     // this is manuel impilcit

        //explicit casting: casting larger primitives tp smaller (MUST be done manuelly)

        double num1 = 100.5;
        int num2 = (int)num1;
        System.out.println(num2);

        double d1 = 400.55555;
        int i1 = (int)d1;          // 400

        long L1 = 4400;
        short sh1 = (short)L1;

        long r1 = -500;
        int p1 = (short)r1;

        System.out.println(p1);



    }
}
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