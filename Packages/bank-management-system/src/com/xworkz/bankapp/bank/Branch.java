package com.xworkz.bankapp.bank;

public class Branch {
    String branchName;
    String ifscCode;
    String location;
    String manager;

    public void getBranchInfo(){
        System.out.println("BRANCH NAME  : " + branchName);
        System.out.println("IFSC CODE    : " + ifscCode);
        System.out.println("LOCATION     : " + location);
        System.out.println("MANAGER NAME : " + manager);
    }
}
