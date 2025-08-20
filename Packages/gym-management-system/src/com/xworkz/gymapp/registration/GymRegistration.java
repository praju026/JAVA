package com.xworkz.gymapp.registration;

public class GymRegistration {
    private int gymId;
    public int getGymId() {
        return gymId;
    }
    public void setGymId(int gymId) {
        this.gymId = gymId;
    }
    private  String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String dateOfBirth;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private boolean isTrainerNeeded;
    public boolean getIsTrainerNeeded() {
        return isTrainerNeeded;
    }

    public void setIsTrainedNeeded(boolean isTrainerNeeded){
        this.isTrainerNeeded=isTrainerNeeded;
    }
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
