package com.xworkz.bankapp.bank;

public class BankTransaction {
    double balance;
    public  void credit(double amount) {
        boolean isCredited = false;
        boolean check = amount > 0.00;
        if (check) {
            balance = amount + balance;
            isCredited = true;
            System.out.println("CREDITED AN AMOUNT OF " + amount);
            System.out.println("BALANCE NOW : "+balance);
        } else {
            System.out.println("Amount has to be greater than zero");
        }
    }

    public void debit(double amount) {
        boolean isDebited = false;
        boolean check = amount <= balance;
        if (check) {
            balance = balance - amount;
            isDebited = true;
            System.out.println("DEBITED AMOUNT IS " + amount);
            System.out.println("BALANCE NOW : "+balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
