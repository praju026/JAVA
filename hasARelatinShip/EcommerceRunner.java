class EcommerceRunner {

	public static void main(String ecom[]) {

		Product product = new Product();
		product.productName = "iPhone 14 Pro Max";
		product.price = 139999.00;
		product.brand = "Apple";
		product.inStock = true;

		Category category = new Category();
		category.product = product;
		category.categoryName = "Smartphones";
		category.itemCount = 45;
		category.isPopular = true;

		Ecommerce ecommerce = new Ecommerce();
		ecommerce.category = category;
		ecommerce.platformName = "Flipkart";
		ecommerce.headOffice = "Bangalore";
		ecommerce.isActive = true;

		ecommerce.ecommerceInfo();
	}
}
