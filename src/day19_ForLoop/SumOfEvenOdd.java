package day19_ForLoop;
/*
Task 3: write a program that can calculate the sum of the even numbers between 0~100

 */
public class SumOfEvenOdd {
    public static void main(String[] args) {

        int sumOfEven = 0;

 /*       for(int i = 0; i <= 100; i+=2){
            sumOfEven += i;
        }

  */
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                sumOfEven += i;
            }
        }
            System.out.println(sumOfEven);

        System.out.println("========================================================");
// Task 4: write a program that can calculate the sum of the odd numbers between 0~100

        int sumOfOdd = 0;

    /*    for(int i = 1; i<= 99; i +=2){
            sumOfOdd += i;
        }
        System.out.println(sumOfOdd);
*/
        for(int i = 0; i <=100; i++){
            if(i%2!=0){
                //sumOfOdd = sumOfOdd + i;
                sumOfOdd += i;
            }
        }
        System.out.println(sumOfOdd);





    }
}
