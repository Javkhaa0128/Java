package Office_Hours.Practice_07_14_2020;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,};

        for(int i : arr) {

            //int num = arr[i];
            int count = 0;
            for (int each : arr) {    // for counting the frequency
                if (each == i) {
                    count += 1;
                }
            }
            if(count == 1){
                System.out.println(i);
            }
        }










    }
}
