package Office_Hours.Practice_07_07_2020;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "nalan";   // "nal"

        String result = "";

        for(int i = 0; i <= str.length()-1; i++){

            String s = "" + str.charAt(i);    //s: n, a, l, a, n
/*
            if(result.contains(s)) {
                continue;
            }else{
                result += s;
            }

 */
        if(result.contains(s)){
           result += s;
}
        }
        System.out.println(result);







    }
}
