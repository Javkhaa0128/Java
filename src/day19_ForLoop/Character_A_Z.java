package day19_ForLoop;
/*
Task5: Write a program that will print out all letters in English alphabet is ascending order
 */
public class Character_A_Z {
    public static void main(String[] args) {
        for(char ch = 'A'; ch <= 'Z'; ch++ ){
            System.out.print(ch+" ");
        }
        System.out.println();

        for(int i = 97; i <=122; i++){
            System.out.print( (char)i+" ");
        }
        System.out.println();
        System.out.println("===========================================");
// Task5: Write a program that will print out all letters in English alphabet is descending order
    for(char ch = 'Z'; ch>='A'; ch--){
        System.out.print(ch+" ");
    }

        System.out.println();
    for(int i = 90; i >=65; i--){
        System.out.print( (char)i+" ");
    }




    }
}
