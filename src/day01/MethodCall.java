package day01;

import Library.CustomMethods2;

import java.util.Arrays;

public class MethodCall {
    public static void main(String[] args) {

        int[] numbers = {300,200,100,10000,-50000,-60000};

        Arrays.sort(numbers);

        CustomMethods2.maxNum(numbers);
        CustomMethods2.minNum(numbers);







    }
}
