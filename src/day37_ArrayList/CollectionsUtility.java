package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,98,100,20,0,-1,-3,400,500,5000 ));

        // maximum number:
       Integer max = Collections.max(list);
       // minimum number
       Integer min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);

        System.out.println("=======================================");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Jack", "Noza", "Muhtar","Nadir","Muhtar"));

        //replaceAll
        Collections.replaceAll(names, "Muhtar", "Fatima");
        System.out.println(names);

        /*
        ArrayList methods:
                   removeIf removeAll, addAll, containAll, retainll,
                   equals, contains, get
                   set, indexOf, lastIndexOf,

        Arrays Class:
                   asList

        Collection Class:
                    swap, sort, replace, frequency
         */









    }
}
