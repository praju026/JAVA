class Pvr {

	Screen screen;
	String location;
	String brand;
	int totalScreens;
	boolean isFoodAvailable;

	public void pvrInfo() {
		System.out.println("PVR INFO PRINTING");
		System.out.println("PVR BRAND         : " + brand);
		System.out.println("LOCATION          : " + location);
		System.out.println("TOTAL SCREENS     : " + totalScreens);
		System.out.println("FOOD AVAILABLE    : " + isFoodAvailable);
		screen.screenInfo();
	}
}
