package org.javaacadmey.toyota;

import org.javaacadmey.toyota.exception.CountyFactoryNotEqualException;
import org.javaacadmey.toyota.factory.AssemblyLine;
import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.factory.Factory;
import org.javaacadmey.toyota.factory.Warehouse;
import org.javaacadmey.toyota.shop.Buyer;
import org.javaacadmey.toyota.shop.Cashier;
import org.javaacadmey.toyota.shop.Manager;
import org.javaacadmey.toyota.vehicle.Vehicle;
import org.javaacadmey.toyota.vehicle.toyota.Camry;
import org.javaacadmey.toyota.vehicle.toyota.Dyna;
import org.javaacadmey.toyota.vehicle.toyota.Hiace;
import org.javaacadmey.toyota.vehicle.toyota.Solara;


public class Runner {


    public static void main(String[] args) throws CountyFactoryNotEqualException {
        Buyer buyer1 = new Buyer("Максим", 10_000);
        Buyer buyer2 = new Buyer("Олег", 12_000);
        Buyer buyer3 = new Buyer("Маша", 15_000);
        Buyer buyer4 = new Buyer("Оля", 22_000);
        Buyer buyer5 = new Buyer("Юра", 11_000);
        Buyer buyer6 = new Buyer("Вика", 13_000);
        Buyer buyer7 = new Buyer("Миша", 8_000);
        Buyer buyer8 = new Buyer("Саша", 30_000);
        Buyer[] buyers = {buyer1, buyer2, buyer3, buyer4, buyer5, buyer6, buyer7, buyer8};
        Manager manager = new Manager("Борис");

        Warehouse warehouse = new Warehouse();
        Factory factory = new Factory(Country.CHINA);
        AssemblyLine assemblyLine = new AssemblyLine(factory);

        Camry camry = assemblyLine.createCamry("Black", 10_000);
        Solara solara = assemblyLine.createSolara("White", 12_000);
        Hiace hiace = assemblyLine.createHiace("Black", 15_000);
        Dyna dyna = assemblyLine.createDyna("Black", 22_000);

        warehouse.addVehicle(camry);
        warehouse.addVehicle(solara);
        warehouse.addVehicle(hiace);
        warehouse.addVehicle(dyna);

        double costPrice = 0;
        for (int i = 0, buyersLength = buyers.length; i < buyersLength; i++) {
            Buyer buyer = buyers[i];
            Vehicle vehicle = manager.sellVehicle(buyer, warehouse, assemblyLine);
            if (vehicle != null) {
                Cashier.setAccountIncome(vehicle.getCost());
                costPrice += vehicle.getModel().getCostPrice();
            }
        }
        System.out.println("Общая выручка " + Cashier.getAccountIncome());
        System.out.println("Себистоимость " + costPrice);
        System.out.println("Выручка " + (Cashier.getAccountIncome() - costPrice));
    }
}
