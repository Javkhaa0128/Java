package day17_StringReview;

public class String_Methods {
    public static void main(String[] args) {
// charAt(index);  ==> char
        String str = "Cybertek";
        //            01234567
        char ch1 = str.charAt(1);

        System.out.println(ch1);    // y

// +:
        String str2 = "Cybertek";
               str2 = str2 + " School";

        System.out.println(str2);

// length();  ==> int
        String str3 = "Cybertek";
        int num1 = str3.length();
        System.out.println(num1);     // 8

        // lastindex: length() - 1



// last index: length - 1
        char ch2 = str.charAt(str3.length()-1);

// upperCase & lowerCase
        String str4 = "cybertek";
        str4 = str4.toUpperCase();   // "CYBERTEK"

        String str5 = "JAVA";
        str5 = str5.toLowerCase();   //"java"

// trim()
        String str6 = "             Cybertek            ";
        str6 = str6.trim();
        System.out.println(str6);

// substring:   ==> string
        String str7 = "I Like Java Language";
        String word = str7.substring(7,11);
        System.out.println(word);

        String word2 = str7.substring(12);       // Java
        System.out.println(word2);               // Language

// indexOf & lastIndexOf  ==> int
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int num2 = str8.indexOf("W");
        int num = str8.indexOf('y');
        System.out.println(num);
        System.out.println(num2);

        System.out.println(str8.charAt(23));

        int num4 = str8.indexOf("We");
     // int num4 = str8.indexOf(", W") + 2;
        System.out.println(num4);

        String str9 = "Java Java Java";

        int i4 = str9.lastIndexOf("J");
        int i5 = str9.indexOf("J");
        int i6 = str9.indexOf(" Java ") + 1;
        int i7 = str9.lastIndexOf("Java ");
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);

// replace & replaceFirst
        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java","C#");

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java","C#");

        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replace("Java is","C# is");














    }
}
