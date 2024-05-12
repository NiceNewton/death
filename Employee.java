import java.util.Scanner;


interface Employee {
    double earnings(double basicSalary);
    double deductions(double basicSalary);
    double bonus(double basicSalary);
}


class Manager implements Employee {
    public double earnings(double basicSalary) {
        return basicSalary + (basicSalary * 0.8) + (basicSalary * 0.15);
    }
    public double deductions(double basicSalary) {
        return basicSalary * 0.12;
    }
    public double bonus(double basicSalary){
        return 0;
    }
}


class Substaff extends Manager {
    public double bonus(double basicSalary) {
        return basicSalary * 0.5;
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        Substaff substaff = new Substaff();
        System.out.println("Earnings: " + substaff.earnings(basicSalary));
        System.out.println("Deductions: " + substaff.deductions(basicSalary));
        System.out.println("Bonus: " + substaff.bonus(basicSalary));
    }
}

