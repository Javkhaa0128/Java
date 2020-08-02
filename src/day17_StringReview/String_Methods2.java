package day17_StringReview;

public class String_Methods2 {
    public static void main(String[] args) {
// equals & equalsIgnoreCase
      String str1 = "Cat";
      String str2 = new String("Cat");
      String str3 = new String("Cat");

        System.out.println(str1 == str2);          // false
        System.out.println(str1.equals(str2));     // true
        System.out.println(str2 == str3);          // false
        System.out.println(str2.equals(str3));     // true

        String s4 = "java";
        String s5 = "Java";

        System.out.println(s4.equals(s5));         // false
        System.out.println(s4 == s5);              // false

        System.out.println(s4.equalsIgnoreCase(s5));    // true

        String s6 = "JavKHlanTugs";
        String s7 = "javkhlantugs";
        System.out.println(s6.equalsIgnoreCase(s7));    // true
        System.out.println(s6.equals(s7));              // false

// isEmpty: checks if the length of string is 0
      String str ="  ";
        System.out.println(str.isEmpty());         // false

        str = str.trim();
        System.out.println(str.isEmpty());         // true

        String s2 = "Cybertek";
        System.out.println(s2.isEmpty());          // false

        s2 = "";
        System.out.println(s2.isEmpty());          // true

// contains: included or not
      String s3 = "Java, C#, Python, Ruby, C++";
        System.out.println(s3.contains("Java"));   // true
        System.out.println(s3.contains("java"));   // false
        System.out.println(s3.toLowerCase().contains("java"));   // true

        String str4 = "ABCD";
        System.out.println(str4.contains("D"));    // true

// startsWIth & endsWith:
      String str5 = "Cybertek";
        System.out.println(str5.startsWith("E") || str5.startsWith("C")); //true
        System.out.println(str5.startsWith("Cy"));  // true

        String str6 = "Corona";
        System.out.println(str6.endsWith("Virus"));  // false









    }
}
