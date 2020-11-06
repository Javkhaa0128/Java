package day56_Abstraction;

public abstract class AbstractClass_VS_Interface {

     private int a;
    protected static int b;

    public void method1(){

    }

    public static void method2(){}

    public abstract void method3();

    public AbstractClass_VS_Interface(int a ){
        this.a = a;
    }

    static {
        b=300;
    }

    {

    }  // instance block
}
interface A{
    int a = 10; // public static final
    // public void method(){}

    public static void method2(){} // public

    abstract void method3(); // public
             int method3_2(int b); // public abstract
             // abstract method is the only recommendation in interface

    default void method4(){} // public

  //  public A(){}

  //  static {}

   // {}



}
