package day39_CustomClass;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();        // object 1

         /*   car1.brand = "Toyota";
            car1.model = "Camry";
            car1.year = 2020;
            car1.color = "Red";
            car1.mileage = 200.0;
            car1.price = 28000.00;
*/

        car1.setCarInfo("Toyota","Camry",2020,"Red",20000,50);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        System.out.println("=====================================");

        Car car2 = new Car();   // object 2

/*            car2.brand = "Porsche";
            car2.model = "Panamera";
            car2.year = 2020;
            car2.color = "Black";

 */


        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        System.out.println("=========================================");

        Car car3 = new Car();
        car3.setCarInfo("Audi","R8",2017,"Black",1500,90000);

        Car car4 = new Car();
        car4.setCarInfo("Jeep","Wrangler", 2018,"White",1500,3500);


        car3.getCarInfo();
        car4.getCarInfo();







    }
}

