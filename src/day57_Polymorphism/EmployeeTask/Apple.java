package day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {

        Employee tester1 = new Tester("Jack",12456,"SDET",120000,'M');
        Employee tester12 = new Tester("Angie",11456,"SDET",120000,'F');

        Employee developer1 = new Developer("Jack2.0",12456,"developer",240000,'M');
        Employee developer2 = new Developer("Angie2.0",11456,"developer",220000,'F');

        Employee scrumMaster = new ScrumMaster("Duduush", 654321,"ScrumMAster",120000,'M');

        //scrumTeam

        ArrayList<Employee> scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester12,developer1,developer2, scrumMaster));

        for(Employee each : scrumTeam){
            System.out.println(each);
        }


    }
}
