package com.system_design.lld.AmazonLocker;

public class Compartment {
    private final Size size;
    private boolean occupied;

    public Compartment(Size size) {
        this.size = size;
        this.occupied = false;
    }

    public Size getSize() {
        return size;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void markOccupied() {
        this.occupied = true;
    }

    public void markFree() {
        this.occupied = false;
    }

    public void open() {
    }
}
