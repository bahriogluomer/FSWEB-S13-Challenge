package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setGiro(double giro) {
      this.giro = giro < 0 ? 0 :  giro;
    }

    private void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public Company(int id, String name, double giro, String[] developerNames) {
        setId(id);
        setName(name);
        setGiro(giro);
        setDeveloperNames(developerNames);
    }

    public void addEmployee(int index, String name) {
        if (index >= 0 && index < developerNames.length && developerNames[index] == null) {
            developerNames[index] = name;
        }else {
            System.out.println("Invalid index");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}