package day43_Static;

public class Variables {

    int b;
    static int s;

    public void method2(){
        System.out.println(b);
        System.out.println(s);
    }

    public static void main(String[] args) {
      //  System.out.println(a);
        System.out.println(s);

       // System.out.println(b);    static ONLY accepts static

        Variables obj = new Variables();
        System.out.println(obj.b);


    }
    public static void method1(){
        int a;

        if(true){
            int b = 20;
        }
        //  System.out.println(b);
        //  System.out.println(a);
    }



}
