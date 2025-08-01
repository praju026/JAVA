public class Product {

	String productName;
	double price;
	String brand;
	boolean inStock;

	public void productInfo() {
		System.out.println("PRODUCT INFO PRINTING");
		System.out.println("PRODUCT NAME : " + productName);
		System.out.println("PRICE        : " + price);
		System.out.println("BRAND        : " + brand);
		System.out.println("IN STOCK     : " + inStock);
	}
}
