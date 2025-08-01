class Majestic {

	BusStand busStand;
	String city;
	boolean isCrowded;
	String state;

	public void majesticInfo() {
		System.out.println("MAJESTIC INFO PRINTING");
		System.out.println("CITY      : " + city);
		System.out.println("STATE     : " + state);
		System.out.println("IS CROWDED: " + isCrowded);
		busStand.busStandInfo();
	}
}
