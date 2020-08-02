package day14_Recap;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
               Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number:");
            int buildingNumber = scan.nextInt();
               scan.close();

        System.out.println("Enter your street address: ");
            String streetAddress = scan.nextLine();

               scan.nextLine();

        System.out.println("Enter your city name: ");
            String cityName = scan.nextLine();

        System.out.println("Enter your state: ");
           String stateName = scan.next();

        System.out.println("Enter your zip code: ");
           int zipCode = scan.nextInt();

           scan.nextLine();

        System.out.println("Enter you full name: ");
           String fullName = scan.nextLine();
           /*
           ship To: Jimmy joe
                    7925 Jones Branch Dr
                    McLean, VA 22102
            */
        System.out.println("\nShip To: "+"\n"+fullName+"\n"+buildingNumber+" "+streetAddress+"\n"+cityName+" "+stateName+" "+zipCode);








    }
}
