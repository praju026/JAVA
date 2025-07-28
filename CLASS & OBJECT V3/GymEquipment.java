class  GymEquipment{

GymEquipment(String name,String type,String brand,float price,String material,float weight){
    this.name=name;
    this.type=type;
    this.brand=brand;
    this.price=price;
    this.weight=weight;
    this.material=material;
}
    String name;
    String type;
    String brand;
    float price;
    float weight;
    String material;

public void GetInfo(){
        System.out.println("NAME : " + name);
        System.out.println("TYPE : " + type);
        System.out.println("BRAND : " + brand);
        System.out.println("PRICE : " + price);
        System.out.println("MATERIAL : " + material);
        System.out.println("WEIGHT : " + weight + " kg");

}
}
