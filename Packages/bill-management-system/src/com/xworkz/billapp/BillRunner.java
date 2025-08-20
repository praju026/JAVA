package com.xworkz.billapp;

import com.xworkz.billapp.bill.Bill;

public class BillRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        Bill bill = new Bill();

        bill.setBillId(2025);
        int billId = bill.getBillId();

        bill.setUser("Praju");
        String user = bill.getUser();

        bill.setIsGstInclusive(true);
        boolean isGstInclusive = bill.getIsGstInclusive();

        bill.setDueDate("2025-08-10");
        String dueDate = bill.getDueDate();
        System.out.println("MAIN ENDED");
    }
}
