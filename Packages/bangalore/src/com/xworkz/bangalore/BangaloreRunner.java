package com.xworkz.bangalore;

import com.xworkz.bangalore.city.BangaloreCity;

public class BangaloreRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        BangaloreCity city = new BangaloreCity();

        city.setCityName("Bengaluru");
        String name = city.getCityName();

        city.setPinCode(560001);
        int pin = city.getPinCode();

        city.setIsBusAvailable(true);
        boolean bus = city.getIsBusAvailable();

        city.setIsMetroAvailable(true);
        boolean metro = city.getIsMetroAvailable();

        city.setMainAttraction("Lalbagh Botanical Garden");
        String attraction = city.getMainAttraction();

        System.out.println("MAIN ENDED");
    }
}
