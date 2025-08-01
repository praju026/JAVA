class LokSabhaRunner {

	public static void main(String[] args) {

		Politician politician = new Politician();
		politician.name = "Suresh Gopi";
		politician.party = "BJP";
		politician.age = 67;
		politician.isIncumbent = true;

		Seat seat = new Seat();
		seat.politician = politician;
		seat.constituency = "Thrissur";
		seat.state = "Kerala";
		seat.isReserved = false;

		LokSabha lokSabha = new LokSabha();
		lokSabha.seat = seat;
		lokSabha.term = "18th Lok Sabha";
		lokSabha.totalSeats = 543;
		lokSabha.isInSession = true;

		lokSabha.lokSabhaInfo();
	}
}
