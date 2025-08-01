class Block {

	Company company;
	String blockName;
	int floorCount;
	boolean hasCafeteria;

	public void blockInfo() {
		System.out.println("BLOCK INFO PRINTING");
		System.out.println("BLOCK NAME      : " + blockName);
		System.out.println("FLOOR COUNT     : " + floorCount);
		System.out.println("HAS CAFETERIA   : " + hasCafeteria);
		company.companyInfo();
	}
}
