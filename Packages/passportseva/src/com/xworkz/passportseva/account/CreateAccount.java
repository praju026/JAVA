package com.xworkz.passportseva.account;

public class CreateAccount {
    private String cpvLocation;
    private String passportOffice;
    private  String givenName;
    private String surName;
    private String dob;
    private String emailId;
    private boolean sameEmailAsLoginId;
    private String loginId;
    private String pwd;
    private String confirmPwd;
    private String hintQuestion;
    private String hintAns;
    private String captcha;

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }
    public void setCpvLocation( String cpvLocation){
        this.cpvLocation=cpvLocation;
    }

    public String getCpvLocation() {
        return cpvLocation;
    }

    public void setPassportOffice(String passportOffice) {
        this.passportOffice = passportOffice;
    }

    public String getPassportOffice() {
        return passportOffice;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }
    public void setSameEmailAsLoginId(boolean sameEmailAsLoginId){
        this.sameEmailAsLoginId=sameEmailAsLoginId;
    }
    public boolean getSameEmailAsLoginId(){
        return sameEmailAsLoginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }

    public String getConfirmPwd() {
        return confirmPwd;
    }

    public void setHintQuestion(String hintQuestion) {
        this.hintQuestion = hintQuestion;
    }

    public String getHintQuestion() {
        return hintQuestion;
    }

    public void setHintAns(String hintAns) {
        this.hintAns = hintAns;
    }

    public String getHintAns() {
        return hintAns;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void getUserInfo(){
        System.out.println("GIVEN NAME : "+getGivenName());
        System.out.println("SUR NAME : "+getSurName());
        System.out.println("DOB : "+getDob());
        System.out.println("CPV : "+getCpvLocation());
        System.out.println("PASSPORT OFFICE : "+getPassportOffice());
        System.out.println("EMAIL ID : "+getEmailId());
        System.out.println("IS EMAIL ID & LOGIN ID SAME : "+getSameEmailAsLoginId());
        System.out.println("LOGIN ID : "+getLoginId());
        System.out.println("PASSWORD : "+getPassportOffice());
        System.out.println("CONFIRM PASSWORD : "+getConfirmPwd());
        System.out.println("HINT QUESTION : "+getHintQuestion());
        System.out.println("HINT ANSWER : "+getHintAns());
        System.out.println("CAPTCHA : "+getCaptcha());
    }
}
