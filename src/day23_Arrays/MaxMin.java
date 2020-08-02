package day23_Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {5,1,4,5,2,4,};
        int max = arr[0];  //5
        int min = arr[0];

        for(int i = 1; i <= arr.length-1; i++){

            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);












    }
}
