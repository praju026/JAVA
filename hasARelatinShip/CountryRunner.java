class CountryRunner {

	public static void main(String ind[]) {

		City city = new City();
		city.name = "Kochi";
		city.population = 850000;
		city.isCapital = false;
		city.famousFor = "IT Industry";

		State state = new State();
		state.city = city;
		state.stateName = "Kerala";
		state.chiefMinister = "Pinarayi";
		state.totalDistricts = 14;
		state.hasCoastline = true;

		Country country = new Country();
		country.state = state;
		country.countryName = "India";
		country.president = "Droupadi Murmu";
		country.populationInCrores = 140;
		country.isDeveloped = false;

		country.countryInfo();
	}
}
