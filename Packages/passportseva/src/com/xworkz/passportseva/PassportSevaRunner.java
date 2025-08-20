package com.xworkz.passportseva;


import com.xworkz.passportseva.account.CreateAccount;
import com.xworkz.passportseva.passportvalidation.PassportSeva;

public class PassportSevaRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        CreateAccount createAccount =new CreateAccount();
        createAccount.setCpvLocation("PO");
        createAccount.setPassportOffice("BANGALORE");
        createAccount.setGivenName("PRAJWAL");
        createAccount.setSurName("P YADAV");
        createAccount.setDob("26/05/2003");
        createAccount.setEmailId("prajwalpyadav26@gmail.com");
        createAccount.setSameEmailAsLoginId(true);
        createAccount.setLoginId("prajwalpyadav26@gmail.com");
        createAccount.setPwd("12345678");
        createAccount.setConfirmPwd("12345678");
        createAccount.setHintQuestion("FAVOURITE SPORTS");
        createAccount.setHintAns("FOOTBALL");
        createAccount.setCaptcha("QwrQ23");

        PassportSeva passportSeva=new PassportSeva();
        passportSeva.createAccount=createAccount;
        createAccount.getUserInfo();
        System.out.println("ACCOUNT CREATED SUCCESSFULLY");
        System.out.println("MAIN ENDED");
    }
}
