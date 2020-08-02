package day16_String;

/*
isEmpty(): checks if the string is empty
 */

public class String_Methods2 {
    public static void main(String[] args) {
// isEmpty():
        String name1 = "Cybertek";

        System.out.println( name1.isEmpty() );    // false

        String name2 = "";
        System.out.println( name2.isEmpty() );    // true


// equals(str): checks if the string has same text with the given string. returns boolean
       // CANNOT ignore case sensitivity
        String str1 = "Java";                      // String pool
        String str2 = new String("Java");   // heap

        System.out.println(str1 == str2);          // false

        System.out.println(str1.equals(str2));     // true

        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3 == str4);          // false
        System.out.println(str3.equals(str4));     // true


// equalsIgnoreCase():

        String str5 = "JAVA";
        String str6 = "java";

        System.out.println(str5.equalsIgnoreCase(str6));  // true



// contains(str): checks if the given str is contained in the string or not, returns boolean
        String con = "I like to learn java programming language";

        System.out.println(con.contains("python"));    // false
        System.out.println(!con.contains("python"));   // true
        System.out.println(con.contains("JAVA"));      // false


// startsWith(str): checks is the str is started with given str. returns boolean
        String s1 = "Javkhlantugs";
        System.out.println(s1.startsWith("J"));   // true
        System.out.println(s1.startsWith("M"));   // false

        System.out.println(s1.startsWith("Ja"));  // true


// endsWith(str): checks is the str is ends with given str. returns boolean





    }
}
