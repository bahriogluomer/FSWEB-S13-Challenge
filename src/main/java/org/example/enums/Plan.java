package org.example.enums;

public enum Plan {
    BASIC("basic", 3000),
    PREMIUM("premium", 5000),
    ENTERPRISE("enterprise", 10000);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
