package org.javaacadmey.toyota.vehicle.components;

public class Fridge {
    private boolean isWork;

    public Fridge() {
        this.isWork = false;
    }

    public void setWork(boolean work) {
        isWork = work;
        if (isWork) {
            System.out.println("Охлаждаем напитки");
        } else {
            System.out.println("Выключили холодильник");
        }
    }

    public boolean isWork() {
        return isWork;
    }
}
