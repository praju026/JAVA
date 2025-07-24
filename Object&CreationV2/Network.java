class Network {
    String name;   
    String type;   
    float speed;   
    float price;   
    String country;
    boolean isUnlimited;
	public void GetInfo(){
	System.out.println("NAME : " + name);
        System.out.println("TYPE : " + type);
        System.out.println("SPEED : " + speed + " Mbps");
        System.out.println("PRICE : " + price);
        System.out.println("COUNTRY : " + country);
        System.out.println("UNLIMITED : " + isUnlimited);


	}
}
