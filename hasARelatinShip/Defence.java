class Defence {

	Army army;
	String division;
	int strength;
	boolean underCommand;

	public void defenceInfo() {
		System.out.println("DEFENCE INFO PRINTING");
		System.out.println("DIVISION        : " + division);
		System.out.println("STRENGTH        : " + strength);
		System.out.println("UNDER COMMAND   : " + underCommand);
		army.armyInfo();
	}
}
