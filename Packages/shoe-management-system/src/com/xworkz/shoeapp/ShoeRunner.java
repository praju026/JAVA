package com.xworkz.shoeapp;

import com.xworkz.shoeapp.addidas.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Shoe shoe = new Shoe();

        shoe.setBrand("Adidas");
        String brand = shoe.getBrand();

        shoe.setModel("Ultraboost");
        String model = shoe.getModel();

        shoe.setSize(10);
        int size = shoe.getSize();

        shoe.setPrice(12999.50);
        double price = shoe.getPrice();

        System.out.println("MAIN ENDED");
    }
}
