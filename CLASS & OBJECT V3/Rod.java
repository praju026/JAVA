class Rod {
    String material;
    String type;
    float length;
    float diameter;
    float weight;
    float price;

Rod(String material, String type, float length, float diameter, float weight, float price) {
    this.material = material;
    this.type = type;
    this.length = length;
    this.diameter = diameter;
    this.weight = weight;
    this.price = price;
}


public void GetInfo(){

	System.out.println("MATERIAL : " + material);
        System.out.println("TYPE : " + type);
        System.out.println("LENGTH : " + length + " m");
        System.out.println("DIAMETER : " + diameter + " cm");
        System.out.println("WEIGHT : " + weight + " kg");
        System.out.println("PRICE : " + price);

	}
}
