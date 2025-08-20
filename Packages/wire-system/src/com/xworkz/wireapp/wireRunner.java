package com.xworkz.wireapp;

import com.xworkz.wireapp.wireinfo.Wire;

public class wireRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        Wire wire = new Wire();

        wire.setWireId(101);
        int id = wire.getWireId();

        wire.setLength(25);
        int length = wire.getLength();

        wire.setColor("Red");
        String color = wire.getColor();

        wire.setBrandName("Finolex");
        String brand = wire.getBrandName();

        wire.setPrice(499.99);
        double price = wire.getPrice();

        System.out.println("MAIN ENDED");
    }
}
