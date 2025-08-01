class PrimeMinister {

	CabinetMinister cabinetMinister;
	String name;
	int age;
	String party;
	boolean isIncumbent;

	public void pmInfo() {
		System.out.println("PRIME MINISTER INFO PRINTING");
		System.out.println("NAME         : " + name);
		System.out.println("AGE          : " + age);
		System.out.println("PARTY        : " + party);
		System.out.println("IS INCUMBENT : " + isIncumbent);
		cabinetMinister.cabinetInfo();
	}
}
