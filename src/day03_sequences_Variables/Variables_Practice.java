package day03_sequences_Variables;

public class Variables_Practice {
    public static void main(String[] args) {
        // 100,  200
        byte num1 = 100;
        short num2 = 200;
        int sum = num1 + num2;

        System.out.println(num1 * num2);
        System.out.println(sum);

        float num3 = 3.5f;
        double a = num3;

        float f1 = 100;
        float f2 = 100.0f;

        System.out.println(f1);
        System.out.println(f2);

        /*
        task: variables: salary, tax

            salary - totalTax
            salary times tax
         */

        double kg = 150;
        double lb = kg * 2.02;

        System.out.println(lb);





    }

}

           // double > float > long > int > short > byte
           // larger primitive CANNOT be assigned to smaller primitive
