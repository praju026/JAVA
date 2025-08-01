class PMO {

	PrimeMinister primeMinister;
	String location;
	int staffCount;
	boolean isActive;
	String spokesperson;

	public void pmoInfo() {
		System.out.println("PMO INFO PRINTING");
		System.out.println("LOCATION     : " + location);
		System.out.println("STAFF COUNT  : " + staffCount);
		System.out.println("IS ACTIVE    : " + isActive);
		System.out.println("SPOKESPERSON : " + spokesperson);
		primeMinister.pmInfo();
	}
}
