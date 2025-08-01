class State {

	City city;
	String stateName;
	String chiefMinister;
	int totalDistricts;
	boolean hasCoastline;

	public void stateInfo() {
		System.out.println("STATE INFO PRINTING");
		System.out.println("STATE NAME       : " + stateName);
		System.out.println("CHIEF MINISTER   : " + chiefMinister);
		System.out.println("TOTAL DISTRICTS  : " + totalDistricts);
		System.out.println("HAS COASTLINE    : " + hasCoastline);
		city.cityInfo();
	}
}
