class Flowers {
Flowers(String name,String color,float pricePerDozen,String fragrance,boolean isSeasonal){
    this.name=name;
    this.color=color;
    this.pricePerDozen=pricePerDozen;
    this.fragrance=fragrance;
    this.isSeasonal=isSeasonal;	
}
    String name;
    String color;
    float pricePerDozen;
    String fragrance;
    boolean isSeasonal;

	public void GetInfo(){
        System.out.println("NAME : " + name);
        System.out.println("COLOR : " + color);
        System.out.println("PRICE/DOZEN : " + pricePerDozen);
        System.out.println("FRAGRANCE : " + fragrance);
        System.out.println("SEASONAL : " + isSeasonal);

}
}
