package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {

    public Constructor(){
        System.out.println("No argument");
    }

    public Constructor(int a){
        System.out.println("int argument");
    }

    public Constructor(String a){
        System.out.println("String argument");
    }

    public static void main(String[] args) {
        Constructor bj1 = new Constructor(  );

/*      ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30));

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        list2.addAll(list1);
        System.out.println(list2);

 */




    }







}
