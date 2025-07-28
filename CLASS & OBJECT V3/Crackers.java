class Crackers {
	Crackers(String name,String type,String brand,float price,int quantity,boolean isEcoFriendly){
	System.out.println("PARAMETERIZED");
    this.name=name;          
    this.type=type;          
    this.brand=brand;         
    this.price=price;          
    this.quantity=quantity;         
    this.isEcoFriendly=isEcoFriendly;
	}
    String name;          
    String type;          
    String brand;         
    float price;          
    int quantity;         
    boolean isEcoFriendly;

	public void GetInfo(){
	System.out.println("NAME : " + name);
        System.out.println("TYPE : " + type);
        System.out.println("BRAND : " + brand);
        System.out.println("PRICE : " + price);
        System.out.println("QUANTITY : " + quantity);
        System.out.println("ECO-FRIENDLY : " + isEcoFriendly);
	System.out.println(" ");

	} 
}
