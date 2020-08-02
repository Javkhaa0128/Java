package day29_CustomMethods;

public class RemoveDuplicates {

    // remove duplicates from string
    public static void main(String[] args) {
        String str = "abababababbacccccccccddddddeeeeee";
        removeDup(str);
    }

    public static void removeDup(String str){   //"abab"
        String nonDup = "";  //"ab"

        for(String each :str.split("")){
            if(!nonDup.contains(each)){
                nonDup += each;
            }
        }
        System.out.println(nonDup);
    }

}
