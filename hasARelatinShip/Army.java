class Army {

	Squad squad;
	String battalionName;
	String region;
	boolean isOnDuty;

	public void armyInfo() {
		System.out.println("ARMY INFO PRINTING");
		System.out.println("BATTALION NAME  : " + battalionName);
		System.out.println("REGION          : " + region);
		System.out.println("IS ON DUTY      : " + isOnDuty);
		squad.squadInfo();
	}
}
