public class Ecommerce {

	Category category;
	String platformName;
	String headOffice;
	boolean isActive;

	public void ecommerceInfo() {
		System.out.println("ECOMMERCE INFO PRINTING");
		System.out.println("PLATFORM NAME : " + platformName);
		System.out.println("HEAD OFFICE   : " + headOffice);
		System.out.println("IS ACTIVE     : " + isActive);
		category.categoryInfo();
	}
}
