package day54_Abstraction.CarTask;

import day50_Inheritance_Overriding.CarTask.Tesla;

public class ParkingLot {

    public static void main(String[] args) {
        // Car car1 = new Car();
        BMW bmw = new BMW();
        Tesla tesla = new Tesla();
        Toyota toyota= new Toyota();
        Jeep jeep = new Jeep();

        bmw.start();
        tesla.start();
        toyota.start();
        jeep.start();


    }
}
