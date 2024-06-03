package com.learning.springcore;

public class Battery {
    private int capacityInmah;
    private int warrantyYears;
    private String typeOfBattery;

    public int getCapacityInmah() {
        return capacityInmah;
    }

    public void setCapacityInmah(int capacityInmah) {
        this.capacityInmah = capacityInmah;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrentyYears) {
        this.warrantyYears = warrentyYears;
    }

    public String getTypeOfBattery() {
        return typeOfBattery;
    }

    public void setTypeOfBattery(String typeOfBattery) {
        this.typeOfBattery = typeOfBattery;
    }
}
