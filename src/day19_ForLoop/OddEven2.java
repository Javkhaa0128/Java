package day19_ForLoop;

public class OddEven2 {
    public static void main(String[] args) {
        for(int a = 0; a<=50; a++ ){
            if(a % 2 != 0){      // if(a % 2 == 0)
                continue;
            }
            System.out.print(a+" ");
        }
    }
}
