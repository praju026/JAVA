class Mobile {

	PhoneBook phoneBook;
	String brand;
	String model;
	double price;
	boolean is5G;

	public void mobileInfo() {
		System.out.println("MOBILE INFO PRINTING");
		System.out.println("BRAND     : " + brand);
		System.out.println("MODEL     : " + model);
		System.out.println("PRICE     : " + price);
		System.out.println("IS 5G     : " + is5G);
		phoneBook.phoneBookInfo();
	}
}
