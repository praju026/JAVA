public class Country {

	State state;
	String countryName;
	String president;
	int populationInCrores;
	boolean isDeveloped;

	public void countryInfo() {
		System.out.println("COUNTRY INFO PRINTING");
		System.out.println("COUNTRY NAME       : " + countryName);
		System.out.println("PRESIDENT          : " + president);
		System.out.println("POPULATION (Cr)    : " + populationInCrores);
		System.out.println("IS DEVELOPED       : " + isDeveloped);
		state.stateInfo();
	}
}
