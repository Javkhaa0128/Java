package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

        Item item1 = new Item("Apple",1.5,8);
        Item item2 = new Item("Orange",2.5,5);
        Item item3 = new Item("Egg",3.5,8);
        Item item4 = new Item("Pineapple",5.5,8);
        Item item5 = new Item("Grape",6.5,6);

        ArrayList<Item> list = new ArrayList<>();
        list.addAll(  Arrays.asList(item1,item2,item3,item4,item5));

        System.out.println("Item: "+list.size());
        double totalCost = 0;

        for(Item each : list){
            totalCost += each.calCost();
        }
        System.out.println("Total Price: "+totalCost);

        System.out.println("==============================================");

        Item[] items = {item1,item2,item3,item4,item5};
        double totalCost2 = 0;

        for(int i = 0; i <= items.length-1; i++){
            totalCost2 += items[i].calCost();
        }
        System.out.println("Total Cost: "+ totalCost2);


    }
}
