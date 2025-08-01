class Planet {

	String name;
	double radius;
	boolean hasLife;
	int numberOfMoons;

	public void planetInfo() {
		System.out.println("PLANET INFO PRINTING");
		System.out.println("NAME            : " + name);
		System.out.println("RADIUS (in km)  : " + radius);
		System.out.println("HAS LIFE        : " + hasLife);
		System.out.println("NUMBER OF MOONS : " + numberOfMoons);
	}
}
