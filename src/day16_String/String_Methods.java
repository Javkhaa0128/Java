package day16_String;

public class String_Methods {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";

        email = email.replace("gmail", "yahoo");
        System.out.println(email);

        String word = "java";
        word = word.replace("a", "e");
        System.out.println(word);

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java", "a, C#");

        sentence = sentence.replace("Java ", "Python ");

        System.out.println(sentence);
        // I like to learn Java, C# is cool, Python is fun


        String s1 = "I like to stay in Cybertek, Cybertek is nice place"; //MIT

        s1 = s1.replace("Cybertek", "MIT");


        String str2 = " I like to leaRn Java";
        str2 = str2.replace("R","r");
        System.out.println(str2);

 //replaceFirst:
        String str3 = "I like to drink tea and tea";
        str3= str3.replaceFirst("tea", "cola");
        System.out.println(str3);

        String str4 = "I like to watch Game of Thrones, and Walking Dead";
        str4 = str4.replace(", and Walking Dead", "");
        System.out.println(str4);

// indexOf()
        String s5 = "I like to stay in cybertek, we are learning java";
        int r1=s5.indexOf("r");
        int r2= s5.indexOf("re");  // returns the first char 'r' index
        int r3 = s5.indexOf("rn");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

// lastIndexOf()
String s6 = "Java is a programming language, and Java is fun";

        int I1 = s6.indexOf("J");
        int I2 = s6.lastIndexOf("J");






    }
}
