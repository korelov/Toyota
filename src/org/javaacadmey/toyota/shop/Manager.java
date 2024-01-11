package org.javaacadmey.toyota.shop;

import org.javaacadmey.toyota.factory.AssemblyLine;
import org.javaacadmey.toyota.factory.Warehouse;
import org.javaacadmey.toyota.vehicle.Vehicle;

import static org.javaacadmey.toyota.vehicle.toyota.Toyota.*;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public Vehicle sellVehicle(Buyer buyer, Warehouse warehouse, AssemblyLine assemblyLine) {
        int buyerMoney = buyer.getMoney();
        String model;
        if (buyerMoney >= DYNA.getShopPrice()) {
            model = "Dyna";
            return takeVehicle(model, warehouse, assemblyLine);
        } else if (buyerMoney >= HIACE.getShopPrice()) {
            model = "Hiace";
            return takeVehicle(model, warehouse, assemblyLine);
        } else if (buyerMoney >= SOLARA.getShopPrice()) {
            model = "Solara";
            return takeVehicle(model, warehouse, assemblyLine);
        } else if (buyerMoney >= CAMRY.getShopPrice()) {
            model = "Camry";
            return takeVehicle(model, warehouse, assemblyLine);
        }
        return null;
    }

    private boolean searchVehicle(String model, Warehouse warehouse) {
        switch (model) {
            case "Camry" -> {
                return warehouse.getCountCamry() > 0;
            }
            case "Dyna" -> {
                return warehouse.getCountDyna() > 0;
            }
            case "Hiace" -> {
                return warehouse.getCountHiace() > 0;
            }
            case "Solara" -> {
                return warehouse.getCountSolara() > 0;
            }
            default -> {
                return false;
            }
        }
    }

    private Vehicle createVehicle(String model, AssemblyLine assemblyLine) {
        switch (model) {
            case "Camry" -> {
                return assemblyLine.createCamry("Black", CAMRY.getShopPrice());
            }
            case "Dyna" -> {
                return assemblyLine.createDyna("Black", DYNA.getShopPrice());
            }
            case "Hiace" -> {
                return assemblyLine.createHiace("Black", HIACE.getShopPrice());
            }
            case "Solara" -> {
                return assemblyLine.createSolara("White", SOLARA.getShopPrice());
            }
            default -> {
                return null;
            }
        }
    }

    private Vehicle takeVehicle(String model, Warehouse warehouse, AssemblyLine assemblyLine) {
        if (searchVehicle(model, warehouse)) {
            return warehouse.getVehicle(model);
        } else {
            return createVehicle(model, assemblyLine);
        }
    }
}
