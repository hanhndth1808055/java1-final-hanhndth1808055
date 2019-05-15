package finalPractical;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try {
            EmployeeFullTime ef = new EmployeeFullTime();
            EmployeePartime ep = new EmployeePartime();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please insert the base salary for Full time employees: ");
            ef.baseSalary = scanner.nextFloat();
            System.out.println("Please insert the base salary for Part time employees: ");
            ep.baseSalary = scanner.nextFloat();
            System.out.println("The salary for Full time employees is: " + ef.getSalary());
            System.out.println("The salary for Part time employees is: " + ep.getSalary());

        } catch (Exception e) {
            System.out.println("Salary should be in the float data type. Detailed error:");
           e.printStackTrace();
        }
    }
}
