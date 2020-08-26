package day43_Static;

public class CybertekStudent {
    // for the advantage of static

    String studentName;
    int age;
    char gender;

    static String schoolName = "Cybertek School";


    public void getInfo(){
        System.out.println("Name: "+studentName);
    }

    public static void printSchool(){
        System.out.println("School Name: "+schoolName);
    }







}
