package day35_ArraysList;

import java.util.ArrayList;

public class Combine2Arrays_List {
    public static void main(String[] args) {
        String[] group1 = {"jack", "Muhtar"};
        String[] group2 = {"Angie", "Tuvshuu"};

        ArrayList<String> studentList = new ArrayList<>();

        for(String each : group1){
            studentList.add(each);
        }
        for(String each : group2){
            studentList.add(each);
        }
        System.out.println(studentList);








    }
}
