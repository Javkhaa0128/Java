package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
// containsAll
        ArrayList<Integer> list  = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);

        boolean r1 = list.contains(1);

        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(4);

        boolean r2 = list.containsAll(elements);

        System.out.println(r2);

        System.out.println("=======================================");

        ArrayList<Integer> list2  = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

              // verify that 1, 2 ,4 are contained in the list2

   //   boolean r3 = list2.containsAll(   Arrays.asList(1,2,4)  );
        Integer[] arr = {10,20,4};
        boolean r3 = list2.containsAll(   Arrays.asList( arr )  );

        System.out.println("=========================================");
// addAll
        ArrayList<Integer> numbers = new ArrayList<>();

     /*        Integer[] nums = {1,2,34,4,5,6,7,8,9,10};
        numbers.addAll( Arrays.asList(nums));
     */
        numbers.addAll( Arrays.asList(1,2,34,4,5,6,7,8,9,10));

        System.out.println(numbers);

        System.out.println("============================================");
// removeAll
        ArrayList<Integer>  nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,2,3,4,5,5,6,6,7,8,9,10,11,11,12,13));

        System.out.println(nums);

        // remove all 1,2,5,10,11

        nums.removeAll( Arrays.asList(1,2,5,10,11));  // remove all the 1, 2,5,10,11
        System.out.println(nums);

        System.out.println("==============================================");
// retainAll
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll( Arrays.asList(1,1,1,1,1,1,2,2,3,4,5,6,6,7,8,9,9,10,11,12,13,14));
        System.out.println(num1);

        // only keep the elements that are either 1 or 2 or 3 or 9

        num1.retainAll( Arrays.asList(1,2,3,9));
        System.out.println(num1);













    }
}
