package com.xworkz.gunapp;

import com.xworkz.gunapp.gunattributes.Gun;

public class GunRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Gun gun = new Gun();

        gun.setModel("AK47");
        String model = gun.getModel();

        gun.setCapacityMl(46);
        int capacity = gun.getCapacityMl();

        gun.setPressureType("Chamber Pressure");
        String pressureType = gun.getPressureType();

        gun.setPrice(2000000.5);
        double price = gun.getPrice();

        gun.setRangeMeters(49.8f);
        float rangeMeters= gun.getRangeMeters();

        gun.setType("AR");
        String type = gun.getType();
        System.out.println("MAIN ENDED");
    }
}
