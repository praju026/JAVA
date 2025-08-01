class Platform {

	Bus bus;
	int platformNumber;
	String gate;
	boolean isOccupied;

	public void platformInfo() {
		System.out.println("PLATFORM INFO PRINTING");
		System.out.println("PLATFORM NO : " + platformNumber);
		System.out.println("GATE        : " + gate);
		System.out.println("OCCUPIED    : " + isOccupied);
		bus.busInfo();
	}
}
