package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDArray_Practice1 {
    public static void main(String[] args) {
        /*
             Testers: { "Lilia", "Odina", "Cristina", "Jack" }
             Developers: { "Ahmet", "Erfan", "Roza", "Javkhlantugs", }
             SM: { "Nurmament" }
             PO: { "Nadir" }
             BA: { "Alex" }


             scrumTeam: testers, Developers, SM, PO, BA
         */
        String[] testers = { "Lilia", "Odina", "Cristina", "Jack" };
        String[] developers = { "Ahmet", "Erfan", "Roza", "Javkhlantugs", };
        String[] SM ={ "Nurmament" };
        String[] PO = { "Nadir" };
        String[] BA = { "Alex" };

        String[] testers2 = { "Erfan", "Roza", "Javkhlantugs"};

        String[][] scrumTeam ={ testers, developers, SM, PO,BA};
        //                         0           1      2   3  4

        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[4][0] = "Jack";
        scrumTeam[1][2] = "Arfan";
        scrumTeam[0] = testers2;

        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("=========================================");
        for(String[] each : scrumTeam) {
            for (String name : each)
                System.out.println(name);

          //  System.out.println(Arrays.toString(each));
        }
        System.out.println("============================================");

        int[][] scores = { {10,20,30,45}, {60,55,75,105}, {93,48,125,135}  };

        for(int[] each : scores){
            for(int numbers : each){
                if(numbers%3==0 && numbers%5==0){
                    System.out.println(numbers);
                }
            }
        }










    }
}
