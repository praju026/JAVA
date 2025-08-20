package com.xworkz.facebook;

import com.xworkz.facebook.user.UserAccount;
import com.xworkz.facebook.validation.AccountValidation;

public class FacebookRunner {

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
        }
    }
}
