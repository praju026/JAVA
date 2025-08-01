public class Invitee {

	String name;
	String email;
	String role;
	boolean isConfirmed;

	public void inviteeInfo() {
		System.out.println("INVITEE INFO PRINTING");
		System.out.println("NAME         : " + name);
		System.out.println("EMAIL        : " + email);
		System.out.println("ROLE         : " + role);
		System.out.println("CONFIRMED    : " + isConfirmed);
	}
}
