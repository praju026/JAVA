public class RailwayStation {

	Train train;
	String stationName;
	String city;
	int platforms;
	boolean isJunction;

	public void stationInfo() {
		System.out.println("RAILWAY STATION INFO PRINTING");
		System.out.println("STATION NAME  : " + stationName);
		System.out.println("CITY          : " + city);
		System.out.println("PLATFORMS     : " + platforms);
		System.out.println("IS JUNCTION   : " + isJunction);
		train.trainInfo();
	}
}
