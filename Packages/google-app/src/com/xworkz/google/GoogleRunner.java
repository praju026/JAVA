package com.xworkz.google;

import com.xworkz.google.user.UserAccount;
import com.xworkz.google.validation.GoogleValidation;

public class GoogleRunner {

    public static void main(String[] args) {
        UserAccount userAccount =new UserAccount();

//        userAccount.setFirstName("Prajwal");
        userAccount.setSecondName("P");
        userAccount.setDob("26/05/2003");
        userAccount.setGender("Male");
        userAccount.setMailId("prajwalpyadav26@gmail.com");
        userAccount.setPwd("M1887m1887");
        userAccount.setConfirmPwd("M1887m1887");

        GoogleValidation googleValidation =new GoogleValidation();
//        googleValidation.googleApp(userAccount);
        if (googleValidation.googleApp(userAccount)) {
            googleValidation.getDetails();
        }

    }
}
