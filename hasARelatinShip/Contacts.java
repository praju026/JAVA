public class Contacts {

	String name;
	String phoneNumber;
	String email;
	boolean isFavorite;

	public void contactInfo() {
		System.out.println("CONTACT INFO PRINTING");
		System.out.println("NAME         : " + name);
		System.out.println("PHONE NUMBER : " + phoneNumber);
		System.out.println("EMAIL        : " + email);
		System.out.println("IS FAVORITE  : " + isFavorite);
	}
}
