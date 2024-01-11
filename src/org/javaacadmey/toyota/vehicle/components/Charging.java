package org.javaacadmey.toyota.vehicle.components;

public class Charging {
    private boolean isWork;

    public Charging() {
        this.isWork = false;
    }

    public void setWork(boolean work) {
        isWork = work;
        if (isWork) {
            System.out.println("Заряжаем телефон");
        } else {
            System.out.println("Зарядка выключена");
        }
    }

    public boolean isWork() {
        return isWork;
    }
}
