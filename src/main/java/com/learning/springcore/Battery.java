package com.learning.springcore;

public class Battery {
    private int capacityInmah;
    private int warrantyYears;
    private String typeOfBattery;

    public Battery(int capacityInmah, int warrantyYears, String typeOfBattery) {
        this.capacityInmah = capacityInmah;
        this.warrantyYears = warrantyYears;
        this.typeOfBattery = typeOfBattery;
        System.out.println("Setting the values from constructor");
    }

    public int getCapacityInmah() {
        return capacityInmah;
    }

    public void setCapacityInmah(int capacityInmah) {
        this.capacityInmah = capacityInmah;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
        System.out.println("Setting warranty from setter method");
    }

    public String getTypeOfBattery() {
        return typeOfBattery;
    }

    public void setTypeOfBattery(String typeOfBattery) {
        this.typeOfBattery = typeOfBattery;
    }

    public void getDetails() {
        System.out.println("The battery type is : " + typeOfBattery +
                           " The battery warranty is : " + warrantyYears + " years");
    }
}
