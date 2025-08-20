package com.xworkz.passportseva.passportvalidation;

import com.xworkz.passportseva.account.CreateAccount;

public class PassportSeva {
    public CreateAccount createAccount ;
    public boolean CreatePassportUser(CreateAccount createAccount){
        boolean isPassportUserCreated=false;
        boolean cpvLocationValid=false;
        boolean passportOfficeValid =false;
        boolean givenNameValid=false;
        boolean surNameValid =false;
        boolean dobValid=false;
        boolean emailIdValid=false;
        boolean sameEmaiLandLoginIdValid=false;
        boolean pwdValid=false;
        boolean confirmPwdValid=false;
        boolean hintQuesionValid=false;
        boolean hintAnsValid=false;
        boolean captchaValid=false;

    if(createAccount.getCpvLocation() !=null){
         cpvLocationValid = true;
    }else System.out.println("GIVE VALID CPV LOCATION");

    if (createAccount.getPassportOffice()!=null){
        passportOfficeValid=true;
    }else System.out.println("CHOOSE VALID PASSPORT OFFICE");

    if (createAccount.getGivenName()!=null){
        givenNameValid=true;
    }else System.out.println("TRY AGAIN");

    if (createAccount.getSurName()!=null){
        surNameValid=true;
    }else System.out.println("TRY AGAIN");

    if (createAccount.getDob()!=null){
        dobValid=true;
    }else System.out.println("NOT VALID");

    if (createAccount.getEmailId()!=null){
        emailIdValid=true;
    }else System.out.println("NOT VALID");

    if (createAccount.getSameEmailAsLoginId()!=false){
        sameEmaiLandLoginIdValid=true;
    }else System.out.println("NOT VALID");

    if (createAccount.getPwd()!=null){
        pwdValid=true;
    }else System.out.println("NOT VALID");

    if (createAccount.getConfirmPwd()!=null){
        confirmPwdValid=true;
    }else System.out.println("NOT VALID");

    if (createAccount.getHintQuestion()!=null){
        hintQuesionValid = true;
    }else System.out.println("NOT VALID");

    if (createAccount.getHintAns()!=null){
        hintAnsValid=true;
    }else System.out.println("NOT VALID");

    if (createAccount.getCaptcha()!=null){
        captchaValid=true;
    }else System.out.println("NOT VALID");

    if (captchaValid&&dobValid&&confirmPwdValid&&emailIdValid&&hintAnsValid&&passportOfficeValid&&pwdValid&&sameEmaiLandLoginIdValid&&surNameValid&&cpvLocationValid&&givenNameValid){
        isPassportUserCreated=true;
    }

    return isPassportUserCreated;

    }
}
