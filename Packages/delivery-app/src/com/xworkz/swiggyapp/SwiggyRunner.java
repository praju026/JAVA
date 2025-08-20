package com.xworkz.swiggyapp;

import com.xworkz.swiggyapp.account.SwiggyAccount;

public class SwiggyRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        SwiggyAccount account = new SwiggyAccount();

        account.setUserId(1001);
        int userId = account.getUserId();

        account.setUserName("praju_user");
        String userName = account.getUserName();

        account.setPassword("praju@123");
        String password = account.getPassword();

        account.setAddress("123, 2nd Cross, Jayanagar, Bengaluru");
        String address = account.getAddress();


    }
}
