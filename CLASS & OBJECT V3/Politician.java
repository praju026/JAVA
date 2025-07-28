class Politician {
Politician(String name, String party, String position, int age, String country, boolean isActive){
    this.name=name;        
    this.party=party;       
    this.position=position;   
    this.age=age;       
    this.country=country;
    this.isActive=isActive;

}

    String name;        
    String party;       
    String position;   
    int age;       
    String country;
    boolean isActive;

	public void GetInfo(){
        System.out.println("NAME : " + name);
        System.out.println("PARTY : " + party);
        System.out.println("POSITION : " + position);
        System.out.println("AGE : " + age);
        System.out.println("COUNTRY : " + country);
        System.out.println("IS ACTIVE : " + isActive);

	}
}
