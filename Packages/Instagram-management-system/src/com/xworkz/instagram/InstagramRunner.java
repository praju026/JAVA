package com.xworkz.instagram;

import com.xworkz.instagram.user.UserAccount;
import com.xworkz.instagram.validation.AccountValidation;

public class InstagramRunner {
    public static void main(String[] args) {
        UserAccount userAccount =new UserAccount();

        userAccount.setFirstName("Prajwal");
        userAccount.setSecondName("P");
        userAccount.setDob("26/05/2003");
        userAccount.setGender("Male");
        userAccount.setMailId("prajwalpyadav26@gmail.com");
        userAccount.setPwd("M1887m1887");
        userAccount.setConfirmPwd("M1887m1887");

        AccountValidation accountValidation = new AccountValidation();
        if (accountValidation.validation(userAccount)) {
            accountValidation.getDetails();
            System.out.println("ACCOUNT CREATED SUCCESSFULLY");
        }else System.out.println("ACCOUNT NOT CREATED");
    }
}
