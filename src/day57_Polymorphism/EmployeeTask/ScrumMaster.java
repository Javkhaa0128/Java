package day57_Polymorphism.EmployeeTask;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int ID, String jobTitle, double salary, char gender) {
        super(name, ID, jobTitle, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Scrum master "+name+" is working");
    }

    @Override
    public String toString() {
        return "ScrumMaster{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", gender=" + gender +
                '}';
    }
}
