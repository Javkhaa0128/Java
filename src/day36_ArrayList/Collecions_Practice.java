package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collecions_Practice {
    /*
    {30,20,40,50,15}
    output: 50 40 30 20 15
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(15);

        Collections.sort(list);

        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        System.out.println("==============================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        System.out.println(list1);

        Collections.swap(list1, 1,2);

        System.out.println(list1);

        Collections.swap(list1,0,list1.size()-1);

        System.out.println(list1);

        System.out.println("================================");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('A');
        list2.add('A');
        list2.add('C');
        list2.add('A');

        int count = Collections.frequency(list2, 'A');
        System.out.println(count);









    }
}
