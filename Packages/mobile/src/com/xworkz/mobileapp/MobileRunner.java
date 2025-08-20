package com.xworkz.mobileapp;

import com.xworkz.mobileapp.mobileattributes.Mobile;

public class MobileRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Mobile mobile = new Mobile();

        mobile.setBrand("Samsung");
        String brand = mobile.getBrand();

        mobile.setModel("Galaxy S24 Ultra");
        String model = mobile.getModel();

        mobile.setPrice(139999.99);
        double price = mobile.getPrice();

        mobile.setOs("Android");
        String os = mobile.getOs();

        mobile.setIsNfcAvailable(true);
        boolean isNfcAvailable = mobile.getIsNfcAvailable();

        System.out.println("MAIN ENDED");
    }
}
