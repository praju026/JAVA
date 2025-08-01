class SolarSystem {

	Planet planet;
	String systemName;
	int numberOfPlanets;
	boolean hasAsteroidBelt;

	public void solarSystemInfo() {
		System.out.println("SOLAR SYSTEM INFO PRINTING");
		System.out.println("SYSTEM NAME        : " + systemName);
		System.out.println("NUMBER OF PLANETS  : " + numberOfPlanets);
		System.out.println("ASTEROID BELT      : " + hasAsteroidBelt);
		planet.planetInfo();
	}
}
