package com.xworkz.wireapp.wireinfo;

public class Wire {
    int wireId;
    int length;
    String color;
    String brandName;
    double price;

    public void setWireId(int wireId) {
        this.wireId = wireId;
    }

    public int getWireId() {
        return wireId;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
