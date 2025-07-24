class ForestSafari {
    String location;
    String vehicleType;
    float ticketPrice;
    int durationHours;
    boolean includesGuide;
    String bestSeason;
	public void GetInfo(){

	        System.out.println("LOCATION : " + location);
        System.out.println("VEHICLE : " + vehicleType);
        System.out.println("TICKET PRICE : " + ticketPrice);
        System.out.println("DURATION : " + durationHours + " hrs");
        System.out.println("GUIDE : " + includesGuide);
        System.out.println("BEST SEASON : " + bestSeason);
	}
}
