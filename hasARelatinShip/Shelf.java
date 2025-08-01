class Shelf{

	Book book;
	int shelfNumber;
	String category;
	int capacity;
	boolean isFull;

	public void shelfInfo(){
	System.out.println("SHELF INFO PRINTING ");
	System.out.println("SHELF NUMBER : "+shelfNumber);
	System.out.println("CATEGORY     : "+category);
	System.out.println("CAPACITY     : "+capacity);
	System.out.println("IS FULL      : "+isFull);	
	book.bookInfo();
	}

}