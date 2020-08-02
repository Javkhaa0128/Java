package day35_ArraysList;

import javax.lang.model.type.IntersectionType;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> goodStudents = new ArrayList<>();
        goodStudents.add("Jack");
        goodStudents.add("Amaraa");
        goodStudents.add("Tuvshee");
        goodStudents.add("Muhtar");

        goodStudents.set(3,"Javkhaa");

        System.out.println(goodStudents);

        goodStudents.clear();
        System.out.println(goodStudents);

        System.out.println("===============================");
// remove(int index)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(2);   // [1,2,4,5]
        System.out.println(list);

// remove(ELement)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        Integer a = 1;

        list2.remove(a);
        System.out.println(list2);

        System.out.println("=======================================");

        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Jack");
        list3.add("Jambaa");
        list3.add("Javkhaa");
        list3.add("J");

//list3.remove(2);
        boolean r = list3.remove("javkhaa");
        boolean r2 = list3.remove("J");

        System.out.println(list3);
        System.out.println(r);
        System.out.println(r2);









    }
}
