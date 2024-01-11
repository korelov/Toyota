package org.javaacadmey.toyota.vehicle;

import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.vehicle.components.*;
import org.javaacadmey.toyota.vehicle.toyota.Toyota;

public abstract class PassengerCar extends Vehicle {
    private final Cruise cruise;

    public PassengerCar(Toyota model, String color, int maxSpeed, Transmission transmission,
                        Wheel[] wheels, FuelTank fuelTank, Engine engine, Electrics electrics,
                        Headlights headlights, double cost, Country country, Cruise cruise) {
        super(model, color, maxSpeed, transmission, wheels, fuelTank, engine, electrics,
                headlights, cost, country);
        this.cruise = cruise;
    }

    public void turnOnCruise() {
        cruise.setCruiseControl(true);
    }

    public void turnOffCruise() {
        cruise.setCruiseControl(false);
    }
}
