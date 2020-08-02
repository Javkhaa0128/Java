package day15_String;


public class String_Methods {
    public static void main(String[] args) {
        String name = "Cybertek school";
        //             01234567
        //charAt(index):
        char ch1 = name.charAt(0);   //  'C'
        char ch2 = name.charAt(5);   //  't'
        System.out.println(ch1);
        System.out.println(ch2);

        // length();  ==> int
        int l = name.length();

        System.out.println(l);   //  15

        int lastIndexNumber = name.length()-1;
        System.out.println(lastIndexNumber);     // 14

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);          // l


        // concat(str):
        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" School");     // "Cybertek School"

        System.out.println(schoolName);   // Cybertek School

        String r1 = "Cybertek"+123+'A'+true;  // Cybertek123Atrue
        System.out.println(r1);

        String r2 = "Cybertek".concat("123");


        // toLowerCase():
        String name1 = "CYBERTEK SCHOOL";
                   name1 = name1.toLowerCase();

        System.out.println(name1);  // "cybertek school"

        //toUpperCase():
        String name2 = "javkhlantugs";
               name2 = name2.toUpperCase();

        System.out.println(name2);   // JAVKHLANTUGS



        // trim():
        String p = "            Cybertek School     ";
        System.out.println(p);
        p = p.trim();
        System.out.println(p);

















    }
}
