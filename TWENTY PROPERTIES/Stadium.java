public class Stadium {
    static String name = "JNS Sports Arena";
    static String location = "Jawaharlal Nehru Stadium , Kerala";
    static int capacity = 60000;
    static String type = "Outdoor";
    static String primarySport = "Football";
    static boolean hasFloodLights = true;
    static boolean hasRoof = false;
    static String builtYear = "1998";
    static String surfaceType = "Grass";


    public static void main(String stadium[]) {
    	boolean hasParking = true;
    	int parkingCapacity = 2000;
    	boolean vipBoxAvailable = true;
    	String management = "Sports Authority of India";
    	int restroomCount = 80;
    	boolean hasScoreboard = true;
    	boolean hasSoundSystem = true;
    	String entryTime = "2:00 PM";
    	String exitTime = "11:00 PM";
    	String contactEmail = "info@nationalsportsarena.in";
    	boolean cctvAvailable = true;

        System.out.println("Stadium Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity);
        System.out.println("Type: " + type);
        System.out.println("Primary Sport: " + primarySport);
        System.out.println("Has Flood Lights: " + hasFloodLights);
        System.out.println("Has Roof: " + hasRoof);
        System.out.println("Built Year: " + builtYear);
        System.out.println("Surface Type: " + surfaceType);
        System.out.println("Has Parking: " + hasParking);
        System.out.println("Parking Capacity: " + parkingCapacity);
        System.out.println("VIP Box Available: " + vipBoxAvailable);
        System.out.println("Management: " + management);
        System.out.println("Restroom Count: " + restroomCount);
        System.out.println("Has Scoreboard: " + hasScoreboard);
        System.out.println("Has Sound System: " + hasSoundSystem);
        System.out.println("Entry Time: " + entryTime);
        System.out.println("Exit Time: " + exitTime);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("CCTV Available: " + cctvAvailable);
    }
}
