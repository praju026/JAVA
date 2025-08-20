package com.xworkz.gunapp.gunattributes;

public class Gun {
    private String model;
    private String type;
    private int capacityMl;
    private float rangeMeters;
    private String pressureType;
    private double price;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setCapacityMl(int capacityMl) {
        this.capacityMl = capacityMl;
    }

    public int getCapacityMl() {
        return capacityMl;
    }

    public void setRangeMeters(float rangeMeters) {
        this.rangeMeters = rangeMeters;
    }

    public float getRangeMeters() {
        return rangeMeters;
    }

    public void setPressureType(String pressureType) {
        this.pressureType = pressureType;
    }

    public String getPressureType() {
        return pressureType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
