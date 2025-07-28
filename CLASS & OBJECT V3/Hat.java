class Hat {

Hat(String brand,String color,String material,String style,String size,float price){
    this.brand=brand;
    this.color=color;
    this.material=material;
    this.style=style;
    this.size=size;
    this.price=price;
}
    String brand;
    String color;
    String material;
    String style;
    String size;
    float price;

	public void GetInfo(){

        System.out.println("BRAND : " + brand);
        System.out.println("COLOR : " + color);
        System.out.println("MATERIAL : " + material);
        System.out.println("STYLE : " + style);
        System.out.println("SIZE : " + size);
        System.out.println("PRICE : " + price);
	}
}
