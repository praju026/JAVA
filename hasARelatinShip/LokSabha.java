public class LokSabha {

	Seat seat;
	String term;
	int totalSeats;
	boolean isInSession;

	public void lokSabhaInfo() {
		System.out.println("LOKSABHA INFO PRINTING");
		System.out.println("TERM           : " + term);
		System.out.println("TOTAL SEATS    : " + totalSeats);
		System.out.println("IN SESSION     : " + isInSession);
		seat.seatInfo();
	}
}
