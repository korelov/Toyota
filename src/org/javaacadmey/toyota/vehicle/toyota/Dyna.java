package org.javaacadmey.toyota.vehicle.toyota;

import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.vehicle.Truck;
import org.javaacadmey.toyota.vehicle.components.*;

import static org.javaacadmey.toyota.vehicle.toyota.Toyota.DYNA;

public class Dyna extends Truck {
    private static final String MODEL = DYNA.getModel();

    private static final int TONNAGE = 2_000;
    private final Charging charging;

    public Dyna(String color, Wheel[] wheels, FuelTank fuelTank, Engine engine,
                Electrics electrics, Headlights headlights, double cost,
                Country country, Charging charging) {
        super(MODEL, color, DYNA.getMaxSpeed(), Transmission.MANUAL, wheels,
                fuelTank, engine, electrics, headlights, cost, country, TONNAGE);
        this.charging = charging;
    }

    public void turnOnCharging() {
        charging.setWork(true);
    }

    public void turnOffCharging() {
        charging.setWork(false);
    }

    public void chargingStatus() {
        System.out.println(charging.isWork());
    }
}
