public class Court {
    static String name = "High Court of Karnataka";
    static String location = "Bangalore";
    static String courtType = "High Court";
    static int numberOfJudges = 35;
    static int numberOfCasesPerDay = 500;
    static String establishedYear = "1884";
    static String chiefJustice = "Justice A.B. Prasad";
    static boolean hasOnlineFiling = true;
    static boolean isEcourtEnabled = true;
    static int courtRooms = 20;
    

    public static void main(String[] args) {

	boolean libraryAvailable = true;
    	boolean canPublicAttend = true;
    	String contactNumber = "080-12345678";
    	String email = "info@karnatakajudiciary.kar.nic.in";
    	boolean hasCCTV = true;
    	String jurisdiction = "State of Karnataka";
    	boolean hasWaitingLounge = true;
    	String workingHours = "10 AM - 5 PM";
    	boolean hasLift = true;
    	boolean parkingAvailable = true;

        System.out.println("Court Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Court Type: " + courtType);
        System.out.println("Number Of Judges: " + numberOfJudges);
        System.out.println("Number Of Cases Per Day: " + numberOfCasesPerDay);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Chief Justice: " + chiefJustice);
        System.out.println("Has Online Filing: " + hasOnlineFiling);
        System.out.println("Is E-Court Enabled: " + isEcourtEnabled);
        System.out.println("Court Rooms: " + courtRooms);
        System.out.println("Library Available: " + libraryAvailable);
        System.out.println("Can Public Attend: " + canPublicAttend);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Has CCTV: " + hasCCTV);
        System.out.println("Jurisdiction: " + jurisdiction);
        System.out.println("Has Waiting Lounge: " + hasWaitingLounge);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Has Lift: " + hasLift);
        System.out.println("Parking Available: " + parkingAvailable);
    }
}
