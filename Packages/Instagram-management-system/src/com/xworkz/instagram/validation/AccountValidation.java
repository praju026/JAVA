package com.xworkz.instagram.validation;

import com.xworkz.instagram.user.UserAccount;

public class AccountValidation {
UserAccount userAccount;

    public boolean validation(UserAccount userAccount){
        boolean isInstaAccountValid = false;

        boolean firstNameValid = false;
        boolean secondNameValid = false;
        boolean dobValid = false;
        boolean genderValid = false;
        boolean mailIdValid = false;
        boolean pwdValid = false;
        boolean confirmPwdValid = false;

        if (userAccount.getFirstName()!=null){
            firstNameValid =true;
        }else System.out.println("NOT VALID");

        if (userAccount.getSecondName()!=null){
            secondNameValid =true;
        }else System.out.println("NOT VALID");

        if (userAccount.getDob()!=null){
            dobValid=true;
        }else System.out.println("NOT VALID");

        if (userAccount.getGender()!=null){
            genderValid=true;
        }else System.out.println("NOT VALID");

        if (userAccount.getMailId()!=null){
            mailIdValid=true;
        }else System.out.println("NOT VALID");

        if (userAccount.getPwd()!=null){
            pwdValid=true;
        }else System.out.println("NOT VALID");

        if (userAccount.getConfirmPwd()!=null &&userAccount.getConfirmPwd()==userAccount.getPwd()){
            confirmPwdValid=true;
        }else System.out.println("CHECK PASSWORD AGAIN");

        if (confirmPwdValid && dobValid && firstNameValid && genderValid && mailIdValid && pwdValid && secondNameValid ) {
            isInstaAccountValid = true;
            this.userAccount = userAccount;
        }

        return isInstaAccountValid;
    }
    public void getDetails(){
        System.out.println("FIRST NAME : "+userAccount.getFirstName());
        System.out.println("SECOND NAME : "+userAccount.getSecondName());
        System.out.println("DATE OF BIRTH : "+userAccount.getDob());
        System.out.println("GENDER : "+userAccount.getGender());
        System.out.println("MAIL ID : "+userAccount.getMailId());
        System.out.println("PASSWORD : "+userAccount.getPwd());
        System.out.println("CONFIRM PASSWORD : "+userAccount.getConfirmPwd());
    }
}
