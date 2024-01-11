package org.javaacadmey.toyota.factory;

import org.javaacadmey.toyota.exception.CountyFactoryNotEqualException;
import org.javaacadmey.toyota.vehicle.toyota.Camry;
import org.javaacadmey.toyota.vehicle.toyota.Dyna;
import org.javaacadmey.toyota.vehicle.toyota.Hiace;
import org.javaacadmey.toyota.vehicle.toyota.Solara;

import static org.javaacadmey.toyota.factory.Country.CHINA;
import static org.javaacadmey.toyota.vehicle.toyota.Toyota.*;

public class AssemblyLine {
    private final Factory factory;

    public AssemblyLine(Factory factory) throws CountyFactoryNotEqualException {
        Country country = CHINA;
        if (!country.equals(factory.getCountry())) {
            String s = String.format("Страна (%s) конвеера не совпадает со страной (%s) фабрики",
                    country, factory.getCountry());
            throw new CountyFactoryNotEqualException(s);
        }
        this.factory = factory;
    }

    public Camry createCamry(String color, double cost) {
        return new Camry(color,
                factory.getWheel(CAMRY.getDiameter()),
                factory.getFuelTank(),
                factory.getEngine(),
                factory.getElectrics(),
                factory.getHeadlights(),
                cost,
                factory.getCountry(),
                factory.getCruise(),
                factory.getUsb());
    }

    public Solara createSolara(String color, double cost) {
        return new Solara(color,
                factory.getWheel(SOLARA.getDiameter()),
                factory.getFuelTank(),
                factory.getEngine(),
                factory.getElectrics(),
                factory.getHeadlights(),
                cost,
                factory.getCountry(),
                factory.getCruise(),
                factory.getRoof(),
                factory.getFridge());
    }

    public Hiace createHiace(String color, double cost) {
        return new Hiace(color,
                factory.getWheel(HIACE.getDiameter()),
                factory.getFuelTank(),
                factory.getEngine(),
                factory.getElectrics(),
                factory.getHeadlights(),
                cost,
                factory.getCountry());
    }

    public Dyna createDyna(String color, double cost) {
        return new Dyna(color,
                factory.getWheel(DYNA.getDiameter()),
                factory.getFuelTank(),
                factory.getEngine(),
                factory.getElectrics(),
                factory.getHeadlights(),
                cost,
                factory.getCountry(),
                factory.getCharging());
    }
}
