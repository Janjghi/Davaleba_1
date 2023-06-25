package com.company;

import com.company.manager.EmployeeManager;
import com.company.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeManager.getEmployees();

        List<Employee> filteredEmployees = employees.stream()
                .filter(employee -> employee.getAge() > 18 && employee.getAge() < 30)
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .peek(employee -> {
                    if (employee.getId() != 1) {
                        employee.setSalary(employee.getSalary() + 100);
                    }
                })
                .distinct()
                .collect(Collectors.toList());

        Map<String, Double> employeeSalaryMap = filteredEmployees.stream()
                .collect(Collectors.toMap(
                        employee -> employee.getFirstName() + " " + employee.getLastName(),
                        Employee::getSalary));

        System.out.println("Employee Salary Map:");
        employeeSalaryMap.forEach((name, salary) -> System.out.println(name + ": " + salary));
    }
}
