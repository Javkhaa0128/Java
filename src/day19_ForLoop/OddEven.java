package day19_ForLoop;
/*
Task1. write a program that can print all the ODD number between
0 ~ 100 that can be divisble by 3 & 5
 */
public class OddEven {
    public static void main(String[] args) {
        for(int i = 1; i < 100; i += 2) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.print(i + " ");
            }
        }
        System.out.println();


    for(int i = 0; i <=100; i++){
        if(i % 2 !=0){
            if(i % 5 == 0 && i % 3 == 0 ){

                System.out.print(i+" ");
        }
    }
    }
        System.out.println();
        System.out.println("========================");
    /*
Task2. write a program that can print all the EVEN number between
0 ~ 100 that can be divisble by 3 & 5
 */
        for(int i = 0; i <=100; i += 2){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        for( int i = 0; i <=100; i++){
            if(i % 2 == 0){           // pre: MUST be even number
              if(i % 3 == 0 && i % 5 == 0) {   // sub: MUST be divisible by 3&5
                System.out.print(i+" ");
            }
            }
        }

    }
}
