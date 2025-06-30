public class Temple {
    static String name = "Guruvayur Sree Krishna Temple";
    static String location = "Guruvayur, Thrissur District, Kerala, India";
    static String deity = "Lord Guruvayoorappan (Lord Krishna)";
    static int builtYear = 1500; 
    static String architectureStyle = "Kerala Style";
    static boolean hasGopuram = true; 
    static boolean isHeritageSite = true;
    static int dailyVisitors = 40000; 
    static String mainFestival = "Guruvayoor Utsavam (Annual Festival)";


    public static void main(String temple[]) {
    	boolean prasadamAvailable = true;
    	boolean hasAccommodation = true;
    	boolean onlineDarshanBooking = true;
    	String templeTrust = "Guruvayur Devaswom";
    	String contactNumber = "+919645566258";
    	String email = "info@guruvayurdevaswom.nic.in";
    	boolean hasCCTV = true;
    	String openingTime = "3:00 AM";
    	String closingTime = "9:30 PM";
    	boolean hasDonationCounter = true;
	boolean hasWheelchairAccess = true;

        System.out.println("Temple Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Deity: " + deity);
        System.out.println("Built Year: " + builtYear);
        System.out.println("Architecture Style: " + architectureStyle);
        System.out.println("Has Gopuram: " + hasGopuram);
        System.out.println("Is Heritage Site: " + isHeritageSite);
        System.out.println("Daily Visitors: " + dailyVisitors);
        System.out.println("Main Festival: " + mainFestival);
        System.out.println("Prasadam Available: " + prasadamAvailable);
        System.out.println("Has Accommodation: " + hasAccommodation);
        System.out.println("Online Darshan Booking: " + onlineDarshanBooking);
        System.out.println("Temple Trust: " + templeTrust);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Has CCTV: " + hasCCTV);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Has Donation Counter: " + hasDonationCounter);
        System.out.println("Has Wheelchair Access: " + hasWheelchairAccess);
    }
}