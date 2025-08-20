package com.xworkz.gymapp;
import com.xworkz.gymapp.registration.GymRegistration;

public class GymRunner {
    public static void main(String[] args) {
        GymRegistration gym = new GymRegistration();
        gym.setGymId(1);
        int gymId = gym.getGymId();

        gym.setUserName("BABU");
        String userName = gym.getUserName();

        gym.setDateOfBirth("26/05/2010");
        String dateOfBirth = gym.getDateOfBirth();

        gym.setPassword("123456");
        String password = gym.getPassword();

        gym.setIsTrainedNeeded(true);
        boolean isTrainerNeeded = gym.getIsTrainerNeeded();
    }
}
