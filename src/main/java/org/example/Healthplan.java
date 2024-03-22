package org.example;
import org.example.enums.Plan;
public class Healthplan {

    private int id;
    private String name;
    private double price;
    private Plan plan;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public Plan getPlan() {
        return plan;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setPlan(Plan plan) {
        this.plan= plan;
    }

    public Healthplan(int id, String name, double price, Plan plan) {
        setId(id);
        setName(name);
        setPrice(price);
        setPlan(plan);
    }

    public Healthplan(int id, String name, Plan plan) {
        setId(id);
        setName(name);
        setPlan(plan);
    }
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", plan=" + plan +
                '}';
    }
}
