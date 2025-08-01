class MajesticRunner {

	public static void main(String maj[]) {

		Bus bus = new Bus();
		bus.busNumber = "KA-01 F 4321";
		bus.route = "Majestic to Madiwala";
		bus.busType = "Express";
		bus.isRunning = true;

		Platform platform = new Platform();
		platform.bus = bus;
		platform.platformNumber = 14;
		platform.gate = "North Gate";
		platform.isOccupied = true;

		BusStand busStand = new BusStand();
		busStand.platform = platform;
		busStand.name = "KSRTC Bus Stand";
		busStand.zone = "Zone C";
		busStand.hasCCTV = true;

		Majestic majestic = new Majestic();
		majestic.busStand = busStand;
		majestic.city = "Bangalore";
		majestic.state = "Karnataka";
		majestic.isCrowded = true;

		majestic.majesticInfo();
	}
}
