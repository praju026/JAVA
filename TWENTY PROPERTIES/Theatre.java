public class Theatre {
    static String name = "PVR Cinemas";
    static String location = "Phoenix Marketcity, Bangalore";
    static int totalScreens = 8;
    static int totalSeats = 1200;
    static String screenType = "IMAX, 4DX";
    static boolean has3D = true;
    static boolean hasDolbyAtmos = true;
    static String openingTime = "9:00 AM";
    static String closingTime = "12:00 AM";


    public static void main(String theatre[]) {

    	boolean hasOnlineBooking = true;
    	boolean hasSnacksCounter = true;
    	boolean hasParking = true;
    	boolean hasVIPLounge = true;
    	String management = "PVR Ltd.";
    	String contactNumber = "080-11112222";
    	String email = "info@pvrcinemas.com";
    	boolean hasSecurityCheck = true;
    	boolean hasWheelchairAccess = true;
    	boolean airConditioned = true;
    	int fireExitDoors = 20;
    	boolean restroomAvailable = true;
        System.out.println("Theatre Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Total Screens: " + totalScreens);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Screen Type: " + screenType);
        System.out.println("Has 3D: " + has3D);
        System.out.println("Has Dolby Atmos: " + hasDolbyAtmos);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Has Online Booking: " + hasOnlineBooking);
        System.out.println("Has Snacks Counter: " + hasSnacksCounter);
        System.out.println("Has Parking: " + hasParking);
        System.out.println("Has VIP Lounge: " + hasVIPLounge);
        System.out.println("Management: " + management);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Has Security Check: " + hasSecurityCheck);
        System.out.println("Has Wheelchair Access: " + hasWheelchairAccess);
        System.out.println("Air Conditioned: " + airConditioned);
        System.out.println("Fire Exit Doors: " + fireExitDoors);
        System.out.println("Restroom Available: " + restroomAvailable);
    }
}
