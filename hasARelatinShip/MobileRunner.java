class MobileRunner {

	public static void main(String mob[]) {

		Contacts contact = new Contacts();
		contact.name = "Prajwal";
		contact.phoneNumber = "9645566258";
		contact.email = "praju@gmail.com";
		contact.isFavorite = true;

		PhoneBook phoneBook = new PhoneBook();
		phoneBook.contact = contact;
		phoneBook.bookName = "MyContacts";
		phoneBook.owner = "Praju";
		phoneBook.totalContacts = 134;
		phoneBook.isSyncedWithCloud = true;

		Mobile mobile = new Mobile();
		mobile.phoneBook = phoneBook;
		mobile.brand = "OnePlus";
		mobile.model = "Nord CE4";
		mobile.price = 24599.99;
		mobile.is5G = true;

		mobile.mobileInfo();
	}
}
