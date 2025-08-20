package com.xworkz.bankapp.bank;

public class BankAccount {
    String accountNumber;
    String accountHolderName;
    Branch branch;
    public void getAccountInfo(){
        System.out.println("ACCOUNT HOLDER NAME : "+accountHolderName);
        System.out.println("ACCOUNT NUMBER : "+accountNumber);
        this.branch.getBranchInfo();
    }
}
