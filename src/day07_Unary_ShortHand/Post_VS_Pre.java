package day07_Unary_ShortHand;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);  // 11
        System.out.println(a);    // 11

        // ============================================================


        int b = 10;
        System.out.println( b++);   // 10
        System.out.println(b);      // 11

        // ===========================================================

        int c = 25;
        int d = c++;

        System.out.println(d);      // 25
        System.out.println(c);      // 26

        //============================================================

        int e = 25;
        e++;

        System.out.println(e);      // 26

        //============================================================

        int x = 8;
        int y = x--;
        System.out.println(y);      // 8
        System.out.println(x);      // 7

        //============================================================

        int A = 50;
        A = --A + A++ + A-- + A++;    // 50=49+49+50+49  ==>    197
        System.out.println(A);

        int A1 = 1;
        A1 = -A1-- + A1++ / -A1-- * --A1;    // -1
        System.out.println(A1);              // 1 = -1 + 0 / -1 * 0



        int ex = 4;                      // yu = 4 * 4 - 4++
        int yu = ex * 4 - ex++;

        System.out.println(yu);          // 12
        System.out.println("========================================");

        int h = 159;
        int k = -h++ + h-- - --h / ++h * -h++;
        System.out.println(k);

        // k = -159 + 160 - 157 / 158 * -158




        String schoolName = "Cybertek";
                schoolName = schoolName +" School";     // Cybertek School

        schoolName +=" School";

        String fullName = "Javkhlantugs";
        fullName += " Gantulga";

        System.out.println(fullName);

}}