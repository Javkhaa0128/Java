package day25_Practices;

public class FirstThreeChar {
    public static void main(String[] args) {
        String[] words = {"Apple","Banana","Strawberry","Java","Python"};

        for(int i = 0; i <= words.length-1; i++){
            System.out.println(words[i].substring(0,3));
        }
 /*     System.out.println(words[0].substring(0,3));
        System.out.println(words[1].substring(0,3));
        System.out.println(words[2].substring(0,3));
 */
        System.out.println("=====================================");
        for(String each : words){
            System.out.println(each.substring(0,3));
        }









    }
}
