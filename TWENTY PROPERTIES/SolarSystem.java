public class SolarSystem {
    static int totalPlanets = 8;
    static int dwarfPlanets = 5;
    static String largestPlanet = "Jupiter";
    static String smallestPlanet = "Mercury";
    static String closestToSun = "Mercury";
    static String farthestFromSun = "Neptune";
    static String brightestObject = "Sun";
    static String earthSatellite = "Moon";


    public static void main(String ss[]) {

    	int asteroidBelts = 1;
    	boolean hasComets = true;
    	boolean hasAsteroids = true;
    	String sunType = "G-Type Main-Sequence ";
    	double diameter = 2874600000.0;
    	String discoveredBy = "Ancient Astronomers";
    	boolean hasLifeKnown = true;
    	int moonsInSystem = 214;
    	boolean heliocentric = true;
    	String sunComposition = "Hydrogen and Helium";
    	int solarFlaresPerYear = 5000;
    	boolean solarWindPresent = true;
        System.out.println("Solar System Details:");
        System.out.println("Total Planets: " + totalPlanets);
        System.out.println("Dwarf Planets: " + dwarfPlanets);
        System.out.println("Largest Planet: " + largestPlanet);
        System.out.println("Smallest Planet: " + smallestPlanet);
        System.out.println("Closest To Sun: " + closestToSun);
        System.out.println("Farthest From Sun: " + farthestFromSun);
        System.out.println("Brightest Object: " + brightestObject);
        System.out.println("Earth's Satellite: " + earthSatellite);
        System.out.println("Asteroid Belts: " + asteroidBelts);
        System.out.println("Has Comets: " + hasComets);
        System.out.println("Has Asteroids: " + hasAsteroids);
        System.out.println("Sun Type: " + sunType);
        System.out.println("Diameter of Solar System: " + diameter + " km");
        System.out.println("Discovered By: " + discoveredBy);
        System.out.println("Has Known Life: " + hasLifeKnown);
        System.out.println("Moons in System: " + moonsInSystem);
        System.out.println("Heliocentric: " + heliocentric);
        System.out.println("Sun Composition: " + sunComposition);
        System.out.println("Solar Flares per Year: " + solarFlaresPerYear);
        System.out.println("Solar Wind Present: " + solarWindPresent);
    }
}
