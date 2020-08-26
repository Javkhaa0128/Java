package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    // remove, size, set, get, equals, contains, clear
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("Porsche","Lexus","VW","VW","Corvette","Tesla","Lamborghini","VW","Maserati"));

        // cars.remove(2);
        // cars.remove("WV");
        // cars.removeAll( Arrays.asList("VW"));
        // cars.removeIf(p -> p.toLowerCase().contains("m"));
        cars.retainAll( Arrays.asList("Porsche"));


        System.out.println(cars);

        System.out.println("=====================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll( Arrays.asList("Egg","Chicken","Steak","Water","Milk","Salt"));

        // pepsi
        boolean r1 = groceryList.contains("Pepsi");
        System.out.println(groceryList);
        System.out.println(r1);

        // Egg, Milk, Orange
        boolean r2 = groceryList.containsAll(Arrays.asList("Egg","Milk","Salt"));
        System.out.println(r2);

        System.out.println("Total Number Of Items:"+groceryList.size());

        //set the salt to apple
        groceryList.set(  5,  "Apple"  );
        groceryList.set(   groceryList.indexOf("Water"),   "Orange"   );

        groceryList.clear();
        System.out.println(groceryList);










    }
}
