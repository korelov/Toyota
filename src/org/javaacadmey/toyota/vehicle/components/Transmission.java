package org.javaacadmey.toyota.vehicle.components;

public enum Transmission {
    MANUAL("Механика"),
    AUTOMATIC("АКПП"),
    ROBOT("Робот");

    private final String name;

    Transmission(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
