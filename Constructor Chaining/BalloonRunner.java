class BalloonRunner{

	public static void main(String bal[]){
	System.out.println("MAin Started");

	Balloon balloon1 = new Balloon();
	balloon1.display();

	Balloon balloon2 = new Balloon("RED");
	balloon2.display();

	Balloon balloon3 = new Balloon(39.99,"Plastic");
	balloon3.display();

	Balloon balloon4 = new Balloon(55);
	balloon4.display();

	Balloon balloon5 = new Balloon("WEDDING","55 pieces");
	balloon5.display();
	
	Balloon balloon6 = new Balloon(7.9f);
	balloon6.display();
	System.out.println("MAin ended");

	
	}

}