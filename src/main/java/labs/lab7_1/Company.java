package labs.lab7_1;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static double calculateTotalSalary(List<Employee> employees) {
        double totalSalary = 0.0;

        for (Employee employee : employees) {
            totalSalary += employee.salary();
        }

        return totalSalary;
    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Add 3 Full Time Employees (FTE)
        for (int i = 0; i < 3; i++) {
            employees.add(new FullTimeEmployee());
        }

        // Add 2 Contract Employees
        for (int i = 0; i < 2; i++) {
            employees.add(new ContractEmployee());
        }

        // Calculate total salary
        double totalSalary = calculateTotalSalary(employees);
        System.out.println("Total Salary: $" + totalSalary);
    }

    }

