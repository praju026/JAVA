public class ShoppingMall {
    static String name = "LULU Mall";
    static String location = "Rajajinagar, Bangalore";
    static int totalShops = 250;
    static int totalFloors = 5;
    static String openingTime = "10:00 AM";
    static String closingTime = "10:00 PM";
    static boolean hasFoodCourt = true;
    static boolean hasCinemaHall = true;
    

    public static void main(String mall[]) {
	int parkingCapacity = 1500;
    	boolean hasKidsPlayArea = true;
    	boolean hasATM = true;
    	String management = "LULU Group";
    	String contactNumber = "080-98765432";
    	String email = "support@lulumall.com";
    	boolean hasSecurity = true;
    	boolean hasEscalators = true;
   	boolean hasElevators = true;
	boolean wheelchairAccessible = true;
    	int restrooms = 30;
    	boolean wifiAvailable = true;

        System.out.println("Shopping Mall Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Total Shops: " + totalShops);
        System.out.println("Total Floors: " + totalFloors);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Has Food Court: " + hasFoodCourt);
        System.out.println("Has Cinema Hall: " + hasCinemaHall);
        System.out.println("Parking Capacity: " + parkingCapacity);
        System.out.println("Has Kids Play Area: " + hasKidsPlayArea);
        System.out.println("Has ATM: " + hasATM);
        System.out.println("Management: " + management);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Has Security: " + hasSecurity);
        System.out.println("Has Escalators: " + hasEscalators);
        System.out.println("Has Elevators: " + hasElevators);
        System.out.println("Wheelchair Accessible: " + wheelchairAccessible);
        System.out.println("Restrooms: " + restrooms);
        System.out.println("WiFi Available: " + wifiAvailable);
    }
}
