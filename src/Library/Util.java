package Library;

import com.sun.webkit.dom.DocumentImpl;

import java.util.Arrays;

public class Util {

    // import Library.Util;

    public static void removeDup(String str) {   //"abab"
        String nonDup = "";  //"ab"

        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        System.out.println(nonDup);
    }
    // removes duuplicates and returns the value string

    public static void reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);

    }
    // reverse the string and returns the value

    private static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;


    }
    // finds frequency of char from string str and returns it as int

    public static String uniques(String str) {
        String uniques = ""; //"bd"

        for (char each : str.toCharArray()) {

            int count = frequency(str, each);
            if (count == 1) {
                uniques += each;
            }
        }
        return uniques;
    }
    // returns the uniques from the string


    public static int maxNum(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
       return max;


    }
    // find and returns the max number from int array

    public static Integer maxNum(Integer[] arr) {
        int max = arr[0];

        for (Integer each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;


    }
    // find and returns the max number from Integer array

    public static double maxNum(double[] arr) {
        double max = arr[0];

        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;


    }
    // find and returns the max number from double array

    public static Double maxNum(Double[] arr) {
        Double max = arr[0];

        for (Double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;


    }
    // find and returns the max number from Double array

    public static int minNum(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
    //find and returns min number from int array

    public static double minNum(double[] arr) {
        double min = arr[0];

        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
    //find and returns min number from double array

    public static Integer minNum(Integer[] arr) {
        Integer min = arr[0];

        for (Integer each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
    //find and returns min number from Integer array

    public static Double minNum(Double[] arr) {
        Double min = arr[0];

        for (Double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
    //find and returns min number from Double array

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];

        int i = 0;
        for(int each : arr1){
            arr3[i] = each;
            i++;
        }
        for(int each : arr2){
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
     // combines two array and returns it

    public static String formatFullName(String first, String last) {
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = first + " " + last;

        return fullName;
    }
     //    formats the full name

    public static int[] addElement(int[] arr, int num){
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1] = num;

        int i = 0;
        for(int each : arr){
            arr2[i] = each;
            i++;
        }
        return arr2;
    }
    //   inserts the element to the array

    public static double[] addElement(double[] arr, double num){
        double[] arr2 = new double[arr.length+1];
        arr2[arr2.length-1] = num;

        int i = 0;
        for(double each : arr){
            arr2[i] = each;
            i++;
        }
        return arr2;
    }
    //   inserts the element to the array

    public static Double[] addElement(Double[] arr, Double num){
        Double[] arr2 = new Double[arr.length+1];
        arr2[arr2.length-1] = num;

        int i = 0;
        for(Double each : arr){
            arr2[i] = each;
            i++;
        }
        return arr2;
    }
    //   inserts the element to the array

    public static Integer[] addElement(Integer[] arr, Integer num){
        Integer[] arr2 = new Integer[arr.length+1];
        arr2[arr2.length-1] = num;

        int i = 0;
        for(Integer each : arr){
            arr2[i] = each;
            i++;
        }
        return arr2;
    }
    //   inserts the element to the array

    public static char[] addElement(char[] arr, char num){
        char[] arr2 = new char[arr.length+1];
        arr2[arr2.length-1] = num;

        int i = 0;
        for(char each : arr){
            arr2[i] = each;
            i++;
        }
        return arr2;
    }
    //   inserts the element to the array

    public static Character[] addElement(Character[] arr, Character num){
        Character[] arr2 = new Character[arr.length+1];
        arr2[arr2.length-1] = num;

        int i = 0;
        for(Character each : arr){
            arr2[i] = each;
            i++;
        }
        return arr2;
    }
    //   inserts the element to the array

    public static String[] addElement(String[] arr, String num){
        String[] arr2 = new String[arr.length+1];
        arr2[arr2.length-1] = num;

        int i = 0;
        for(String each : arr){
            arr2[i] = each;
            i++;
        }
        return arr2;
    }
    //   inserts the element to the array

    public static int[] sortDesc(int[] arr) {
        Arrays.sort(arr);    // 1,2,3,4,5

        int[] arr2 = new int[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    // sorts int array in descending order returns it

    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);    // 1,2,3,4,5

        double[] arr2 = new double[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;

    }
    // sorts double array in descending order returns it

    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);    // 1,2,3,4,5

        char[] arr2 = new char[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;

    }
    // sorts char array in descending order returns it

    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);    // 1,2,3,4,5

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;

    }
    // sorts string array in descending order returns it

    public static Integer[] sortDesc(Integer[] arr) {
        Arrays.sort(arr);    // 1,2,3,4,5

        Integer[] arr2 = new Integer[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    // sorts Integer array in descending order

    public static Double[] sortDesc(Double[] arr) {
        Arrays.sort(arr);    // 1,2,3,4,5

        Double[] arr2 = new Double[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    // sorts Double array in descending order

    public static Character[] sortDesc(Character[] arr) {
        Arrays.sort(arr);    // 1,2,3,4,5

        Character[] arr2 = new Character[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    // combines two array and returns it

    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length+arr2.length];

        int i = 0;
        for(String each : arr1){
            arr3[i] = each;
            i++;
        }
        for(String each : arr2){
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
    // combines two array and returns it

    public static double[] combine2Arrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length+arr2.length];

        int i = 0;
        for(double each : arr1){
            arr3[i] = each;
            i++;
        }
        for(double each : arr2){
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
    // combines two array and returns it

    public static char[] combine2Arrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length+arr2.length];

        int i = 0;
        for(char each : arr1){
            arr3[i] = each;
            i++;
        }
        for(char each : arr2){
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
    // combines two array and returns it

    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new Integer[arr1.length+arr2.length];

        int i = 0;
        for(Integer each : arr1){
            arr3[i] = each;
            i++;
        }
        for(Integer each : arr2){
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
    // combines two array and returns it

    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        Double[] arr3 = new Double[arr1.length+arr2.length];

        int i = 0;
        for(Double each : arr1){
            arr3[i] = each;
            i++;
        }
        for(Double each : arr2){
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
    // combines two array and returns it

    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
        Character[] arr3 = new Character[arr1.length+arr2.length];

        int i = 0;
        for(Character each : arr1){
            arr3[i] = each;
            i++;
        }
        for(Character each : arr2){
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
    // combines two array and returns it























}







