class Casino {

	Casino(String name,String location,int noOfGames,float entryFee,boolean isOpen24Hours){

	System.out.println("PARAMETERIZED STARTED");
	this.name=name;
        this.location=location;
        this.noOfGames=noOfGames;
        this.entryFee=entryFee;
        this.isOpen24Hours=isOpen24Hours;	
	}
    String name;
    String location;
    int noOfGames;
    float entryFee;
    boolean isOpen24Hours;

	public void GetInfo(){
        System.out.println("NAME : " + name);
        System.out.println("LOCATION : " + location);
        System.out.println("NO OF GAMES : " + noOfGames);
        System.out.println("ENTRY FEE : " + entryFee);
        System.out.println("OPEN 24 HOURS : " + isOpen24Hours);
	System.out.println(" ");
}
}