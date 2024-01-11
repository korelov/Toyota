package org.javaacadmey.toyota.vehicle.toyota;

public enum Toyota {
    CAMRY("Camry", 17, 210, 5_000, 10_000),
    DYNA("Dyna", 20, 105, 12_000, 22_000),
    HIACE("Hiace", 20, 155, 10_000, 15_000),
    SOLARA("Solara", 16, 180, 8_000, 12_000);
    private final String model;
    private final int diameter;
    private final int maxSpeed;
    private final int shopPrice;
    private final int costPrice;

    Toyota(String model, int diameter, int maxSpeed, int costPrice, int shopPrice) {
        this.model = model;
        this.diameter = diameter;
        this.maxSpeed = maxSpeed;
        this.costPrice = costPrice;
        this.shopPrice = shopPrice;
    }

    public String getModel() {
        return model;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getShopPrice() {
        return shopPrice;
    }

    public int getCostPrice() {
        return costPrice;
    }
}
