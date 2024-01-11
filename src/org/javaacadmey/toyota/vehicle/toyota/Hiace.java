package org.javaacadmey.toyota.vehicle.toyota;

import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.vehicle.Truck;
import org.javaacadmey.toyota.vehicle.components.*;

import static org.javaacadmey.toyota.vehicle.toyota.Toyota.HIACE;

public class Hiace extends Truck {
    private static final String MODEL = HIACE.getModel();
    private static final int TONNAGE = 1_000;
    private final Wheel spareWheel;

    public Hiace(String color, Wheel[] wheels, FuelTank fuelTank, Engine engine,
                 Electrics electrics, Headlights headlights, double cost, Country country) {
        super(MODEL, color, HIACE.getMaxSpeed(), Transmission.ROBOT, wheels, fuelTank, engine,
                electrics, headlights, cost, country, TONNAGE);
        this.spareWheel = new Wheel(HIACE.getDiameter());
    }

    public Wheel getSpareWheel() {
        return spareWheel;
    }
}
