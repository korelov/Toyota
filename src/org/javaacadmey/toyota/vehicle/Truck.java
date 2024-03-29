package org.javaacadmey.toyota.vehicle;

import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.vehicle.components.*;
import org.javaacadmey.toyota.vehicle.toyota.Toyota;

public abstract class Truck extends Vehicle {
    protected final int tonnage;

    public Truck(Toyota model, String color, int maxSpeed, Transmission transmission,
                 Wheel[] wheels, FuelTank fuelTank, Engine engine, Electrics electrics,
                 Headlights headlights, double cost, Country country, int tonnage) {
        super(model, color, maxSpeed, transmission, wheels, fuelTank,
                engine, electrics, headlights, cost, country);
        this.tonnage = tonnage;
    }
}
