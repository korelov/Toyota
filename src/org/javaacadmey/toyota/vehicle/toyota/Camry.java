package org.javaacadmey.toyota.vehicle.toyota;

import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.vehicle.PassengerCar;
import org.javaacadmey.toyota.vehicle.components.*;

import static org.javaacadmey.toyota.vehicle.toyota.Toyota.CAMRY;

public class Camry extends PassengerCar {
    private static final String MODEL = CAMRY.getModel();
    private final Usb usb;

    public Camry(String color, Wheel[] wheels, FuelTank fuelTank, Engine engine,
                 Electrics electrics, Headlights headlights, double cost,
                 Country country, Cruise cruise, Usb usb) {
        super(MODEL, color, CAMRY.getMaxSpeed(), Transmission.AUTOMATIC,
                wheels, fuelTank, engine, electrics, headlights,
                cost, country, cruise);
        this.usb = usb;
    }

    public void turnOnUsb() {
        usb.setWork(true);
    }

    public void turnOffUsb() {
        usb.setWork(false);
    }
}
