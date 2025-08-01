public class PhoneBook {

	Contacts contact;
	String bookName;
	String owner;
	int totalContacts;
	boolean isSyncedWithCloud;

	public void phoneBookInfo() {
		System.out.println("PHONEBOOK INFO PRINTING");
		System.out.println("BOOK NAME           : " + bookName);
		System.out.println("OWNER               : " + owner);
		System.out.println("TOTAL CONTACTS      : " + totalContacts);
		System.out.println("SYNCED WITH CLOUD   : " + isSyncedWithCloud);
		contact.contactInfo();
	}
}
