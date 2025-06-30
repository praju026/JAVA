public class Satellite {
    static String name = "INSAT-4A";
    static String agency = "ISRO";
    static String launchDate = "2005-12-22";
    static String missionType = "Communication";
    static double weight = 3081.0;
    static String orbitType = "Geostationary";
    static double altitude = 35786; 
    static double speed = 3.07; // km/s
    static String launchVehicle = "Ariane 5";


    public static void main(String[] args) {

    String launchSite = "French Guiana";
    boolean activeStatus = false;
    int transponders = 12;
    String powerSource = "Solar Panels";
    double lifespanYears = 12.0;
    boolean hasCamera = false;
    boolean isReusable = false;
    boolean remoteSensingCapable = false;
    String frequencyBand = "Ku-band";
    String operatorContact = "contact@isro.gov.in";
    String controlCenter = "Hassan, Karnataka";
        System.out.println("Satellite Details:");
        System.out.println("Name: " + name);
        System.out.println("Agency: " + agency);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Mission Type: " + missionType);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Altitude: " + altitude + " km");
        System.out.println("Speed: " + speed + " km/s");
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Active Status: " + activeStatus);
        System.out.println("Transponders: " + transponders);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Lifespan (Years): " + lifespanYears);
        System.out.println("Has Camera: " + hasCamera);
        System.out.println("Is Reusable: " + isReusable);
        System.out.println("Remote Sensing Capable: " + remoteSensingCapable);
        System.out.println("Frequency Band: " + frequencyBand);
        System.out.println("Operator Contact: " + operatorContact);
        System.out.println("Control Center: " + controlCenter);
    }
}
