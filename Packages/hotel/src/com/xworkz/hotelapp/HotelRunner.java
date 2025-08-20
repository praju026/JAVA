package com.xworkz.hotelapp;

import com.xworkz.hotelapp.hotelinfo.HotelInfo;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        HotelInfo hotel = new HotelInfo();

        hotel.setNoOfFloors(5);
        int floors = hotel.getNoOfFloors();

        hotel.setNoOfRooms(100);
        int rooms = hotel.getNoOfRooms();

        hotel.setHotelName("The Grand Meridian");
        String name = hotel.getHotelName();

        hotel.setAddress("MG Road, Bengaluru");
        String address = hotel.getAddress();

        hotel.setPrice(4499.99);
        double price = hotel.getPrice();

        System.out.println("MAIN ENDED");
    }
}
