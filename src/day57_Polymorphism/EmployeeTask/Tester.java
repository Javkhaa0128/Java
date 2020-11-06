package day57_Polymorphism.EmployeeTask;

public class Tester extends Employee{

    public Tester(String name, int ID, String jobTitle, double salary, char gender) {
        super(name, ID, jobTitle, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Tester "+name+" is working");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
