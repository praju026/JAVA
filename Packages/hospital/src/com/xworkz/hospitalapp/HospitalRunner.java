package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.info.HospitalInfo;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        HospitalInfo hospital = new HospitalInfo();

        hospital.setHospitalInfo("City Multi-specialty Hospital");
        String info = hospital.getHospitalInfo();

        hospital.setOwnerName("Dr. Asha Kumar");
        String owner = hospital.getOwnerName();

        hospital.setIsGovt(false);
        boolean isGovt = hospital.getIsGovt();

        hospital.setNoOfDocters(42);
        int doctorCount = hospital.getNoOfDocters();

        System.out.println("MAIN ENDED");
    }
}
