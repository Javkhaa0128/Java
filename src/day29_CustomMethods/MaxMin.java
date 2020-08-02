package day29_CustomMethods;



public class MaxMin {
    /*
    11. find the max number
    12. find the min number
     */
    public static void main(String[] args) {

        int[] numbers = {10,9,11,2200,333,-100,-200};

        maxNum(numbers);
        minNum(numbers);

    }



    public static void maxNum(int[] arr){
        int max = arr[0];

        for(int each : arr){
            if(each> max){
            max = each;
        }
    }
    System.out.println("Max: "+max);





}

    public static void minNum(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("Min: " + min);
    }}


