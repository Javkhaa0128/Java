package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Jack");
        students.add("Angie");
        students.add("Tuvshuu");
        students.add("Gantulga");
        students.add("Minj");
        // verify that the nmes Jack Angie are contained in students list
        boolean r1 = students.containsAll(   Arrays.asList("Jack","Angie")   );

        System.out.println(r1);

        System.out.println("======================================");

        ArrayList<String> group1 = new ArrayList<>();

        // add all students names in your group
        group1.addAll( Arrays.asList("Jack","Nadir","Muhtar","Ulzii"));

        // verify your mentor and one of your closest friend names are contained int he list
        boolean r2 = group1.containsAll( Arrays.asList("Danny","Kay"));

        System.out.println(r2);

        System.out.println("======================================");
        // remove all the names that "Ahmed"

        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.addAll( Arrays.asList("Jack","Ahmed","Muhtar","Angie"));

        employeeName.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employeeName);

        employeeName.retainAll( Arrays.asList("Jack"));
        System.out.println(employeeName);














    }
}
