class DriverProfile {
    static byte experienceYears;
    static short totalTrips;              
    static int driverId ;               
    static long contactNumber ;
    static float rating ;      
    static double earnings;            
    static char gender;                     
    static boolean isAvailable;            
    static String driverName ; 

public static String getDriverName(){
	driverName = "Kannan";
	return driverName;
	}

public static byte getExperience(){
	experienceYears = 5;
	return experienceYears;
	}
public static short getTrip(){
	totalTrips = 1500;
	return totalTrips;
	}
public static int getDriverId(){
	driverId = 100234;
	return driverId;
	}
public static long getContactNumber(){
	contactNumber = 9645566258L;
	return contactNumber;
	}
public static float getRating(){
	rating = 4.80f;
	return rating;
	}
public static double getEarning(){
	earnings = 25437.89;
	return earnings;
	}
public static char getGender(){
	gender = 'M';
	return gender;
	}
public static boolean getAvailability(){
	isAvailable = true;
	return isAvailable;
	}
}
