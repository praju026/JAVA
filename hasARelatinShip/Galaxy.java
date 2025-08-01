class Galaxy {

	SolarSystem solarSystem;
	String galaxyName;
	String galaxyType;
	long estimatedStars;
	boolean isSpiral;

	public void galaxyInfo() {
		System.out.println("GALAXY INFO PRINTING");
		System.out.println("GALAXY NAME        : " + galaxyName);
		System.out.println("TYPE               : " + galaxyType);
		System.out.println("ESTIMATED STARS    : " + estimatedStars);
		System.out.println("IS SPIRAL TYPE     : " + isSpiral);
		solarSystem.solarSystemInfo();
	}
}
