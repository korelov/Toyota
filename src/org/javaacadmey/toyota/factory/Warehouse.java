package org.javaacadmey.toyota.factory;

import org.javaacadmey.toyota.vehicle.Vehicle;
import org.javaacadmey.toyota.vehicle.toyota.Toyota;

public class Warehouse {
    private int vehicleLimit = 1000;
    private final Vehicle[] vehicles = new Vehicle[vehicleLimit];
    private int currentVeniclesCount = 0;
    private int countCamry = 0;
    private int countDyna = 0;
    private int countHiace = 0;
    private int countSolara = 0;

    public int getCountCamry() {
        return countCamry;
    }

    public int getCountDyna() {
        return countDyna;
    }

    public int getCountHiace() {
        return countHiace;
    }

    public int getCountSolara() {
        return countSolara;
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicleLimit == 0) {
            System.out.println("Нет мест");
        }
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                vehicleLimit--;
                currentVeniclesCount++;
                vehicleCount(vehicle.getModel(), true);
                break;
            }
        }
    }

    private void vehicleCount(Toyota model, boolean addGetVehicle) {
        int incDec;
        if (addGetVehicle) {
            incDec = 1;
        } else {
            incDec = -1;
        }
        switch (model) {
            case CAMRY -> countCamry = countCamry + incDec;
            case DYNA -> countDyna = countDyna + incDec;
            case HIACE -> countHiace = countHiace + incDec;
            case SOLARA -> countSolara = countSolara + incDec;
        }
    }

    public Vehicle getVehicle(Toyota model) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null && vehicles[i].getModel().equals(model)) {
                vehicleCount(vehicles[i].getModel(), false);
                Vehicle vehicle = vehicles[i];
                vehicles[i] = null;
                vehicleLimit++;
                currentVeniclesCount--;
                return vehicle;
            }
        }
        return null;
    }

    public void showWarehouseVehicleCount() {
        System.out.println("На складе есть :\n"
                + "Camry= " + countCamry
                + ", Dyna= " + countDyna
                + ", Hiace= " + countHiace
                + ", Solara= " + countSolara);
    }
}

