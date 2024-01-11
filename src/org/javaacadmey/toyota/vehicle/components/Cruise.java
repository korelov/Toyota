package org.javaacadmey.toyota.vehicle.components;

public class Cruise {
    private boolean isCruiseControl;

    public Cruise() {
        this.isCruiseControl = false;
    }

    public void setCruiseControl(boolean cruiseControl) {
        isCruiseControl = cruiseControl;
        if (isCruiseControl) {
            System.out.println("Круиз работают");
        } else {
            System.out.println("Круиз выключены");
        }
    }

    public boolean isCruiseControl() {
        return isCruiseControl;
    }
}
