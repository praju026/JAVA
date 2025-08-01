public class Seat {

	Politician politician;
	String constituency;
	String state;
	boolean isReserved;

	public void seatInfo() {
		System.out.println("SEAT INFO PRINTING");
		System.out.println("CONSTITUENCY   : " + constituency);
		System.out.println("STATE          : " + state);
		System.out.println("IS RESERVED    : " + isReserved);
		politician.politicianInfo();
	}
}
