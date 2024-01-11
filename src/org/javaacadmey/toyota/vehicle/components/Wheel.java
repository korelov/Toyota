package org.javaacadmey.toyota.vehicle.components;

public class Wheel {
    private final int diameter;
    private boolean isPuncture;

    public Wheel(int diameter) {
        isPuncture = false;
        this.diameter = diameter;
    }

    public void setPuncture(boolean puncture) {
        isPuncture = puncture;
    }

    public boolean isPuncture() {
        return isPuncture;
    }

    public void wheelReplacement(int radius) {
        setPuncture(this.diameter == radius);
    }
}
