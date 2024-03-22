package org.example;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void setHealthplans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }


    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        setId(id);
        setFullName(fullName);
        setEmail(email);
        setPassword(password);
        setHealthplans(healthPlans);
    }

    public void addHealthPlan(int index, String name) {
        if (index >= 0 && index < healthPlans.length && healthPlans[index] == null) {
            healthPlans[index] = name;
        }else{
            System.out.println("Invalid index");
        }
    }

    public String toString() {
        return "Employee [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password
                + ", healthplans=" + Arrays.toString(healthPlans) + "]";
    }
}
