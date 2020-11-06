package day57_Polymorphism.EmployeeTask;

public class Developer extends Employee{

    public Developer(String name, int ID, String jobTitle, double salary, char gender) {
        super(name, ID, jobTitle, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Developer"+name+" is working");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
