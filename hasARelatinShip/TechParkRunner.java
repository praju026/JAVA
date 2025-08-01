class TechParkRunner {

	public static void main(String teqy[]) {

		Company company = new Company();
		company.name = "Infosys";
		company.domain = "IT Services";
		company.employeeCount = 25000;
		company.isHiring = true;

		Block block = new Block();
		block.company = company;
		block.blockName = "Block A";
		block.floorCount = 6;
		block.hasCafeteria = true;

		TechPark techPark = new TechPark();
		techPark.block = block;
		techPark.name = "Electronic City Tech Park";
		techPark.location = "Bangalore";
		techPark.totalCompanies = 50;
		techPark.hasParking = true;

		techPark.techParkInfo();
	}
}
