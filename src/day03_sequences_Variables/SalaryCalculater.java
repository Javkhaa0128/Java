package day03_sequences_Variables;

public class SalaryCalculater {
    public static void main(String[] args) {
        int salary = 150000;
        double tax = 0.28;
        double totalTax = salary * tax;
        double salaryAfterTax = salary - totalTax;
        System.out.println(salary * tax);
        System.out.println(salary - totalTax);

        System.out.println(salaryAfterTax);



    }
}
     // totalTax = salary * tax
     // salaryAfterTax = salary - totalTax