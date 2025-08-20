package com.xworkz.mobileapp.mobileattributes;

public class Mobile {
  private   String brand;
    private String model;
    private double price;
    private String os;
    private boolean isNfcAvailable;


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setIsNfcAvailable(boolean isNfcAvailable) {
        this.isNfcAvailable = isNfcAvailable;
    }

    public boolean getIsNfcAvailable() {
        return isNfcAvailable;
    }
}
