class BusStand {

	Platform platform;
	String name;
	String zone;
	boolean hasCCTV;

	public void busStandInfo() {
		System.out.println("BUS STAND INFO PRINTING");
		System.out.println("NAME     : " + name);
		System.out.println("ZONE     : " + zone);
		System.out.println("CCTV     : " + hasCCTV);
		platform.platformInfo();
	}
}
