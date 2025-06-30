public class Gym {
    
    static boolean personalTrainingAvailable = true;
    static boolean hasCardioSection = true;
    static boolean hasWeightliftingZone = true;
    static boolean hasCrossfitArea = false;
    static int treadmills = 10;
    static int cyclingMachines = 5;
    static boolean steamRoomAvailable = true;
    static boolean wifiAvailable = true;
    static String monthlyFee = "₹1500";
    static String yearlyFee = "₹15000";
    static boolean lockerFacility = true;

    public static void main(String gym[]) {
	String name = "PS GYM";
    	String location = "BTM Layout, Bangalore";
    	String owner = "Rohan Singh";
    	String contactNumber = "9876543210";
    	String email = "contact@irontemple.com";
    	int totalTrainers = 12;
    	int totalMembers = 350;
    	String openingTime = "5:00 AM";
    	String closingTime = "10:00 PM";

        System.out.println("Gym Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Owner: " + owner);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Total Trainers: " + totalTrainers);
        System.out.println("Total Members: " + totalMembers);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Personal Training Available: " + personalTrainingAvailable);
        System.out.println("Has Cardio Section: " + hasCardioSection);
        System.out.println("Has Weightlifting Zone: " + hasWeightliftingZone);
        System.out.println("Has Crossfit Area: " + hasCrossfitArea);
        System.out.println("Treadmills: " + treadmills);
        System.out.println("Cycling Machines: " + cyclingMachines);
        System.out.println("Steam Room Available: " + steamRoomAvailable);
        System.out.println("WiFi Available: " + wifiAvailable);
        System.out.println("Monthly Fee: " + monthlyFee);
        System.out.println("Yearly Fee: " + yearlyFee);
        System.out.println("Locker Facility: " + lockerFacility);
    }
}
