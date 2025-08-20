package com.xworkz.store.playstore;

import com.xworkz.store.application.Application;
import com.xworkz.store.applicationvalidator.AppValidator;

public class PlayStore {
    Application application;
    public boolean addApplication(Application application){
//        boolean isApplicationValidated = false;
        boolean isAppAdded = false;



        AppValidator appValidator = new AppValidator();
        boolean validApp=appValidator.appValid(application);


        if (validApp){
            isAppAdded=true;
            this.application=application;
            System.out.println("APP ADDED SUCCESSFULLY");
        } else System.out.println("ADDING APPLICATION FAILED");

        return isAppAdded;
    }

    public void getDetails() {
        System.out.println("APP ID : "+application.getAppId());
        System.out.println("APP NAME : "+application.getAppName());
        System.out.println("APP SIZE : "+application.getAppSize());
        System.out.println("DOWNLOADS : "+application.getDownloads());
        System.out.println("VERSION : "+application.getVersion());
        System.out.println("UPDATED ON "+application.getUpdatedOn());
        System.out.println("OS : "+application.getRequiredOs());
        System.out.println("OFFERED BY : "+application.getOfferedBy());
    }
}
