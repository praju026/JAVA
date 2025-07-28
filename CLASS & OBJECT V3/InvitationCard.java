class InvitationCard {

InvitationCard(String occasion,String color,String size,String material,String design,float price){
    this.occasion=occasion;
    this.color=color;
    this.size=size;
    this.material=material;
    this.design=design;
    this.price=price;
}
    String occasion;
    String color;
    String size;
    String material;
    String design;
    float price;

	public void GetInfo(){
        System.out.println("OCCASION : " + occasion);
        System.out.println("COLOR : " + color);
        System.out.println("SIZE : " + size);
        System.out.println("MATERIAL : " + material);
        System.out.println("DESIGN : " + design);
        System.out.println("PRICE : " + price);
	}
}
