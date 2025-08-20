package com.xworkz.bankapp;

import com.xworkz.bankapp.bankaccount.BankAccount;
import com.xworkz.bankapp.savingsaccount.SavingsAccount;

public class BankRunner {
    public static void main(String[] args) {

        BankAccount prajuAccount = new BankAccount();
        prajuAccount.credit(1_00_000);
        System.out.println("THE BALANCE ON PRAJU ACCOUNT "+prajuAccount.getBalance());
        System.out.println("---------------------------------------------------------");

        SavingsAccount dadAccount =new SavingsAccount();
        prajuAccount.transfer(dadAccount,15_000);
        System.out.println("THE BALANCE ON DAD ACCOUNT "+dadAccount.getBalance());
        System.out.println("---------------------------------------------------------");

        SavingsAccount momAccount =new SavingsAccount();
        prajuAccount.transfer(momAccount,15_000);
        System.out.println("THE BALANCE ON MOM ACCOUNT "+momAccount.getBalance());
        System.out.println("---------------------------------------------------------");

        SavingsAccount sisAccount =new SavingsAccount();
        prajuAccount.transfer(sisAccount,15_000);
        System.out.println("THE BALANCE ON SISTER ACCOUNT "+sisAccount.getBalance());
        System.out.println("---------------------------------------------------------");

        SavingsAccount jashAccount =new SavingsAccount();
        prajuAccount.transfer(jashAccount,10_000);
        System.out.println("THE BALANCE ON JASH ACCOUNT "+jashAccount.getBalance());
        System.out.println("---------------------------------------------------------");

        SavingsAccount sujayAccount =new SavingsAccount();
        prajuAccount.transfer(sujayAccount,22);
        System.out.println("THE BALANCE ON SUJAY ACCOUNT "+sujayAccount.getBalance());
        System.out.println("---------------------------------------------------------");

        SavingsAccount pablosAccount =new SavingsAccount();
        prajuAccount.transfer(pablosAccount,10_000);
        System.out.println("THE BALANCE ON PABLOS ACCOUNT "+pablosAccount.getBalance());
        System.out.println("---------------------------------------------------------");

        System.out.println("THE BALANCE ON PRAJU ACCOUNT "+prajuAccount.getBalance());

    }
}
