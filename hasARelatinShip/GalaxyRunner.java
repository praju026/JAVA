class GalaxyRunner {

	public static void main(String[] args) {

		Planet planet = new Planet();
		planet.name = "Earth";
		planet.radius = 6371.0;
		planet.hasLife = true;
		planet.numberOfMoons = 1;

		SolarSystem solarSystem = new SolarSystem();
		solarSystem.planet = planet;
		solarSystem.systemName = "Solar System";
		solarSystem.numberOfPlanets = 8;
		solarSystem.hasAsteroidBelt = true;

		Galaxy galaxy = new Galaxy();
		galaxy.solarSystem = solarSystem;
		galaxy.galaxyName = "Milky Way";
		galaxy.galaxyType = "Spiral";
		galaxy.estimatedStars = 250000000000L;
		galaxy.isSpiral = true;

		galaxy.galaxyInfo();
	}
}
