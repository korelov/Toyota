package org.javaacadmey.toyota.vehicle;

import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.vehicle.components.*;

public abstract class Cabriolet extends PassengerCar {
    private final Roof roof;

    public Cabriolet(String model, String color, int maxSpeed, Transmission transmission,
                     Wheel[] wheels, FuelTank fuelTank, Engine engine, Electrics electrics,
                     Headlights headlights, double cost,
                     Country country, Cruise cruise, Roof roof) {
        super(model, color, maxSpeed, transmission, wheels, fuelTank,
                engine, electrics, headlights, cost, country, cruise);
        this.roof = roof;
    }

    public void turnRoofDown() {
        roof.setRoofUp(false);
    }

    public void turnRoofUp() {
        roof.setRoofUp(true);
    }
}
