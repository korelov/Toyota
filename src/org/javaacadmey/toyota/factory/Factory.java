package org.javaacadmey.toyota.factory;

import org.javaacadmey.toyota.vehicle.components.*;

public class Factory {
    private final Country country;

    public Factory(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public Charging getCharging() {
        return new Charging();
    }

    public Cruise getCruise() {
        return new Cruise();
    }

    public Electrics getElectrics() {
        return new Electrics();
    }

    public Engine getEngine() {
        return new Engine();
    }

    public Fridge getFridge() {
        return new Fridge();
    }

    public FuelTank getFuelTank() {
        FuelTank fuelTank = new FuelTank();
        fuelTank.setAmountFuel(0);
        return fuelTank;
    }

    public Headlights getHeadlights() {
        return new Headlights();
    }

    public Roof getRoof() {
        return new Roof();
    }

    public Usb getUsb() {
        return new Usb();
    }

    public Wheel[] getWheel(int diameter) {
        return new Wheel[]{new Wheel(diameter),
                new Wheel(diameter),
                new Wheel(diameter),
                new Wheel(diameter)};
    }
}
