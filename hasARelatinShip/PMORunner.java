class PMORunner {

	public static void main(String[] args) {

		CabinetMinister cm = new CabinetMinister();
		cm.name = "Nirmala Sitharaman";
		cm.portfolio = "Finance";
		cm.state = "Tamil Nadu";
		cm.experience = 15;
		cm.isSenior = true;

		PrimeMinister pm = new PrimeMinister();
		pm.name = "Narendra Modi";
		pm.age = 73;
		pm.party = "BJP";
		pm.isIncumbent = true;
		pm.cabinetMinister = cm;

		PMO pmo = new PMO();
		pmo.location = "South Block, Delhi";
		pmo.staffCount = 200;
		pmo.isActive = true;
		pmo.spokesperson = "Anurag Srivastava";
		pmo.primeMinister = pm;

		pmo.pmoInfo();
	}
}
