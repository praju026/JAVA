package com.xworkz.billapp.bill;

public class Bill {
    int billId;
    String user;
    boolean isGstInclusive;
    String dueDate;
    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getBillId() {
        return billId;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setIsGstInclusive(boolean isGstInclusive) {
        this.isGstInclusive = isGstInclusive;
    }

    public boolean getIsGstInclusive() {
        return isGstInclusive;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

}
