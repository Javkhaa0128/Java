package day25_Practices;

public class SortestString2 {
    public static void main(String[] args) {


        String[] arr ={"Anam", "Nickolas", "Amir", "Javkhlantugs"};
        int minLength = arr[0].length();

        for(String each : arr){   // to find out the minimum length of string in arr
           // int l = each.length(); // 4 8 4 12

            if(minLength > each.length()){
                minLength = each.length();
            }
        }
        System.out.println(minLength);

        for(String each : arr ){
            if(each.length() == minLength){
                System.out.println(each);
            }
        }












    }
}
