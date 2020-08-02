package day31_Recap;

public class Methods_Practice {
    public static void main(String[] args) {
        max(10,20);

        int b = max2(10,20);
        System.out.println(  max2(10,20) * 30  );

    }

    public static void max(int a, int b){
        if(a>b){
            System.out.println(a+" is maximum number");
        }else{
            System.out.println(b+" is maximum number");
        }
     /*   int max = a > b ? a : b;
        System.out.println(max);

      */
    }

    public static int max2(int a, int b){
        return a > b ? a : b;

    }

}
