package org.javaacadmey.toyota.vehicle.toyota;

import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.vehicle.Cabriolet;
import org.javaacadmey.toyota.vehicle.components.*;

import static org.javaacadmey.toyota.vehicle.toyota.Toyota.SOLARA;

public class Solara extends Cabriolet {
    private static final String MODEL = SOLARA.getModel();

    private final Fridge fridge;

    public Solara(String color, Wheel[] wheels, FuelTank fuelTank, Engine engine,
                  Electrics electrics, Headlights headlights, double cost, Country country,
                  Cruise cruise, Roof roof, Fridge fridge) {
        super(MODEL, color, SOLARA.getMaxSpeed(), Transmission.ROBOT, wheels, fuelTank, engine,
                electrics, headlights, cost, country, cruise, roof);
        this.fridge = fridge;
    }

    public void turnOnFridge() {
        fridge.setWork(true);
    }

    public void turnOffFridge() {
        fridge.setWork(false);
    }
}
