class Blade{


	Blade(String type,String material,String brand,float price,int length,String handleMaterial){

	System.out.println("PARAMETERIZED ONE");
	this.type=type;
	this.material=material;
	this.brand=brand;
	this.price=price;
	this.length=length;
	this.handleMaterial=handleMaterial;

	}
	String type;
	String material;
	String brand;
	float price;
	int length;
	String handleMaterial;

	public void GetInfo(){
	System.out.println("TYPE : " + type);
        System.out.println("MATERIAL : " + material);
        System.out.println("BRAND : " + brand);
        System.out.println("PRICE : " + price);
        System.out.println("LENGTH : " + length + " inches");
        System.out.println("HANDLE MATERIAL : " + handleMaterial);
	System.out.println(" ");

	}
}