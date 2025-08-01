class Category {

	Product product;
	String categoryName;
	int itemCount;
	boolean isPopular;

	public void categoryInfo() {
		System.out.println("CATEGORY INFO PRINTING");
		System.out.println("CATEGORY NAME : " + categoryName);
		System.out.println("ITEM COUNT    : " + itemCount);
		System.out.println("IS POPULAR    : " + isPopular);
		product.productInfo();
	}
}
