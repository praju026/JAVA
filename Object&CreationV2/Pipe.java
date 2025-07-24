class Pipe {
    String material;     
    float length;        
    float diameter;      
    String color;        
    float price;         
    boolean isFlexible;  

	public void GetInfo(){
	System.out.println("MATERIAL : " + material);
        System.out.println("LENGTH : " + length + " m");
        System.out.println("DIAMETER : " + diameter + " inch");
        System.out.println("COLOR : " + color);
        System.out.println("PRICE : " + price);
        System.out.println("IS FLEXIBLE : " + isFlexible);
	}
}
