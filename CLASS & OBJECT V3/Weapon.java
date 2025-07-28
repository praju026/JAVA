class Weapon {

Weapon(String name,String type,String material,float weight,float price,String origin){

    this.name=name;
    this.type=type;
    this.material=material;
    this.weight=weight;
    this.price=price;
    this.origin=origin;
}
    String name;
    String type;
    String material;
    float weight;
    float price;
    String origin;


public void GetInfo(){

        System.out.println("NAME : " + name);
        System.out.println("TYPE : " + type);
        System.out.println("MATERIAL : " + material);
        System.out.println("WEIGHT : " + weight);
        System.out.println("PRICE : " + price);
        System.out.println("ORIGIN : " + origin);

	}
}
