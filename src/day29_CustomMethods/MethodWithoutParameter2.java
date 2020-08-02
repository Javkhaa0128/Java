package day29_CustomMethods;
/*
step1: print hello world 5 times
step2: print your school name
step3: print hello world 5 times
step4: print your name
step5: print hello world 5 times
 */


public class MethodWithoutParameter2 {
    /*
    Access-Modifier Specific  return-type  name(){
          statements
    }
     */
    public static void main(String[] args) {

        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("Javkhlantugs");
        printHello5X();

    }



    public static void printHello5X(){
        for(int i = 1; i<=6; i++){
            System.out.println("Hello world");
        }
    }
}
