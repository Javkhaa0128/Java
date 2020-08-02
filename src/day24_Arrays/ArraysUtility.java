package day24_Arrays;
/*
Arrays Utility:

     Arrays class: presented in "java.util" package
        import java.util. Arrays ;
 */
/*
        Arrays.toString(arr): converts array to string
        Arrays.sort(arr):  sorts the array in ascending order
        Arrays.equals(arr1, arr2): returns boolean
 String method;
    toCharArray
 */
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        System.out.println(Arrays.toString(arr));

        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        String[] names = {"Muhtar", "Jack","Nadir"};

        System.out.println(Arrays.toString(names));  // in order to print array we MUST convert it to string

        System.out.println("============================================");
;
        int[] nums = {2,3,5,6,9,1,4,8};
        Arrays.sort(nums);
        System.out.println( Arrays.toString(nums));
        System.out.println("Maximum number: "+nums[nums.length-1]);
        System.out.println("Minimum number: "+nums[0]);

        String[] students = {"Mehdi","Appa","Trump"};

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("===========================================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2);    // true
        System.out.println(r1);

        int[] arr3 = {2,1,3};
       // Arrays.sort(arr2);
       // Arrays.sort(arr3);

        boolean r2 = Arrays.equals(arr2, arr3);   // false


















    }
}
