package day08_LogicalOperators;

public class Post_Pre {
    public static void main(String[] args) {
        /* manually calculate the following code fragements:

         */
        int a = 200;
        int b = -a++ + - --a * a-- %2;
             // -200 + -200 * 200 % 2
             // -200 - 40000 % 2
             // -200 - 0
             // b = -200
        System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x/y;
          //  300 + 400 - 300 * 400 + 300/400
          //  300 + 400 - 120000 + 0.75
          //  700 - 120000 + 0.75
          //  -119300 + 0.75
          //  -119299.25 ==> 119300 because it is (int)



        System.out.println(z);



    }
}
