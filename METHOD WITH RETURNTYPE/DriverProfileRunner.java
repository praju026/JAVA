class DriverProfileRunner{
public static void main(String driver[]){
	System.out.println("MAIN STARTED");

	String name = DriverProfile.getDriverName();
	System.out.println("DRIVER NAME : "+name);
	byte exp = DriverProfile.getExperience();
	System.out.println("DRIVER EXPERIENCE : "+exp);
	short trip = DriverProfile.getTrip();
	System.out.println("TOTAL TRIPS : "+trip);
	int id = DriverProfile.getDriverId();
	System.out.println("DRIVER ID : "+id);
	long number = DriverProfile.getContactNumber();
	System.out.println("CONTACT NUMBER : "+number);
	float rating = DriverProfile.getRating();
	System.out.println("DRIVER RATING : "+rating);
	double earning = DriverProfile.getEarning();
	System.out.println("DRIVER EARININGS : "+earning);
	char gender = DriverProfile.getGender();
	System.out.println("GENDER : "+gender);
	boolean isAvailable= DriverProfile.getAvailability();
	System.out.println("IS AVAILABILE : "+isAvailable);
	
	System.out.println("MAIN ENDED");
	}
}