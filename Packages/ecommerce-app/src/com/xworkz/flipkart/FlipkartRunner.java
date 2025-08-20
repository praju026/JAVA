package com.xworkz.flipkart;

import com.xworkz.flipkart.category.FlipkartCategory;

public class FlipkartRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        FlipkartCategory category = new FlipkartCategory();

        category.setDailyUtilities("Toothpaste, Soap");
        String utilities = category.getDailyUtilities();

        category.setSports("Cricket, Badminton");
        String sports = category.getSports();

        category.setShoes("Running Shoes, Sneakers");
        String shoes = category.getShoes();

        category.setDress("T-Shirts, Jeans");
        String dress = category.getDress();

        category.setFood("Snacks, Beverages");
        String food = category.getFood();

        System.out.println("MAIN ENDED");
    }
}
