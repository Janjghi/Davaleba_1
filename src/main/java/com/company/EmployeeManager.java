package com.company.manager;

import com.company.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        // Add sample employees
        employees.add(new Employee(1, "Gia", "Kapanadze", 30, 5000.0));
        employees.add(new Employee(2, "Gocha", "Beridze", 35, 6000.0));
        employees.add(new Employee(3, "Levani", "Lomidze", 28, 4500.0));
        employees.add(new Employee(4, "Mariami", "Gabunia", 32, 5500.0));
        employees.add(new Employee(5, "Ana", "Siradze", 40, 7000.0));

        return employees;
    }
}
