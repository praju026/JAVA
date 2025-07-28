class GiTag {
GiTag(String productName,String state,int yearOfRegistration,String category,boolean isHandcrafted,String region){
System.out.println("PARAMETER CONST");
    this.productName=productName;
    this.state=state;
    this.category=category;
    this.yearOfRegistration=yearOfRegistration;
    this.isHandcrafted=isHandcrafted;
    this.region=region;
	
	}
    String productName;
    String state;
    String category;
    int yearOfRegistration;
    boolean isHandcrafted;
    String region;
public void GetInfo(){

        System.out.println("PRODUCT NAME : " + productName);
        System.out.println("STATE : " + state);
        System.out.println("YEAR OF REGISTRATION : " + yearOfRegistration);
        System.out.println("CATEGORY : " + category);
        System.out.println("HANDCRAFTED : " + isHandcrafted);
        System.out.println("REGION : " + region);


	}
}
