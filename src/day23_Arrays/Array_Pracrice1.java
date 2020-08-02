package day23_Arrays;

public class Array_Pracrice1 {
    public static void main(String[] args) {

        String[] students = {"Javkhlantugs", "Muhtar", "Nadir", "Asiya"};
        //                          0            1        2         3

        String name1 = students[0];
              System.out.println(name1);

        String name2 = students[3];
              System.out.println(name2);

System.out.println("=====================================================");

              String[] names = {"Mike", "Adam", "Tonny","John","Ammy"};
              //                  0       1        2       3      4
              int[] scores = {85, 70, 95, 90, 100};       // size: 5
              //              0    1   2   3    4
/*
        System.out.println( names[0] + " : " + scores[0] );
        System.out.println( names[1] + " : " + scores[1] );
        System.out.println( names[2] + " : " + scores[2] );
        System.out.println( names[3] + " : " + scores[3] );
        System.out.println( names[4] + " : " + scores[4] );
 */

        for(int i = 0; i <= 4; i++){
            System.out.println( names[i] + " : " + scores[i] );
        }
System.out.println("======================================================");

        String[] classMates = new String[5];    // size is 5,
        classMates[0] = "Javkhlantugs";
        classMates[2] = "Faith";
        classMates[1] = "Hazel";
        classMates[3] = "Angie";
        classMates[4] = "BigTuvshee";

        for(int i = 0; i <= 4; i++){    // for(int i = 0; i<= classMates.length -1; i++)
            System.out.println(classMates[i]);
        }
















    }
}
