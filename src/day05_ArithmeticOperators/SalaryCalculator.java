package day05_ArithmeticOperators;

public class SalaryCalculator {
    public static void main(String[] args) {
        int rate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        int weeklyHours = 40;

        int salary = rate * weeklyHours * 48;
        double totalTax = ((stateTaxRate * salary)+(federalTaxRate * salary));
        double income = salary - totalTax;
        System.out.println("your salary is: "+salary+" USD");
        System.out.println("your total tax is: "+ totalTax+" USD");
        System.out.println("your income after tax is: "+income+" USD");




    }
}
