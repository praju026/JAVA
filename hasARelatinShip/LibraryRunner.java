class LibraryRunner{

	public static void main(String lib[]){

	Library library = new Library();
	library.libraryName = "The National Library of India" ;
	library.libraryLocation = "India";
	library.totalShelves = 5;
	library.isOpen = true;
	
	Shelf shelf = new Shelf();
	shelf.shelfNumber=1;
	shelf.category="Fiction";
	shelf.capacity = 50;
	shelf.isFull = false;
	library.shelf=shelf;

	Book book = new Book();
	book.title ="Game of Thrones";
	book.author= "George R. R. Martin";
	book.genre= "Fantasy";
	book.numberOfPages= 694;
	shelf.book = book;

	library.libraryInfo();
	} 


}