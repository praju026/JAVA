package com.xworkz.egg;

import com.xworkz.egg.egginfo.Egg;

public class EggRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Egg egg = new Egg();

        egg.setCount(100);
        int count = egg.getCount();

        egg.setFarmName("EGG FARM");
        String farmName = egg.getFarmName();

        egg.setPricePerDozen(55.5);
        double pricePerDozen = egg.getPricePerDozen();

        egg.setSize("Medium");
        String size = egg.getSize();

        egg.setType("Chicken");
        String type = egg.getType();

        egg.setWeightPerEgg(40.2f);
        float weightPerEgg = egg.getWeightPerEgg();
        
        System.out.println("MAIN ENDED");
    }
}
