class TechPark {

	Block block;
	String name;
	String location;
	int totalCompanies;
	boolean hasParking;

	public void techParkInfo() {
		System.out.println("TECH PARK INFO PRINTING");
		System.out.println("NAME             : " + name);
		System.out.println("LOCATION         : " + location);
		System.out.println("TOTAL COMPANIES  : " + totalCompanies);
		System.out.println("HAS PARKING      : " + hasParking);
		block.blockInfo();
	}
}
