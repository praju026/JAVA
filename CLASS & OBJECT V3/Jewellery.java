class Jewellery {

Jewellery(String name,String type,String material,String brand,float price,float weight){
   this.name=name;
    this.type=type;
    this.material=material;
    this.brand=brand;
    this.price=price;
    this.weight=weight;
}
    String name;
    String type;
    String material;
    String brand;
    float price;
    float weight;

	public void GetInfo(){
        System.out.println("NAME : " + name);
        System.out.println("TYPE : " + type);
        System.out.println("MATERIAL : " + material);
        System.out.println("BRAND : " + brand);
        System.out.println("PRICE : " + price);
        System.out.println("WEIGHT : " + weight + " g");

	}
}
