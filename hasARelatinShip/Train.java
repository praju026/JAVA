public class Train {

	String trainName;
	String trainNumber;
	String source;
	String destination;
	boolean isOnTime;

	public void trainInfo() {
		System.out.println("TRAIN INFO PRINTING");
		System.out.println("TRAIN NAME     : " + trainName);
		System.out.println("TRAIN NUMBER   : " + trainNumber);
		System.out.println("SOURCE         : " + source);
		System.out.println("DESTINATION    : " + destination);
		System.out.println("IS ON TIME     : " + isOnTime);
	}
}
