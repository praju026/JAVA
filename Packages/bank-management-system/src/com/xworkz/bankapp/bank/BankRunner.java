package com.xworkz.bankapp.bank;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber="CNR678911179";
        bankAccount.accountHolderName="PRAJWAL P";

        Branch branch = new Branch();
        branch.branchName = "Periya Bus Stop Branch";
        branch.ifscCode = "CNR0001234";
        branch.location = "Periya";
        branch.manager = "Afsar K A";
        bankAccount.branch=branch;
        bankAccount.getAccountInfo();

        BankTransaction bankTransaction = new BankTransaction();
        bankTransaction.balance = 1000;
        bankTransaction.credit(2000);
        bankTransaction.debit(100);


        System.out.println("FINAL BALANCE OF DAY : "+bankTransaction.balance);
        System.out.println("MAIN ENDED");
    }
}
