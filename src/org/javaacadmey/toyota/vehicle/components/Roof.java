package org.javaacadmey.toyota.vehicle.components;

public class Roof {
    private boolean isRoofUp;

    public Roof() {
        this.isRoofUp = true;
    }

    public void setRoofUp(boolean roofUp) {
        isRoofUp = roofUp;
        if (!isRoofUp) {
            System.out.println("Опускаем крышу");
        } else {
            System.out.println("Крышу поднимаем");
        }
    }

    public boolean isRoofUp() {
        return isRoofUp;
    }
}
