import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Basic Salary
        System.out.print("Enter the basic salary of the employee: ");
        double basicSalary = sc.nextDouble();

        double hra, da, grossSalary;

        if (basicSalary <= 10000) {
            hra = basicSalary * 0.20;  // 20% of basic
            da  = basicSalary * 0.80;  // 80% of basic
        } else if (basicSalary <= 20000) {
            hra = basicSalary * 0.25;  // 25% of basic
            da  = basicSalary * 0.90;  // 90% of basic
        } else {
            hra = basicSalary * 0.30;  // 30% of basic
            da  = basicSalary * 0.95;  // 95% of basic
        }

        grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary = Rs. " + grossSalary);

        sc.close();
    }
}
