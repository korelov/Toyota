package org.javaacadmey.toyota.shop;

public class Buyer {
    private final String name;
    private final int money;

    public Buyer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
}
