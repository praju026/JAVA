class DefenceRunner {

	public static void main(String defe[]) {

		Squad squad = new Squad();
		squad.codeName = "Black Cobra";
		squad.soldierCount = 12;
		squad.operationZone = "LoC - Kashmir";
		squad.isActive = true;

		Army army = new Army();
		army.squad = squad;
		army.battalionName = "Rajputana Rifles";
		army.region = "Northern Command";
		army.isOnDuty = true;

		Defence defence = new Defence();
		defence.army = army;
		defence.division = "Indian Army";
		defence.strength = 1200000;
		defence.underCommand = true;

		defence.defenceInfo();
	}
}
