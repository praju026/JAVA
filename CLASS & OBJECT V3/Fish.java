class Fish {
	Fish(String name,String type,String color,float weight,boolean isFreshWater,String habitat){

    this.name=name;
    this.type=type;
    this.color=color;
    this.weight=weight;
    this.isFreshWater=isFreshWater;
    this.habitat=habitat;

		}
    String name;
    String type;
    String color;
    float weight;
    boolean isFreshWater;
    String habitat;

	public void getInfo(){
	System.out.println("NAME : " + name);
        System.out.println("TYPE : " + type);
        System.out.println("COLOR : " +color);
        System.out.println("WEIGHT : " + weight);
        System.out.println("FRESH WATER : " + isFreshWater);
        System.out.println("HABITAT : " + habitat);

	}
}
