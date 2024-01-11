package org.javaacadmey.toyota.shop;

import org.javaacadmey.toyota.factory.AssemblyLine;
import org.javaacadmey.toyota.factory.Warehouse;
import org.javaacadmey.toyota.vehicle.Vehicle;
import org.javaacadmey.toyota.vehicle.toyota.Toyota;

import static org.javaacadmey.toyota.vehicle.toyota.Toyota.*;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public Vehicle sellVehicle(Buyer buyer, Warehouse warehouse, AssemblyLine assemblyLine) {
        int buyerMoney = buyer.getMoney();
        if (buyerMoney >= DYNA.getShopPrice()) {
            return takeVehicle(DYNA, warehouse, assemblyLine);
        } else if (buyerMoney >= HIACE.getShopPrice()) {
            return takeVehicle(HIACE, warehouse, assemblyLine);
        } else if (buyerMoney >= SOLARA.getShopPrice()) {
            return takeVehicle(SOLARA, warehouse, assemblyLine);
        } else if (buyerMoney >= CAMRY.getShopPrice()) {
            return takeVehicle(CAMRY, warehouse, assemblyLine);
        }
        return null;
    }

    private boolean searchVehicle(Toyota model, Warehouse warehouse) {
        switch (model) {
            case CAMRY -> {
                return warehouse.getCountCamry() > 0;
            }
            case DYNA -> {
                return warehouse.getCountDyna() > 0;
            }
            case HIACE -> {
                return warehouse.getCountHiace() > 0;
            }
            case SOLARA -> {
                return warehouse.getCountSolara() > 0;
            }
            default -> {
                return false;
            }
        }
    }

    private Vehicle createVehicle(Toyota model, AssemblyLine assemblyLine) {
        switch (model) {
            case CAMRY -> {
                return assemblyLine.createCamry("Black", CAMRY.getShopPrice());
            }
            case DYNA -> {
                return assemblyLine.createDyna("Black", DYNA.getShopPrice());
            }
            case HIACE -> {
                return assemblyLine.createHiace("Black", HIACE.getShopPrice());
            }
            case SOLARA -> {
                return assemblyLine.createSolara("White", SOLARA.getShopPrice());
            }
            default -> {
                return null;
            }
        }
    }

    private Vehicle takeVehicle(Toyota model, Warehouse warehouse, AssemblyLine assemblyLine) {
        if (searchVehicle(model, warehouse)) {
            return warehouse.getVehicle(model);
        } else {
            return createVehicle(model, assemblyLine);
        }
    }
}
