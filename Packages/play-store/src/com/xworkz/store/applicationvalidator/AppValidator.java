package com.xworkz.store.applicationvalidator;

import com.xworkz.store.application.Application;

public class AppValidator {

    public boolean appValid(Application application){
        boolean isAppValid = false;
        boolean idValid = false;
        boolean appNameValid = false;
        boolean versionValid = false;
        boolean updatedOnValid = false;
        boolean downloadsValid = false;
        boolean appSizeValid = false;
        boolean requiredOsValid = false;
        boolean offeredByValid = false;

        if (application.getAppId() !=null &&  !application.getAppId().isEmpty()){
            idValid=true;
        }else System.out.println("ID NOT VALID");

        if (application.getAppName() !=null && !application.getAppName().isEmpty()){
            appNameValid=true;
        }else System.out.println("NAME NOT VALID");

        if (application.getVersion() !=null && !application.getVersion().isEmpty()){
            versionValid=true;
        }else System.out.println("VERSION NOT VALID");

        if (application.getUpdatedOn()!=null && !application.getUpdatedOn().isEmpty()){
            updatedOnValid=true;
        }else System.out.println("UPDATED VALUE NOT VALID");

        if (application.getDownloads()!=null && !application.getDownloads().isEmpty()){
            downloadsValid=true;
        }else System.out.println("INVALID");

        if (application.getAppSize()!=null && !application.getAppSize().isEmpty()){
            appSizeValid=true;
        }else System.out.println("APP SIZE NOT VALID");

        if (application.getRequiredOs()!=null && !application.getRequiredOs().isEmpty()){
            requiredOsValid=true;
        }else System.out.println("OS NOT VALID");

        if (application.getOfferedBy()!=null && !application.getOfferedBy().isEmpty()){
            offeredByValid=true;
        }else System.out.println("NOT VALID");

        if (idValid && appNameValid && versionValid && updatedOnValid &&
                downloadsValid && appSizeValid && requiredOsValid && offeredByValid) {
            isAppValid = true;
        }

        return isAppValid;
    }
}
