package day35_ArraysList;

import java.util.ArrayList;

/*
write a program thst can print the list of integers in reversed order

        ex:
           list => {1,2,3,4}
           ouput: 4 3 2 1
 */
public class ReversedOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);

        for(int i = list.size()-1; i >= 0; i--){
            System.out.println( list.get(i));
        }







    }
}
