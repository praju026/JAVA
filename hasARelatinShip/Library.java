 class Library{

	Shelf shelf;
	String libraryName;
	String libraryLocation;
	int totalShelves;
	boolean isOpen;

	public void libraryInfo(){
	System.out.println("LIBRARY INFO PRINTING");
	System.out.println("LIBRARY NAME      : "+libraryName);
	System.out.println("LIBRARY LOCATION  : "+libraryLocation);
	System.out.println("NUMBER OF SHELVES : "+totalShelves);
	System.out.println("IS OPEN           : "+isOpen);
	shelf.shelfInfo();
	}

}
