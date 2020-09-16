package repl;



import Library.Util;
import com.sun.org.apache.bcel.internal.generic.ARETURN;
import day45_Constructor.Constructor;
import day48_Inheritance.DeviceTask.Phone;

import java.util.*;
/*
Warmup tasks:
    1. write a method that can returne the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
    2. write a return method that accepts two numbers and an operator, then returns calculation result.
             if the oerator is invalid, return zero
             otherwise return the result
    3. write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array
        Ex:
            int[] arr = {1,2,3};
            int num = 4;
            addElement(arr, num); ===> {1,2,3,4}

 */





public class it {
String size;
ArrayList<Pillow> pillows = new ArrayList<>();

public it(String size, int numOfp){
    this.size = size;
    for(int i =0; i<numOfp; i++)
    {
        this.pillows.add(new Pillow());
    }
}
}
class Pillow{
    String material;

    public static void main(String[] args) {
        it bed = new it("king",4);
        System.out.println(bed.pillows.size());
    }
}







