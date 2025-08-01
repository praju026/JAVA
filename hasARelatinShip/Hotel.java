class Hotel {

	String hotelName;
	String ownerName;
	int noOfWorkers;
	Floor floor;

	public void getHotelInfo() {
    	System.out.println("HOTEL INFO FETCHED");
    	System.out.println("NAME: " + hotelName);
    	System.out.println("OWNER: " + ownerName);
    	floor.FloorInfo();
	}

}