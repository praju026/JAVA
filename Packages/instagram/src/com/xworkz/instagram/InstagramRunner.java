package com.xworkz.instagram;

import com.xworkz.instagram.login.InstagramLogin;

public class InstagramRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        InstagramLogin login = new InstagramLogin();

        login.setUserName("praju123");
        String userName = login.getUserName();

        login.setPassword("securePass@123");
        String password = login.getPassword();

        login.setConfirmPassword("securePass@123");
        String confirmPassword = login.getConfirmPassword();

        login.setDateOfBirth("2001-06-10");
        String dob = login.getDateOfBirth();

        login.setAge(24);
        int age = login.getAge();
        System.out.println("MAIN ENDED");
    }
}
