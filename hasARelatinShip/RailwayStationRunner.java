public class RailwayStationRunner {

	public static void main(String rail[]) {

		Train train = new Train();
		train.trainName = "Karnataka Express";
		train.trainNumber = "12627";
		train.source = "Bangalore";
		train.destination = "New Delhi";
		train.isOnTime = true;

		RailwayStation station = new RailwayStation();
		station.train = train;
		station.stationName = "KSR Bengaluru";
		station.city = "Bangalore";
		station.platforms = 10;
		station.isJunction = true;

		station.stationInfo();
	}
}
