package com.xworkz.bangalore.city;

public class BangaloreCity {
    String cityName;
    int pinCode;
    boolean isBusAvailable;
    boolean isMetroAvailable;
    String mainAttraction;
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setIsBusAvailable(boolean isBusAvailable) {
        this.isBusAvailable = isBusAvailable;
    }

    public boolean getIsBusAvailable() {
        return isBusAvailable;
    }

    public void setIsMetroAvailable(boolean isMetroAvailable) {
        this.isMetroAvailable = isMetroAvailable;
    }

    public boolean getIsMetroAvailable() {
        return isMetroAvailable;
    }

    public void setMainAttraction(String mainAttraction) {
        this.mainAttraction = mainAttraction;
    }

    public String getMainAttraction() {
        return mainAttraction;
    }
}
