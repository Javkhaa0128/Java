package day25_Practices;

public class ShortestString {
    public static void main(String[] args) {

        String[] arr ={"Anam", "Nickolas", "Amir", "Javkhlantugs"};
        int minLength = arr[0].length();

        for(int i = 0; i <= arr.length-1; i++){   // to find out the minimum length of string in arr
            int l = arr[i].length(); // 4 8 4 12

            if(minLength > l){
                minLength = l;
            }
        }
        System.out.println(minLength);

        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i].length() == minLength){
                System.out.println(arr[i]);
            }
        }









        }
}
