package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Healthplan healthplan1 = new Healthplan(1, "Basic", 3000, Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "Premium", 5000, Plan.PREMIUM);
        Healthplan healthplan3 = new Healthplan(3, "Enterprise", 10000, Plan.ENTERPRISE);

        String[] healthplans = new String[3];
        healthplans[0] = healthplan1.toString();
        healthplans[1] = healthplan2.toString();
        healthplans[2] = healthplan3.toString();

        Employee employee1 = new Employee(1, "John Doe", "jdoe@example.com", "password", healthplans);
        employee1.addHealthPlan(0, "Basic");
        System.out.println(employee1.toString());

        System.out.println("--------------------------------");
        String[] developerNames = new String[4];
        developerNames[0] = "John Doe";
        developerNames[1] = "Jane Doe";
        developerNames[2] = "John Smith";
        developerNames[3] = "Jane Smith";

        Company company1 = new Company(1, "ExampleCompany", 10000, developerNames);
        company1.addEmployee(0, "John Doe");
        System.out.println(company1.toString());
    }
}