package com.xworkz.store;

import com.xworkz.store.application.Application;
import com.xworkz.store.playstore.PlayStore;

public class AppRunner {
    public static void main(String[] args) {
        Application application = new Application();

        application.setAppId("1");
        application.setAppName("INSTAGRAM");
        application.setAppSize("49.9 mb");
        application.setDownloads("5,000,000,000 downloads");
        application.setVersion("390.20.1");
        application.setOfferedBy("META");
        application.setRequiredOs("Android 9 or above");
        application.setUpdatedOn("11/08/2025");

        PlayStore playStore = new PlayStore();
        if (playStore.addApplication(application)) {
            playStore.getDetails();
        }else System.out.println(" GETTING DATA FAILED BECAUSE THERE IS NULL VALUE---- FAILED !!!");
    }
}
