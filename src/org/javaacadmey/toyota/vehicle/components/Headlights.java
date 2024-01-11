package org.javaacadmey.toyota.vehicle.components;

public class Headlights {
    private boolean isWork;

    public Headlights() {
        this.isWork = false;
    }

    public void setWork(boolean work) {
        isWork = work;
        if (isWork) {
            System.out.println("Фары работают");
        } else {
            System.out.println("Фары выключены");
        }
    }
}
