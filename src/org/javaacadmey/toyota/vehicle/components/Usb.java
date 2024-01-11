package org.javaacadmey.toyota.vehicle.components;

public class Usb {
    private boolean isWork;

    public Usb() {
        this.isWork = false;
    }

    public void setWork(boolean work) {
        isWork = work;
        if (isWork) {
            System.out.println("Юсб включен");
        } else {
            System.out.println("ЮСб выключены");
        }
    }
}
