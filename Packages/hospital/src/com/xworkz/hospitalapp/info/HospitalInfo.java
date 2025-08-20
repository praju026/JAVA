package com.xworkz.hospitalapp.info;

public class HospitalInfo {
    String hospitalInfo;
    String ownerName;
    boolean isGovt;
    int noOfDocters;
    public void setHospitalInfo(String hospitalInfo) {
        this.hospitalInfo = hospitalInfo;
    }

    public String getHospitalInfo() {
        return hospitalInfo;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setIsGovt(boolean isGovt) {
        this.isGovt = isGovt;
    }

    public boolean getIsGovt() {
        return isGovt;
    }

    public void setNoOfDocters(int noOfDocters) {
        this.noOfDocters = noOfDocters;
    }

    public int getNoOfDocters() {
        return noOfDocters;
    }
}
