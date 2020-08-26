package day43_Static;

public class staticBlock2 {

    static int a;
    static String b;
   // static Tester tester1;

    static {
        a = 100;
        b = "Cybertek";

//        tester1 = new Tester();
//        tester1.setInfo("Jack",'M',123,"SDET",120_000);

    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }





}
