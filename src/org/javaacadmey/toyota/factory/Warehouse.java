package org.javaacadmey.toyota.factory;

import org.javaacadmey.toyota.vehicle.Vehicle;

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

    public void addCar(Vehicle vehicle) {
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

    private void vehicleCount(String model, boolean addGetVehicle) {
        int incDec;
        if (addGetVehicle) {
            incDec = 1;
        } else {
            incDec = -1;
        }
        switch (model) {
            case "Camry" -> countCamry = countCamry + incDec;
            case "Dyna" -> countDyna = countDyna + incDec;
            case "Hiace" -> countHiace = countHiace + incDec;
            case "Solara" -> countSolara = countSolara + incDec;
        }
    }

    public Vehicle getVehicle(String model) {
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

