public class Library {

    static String[] bookNames = {"The Alchemist","Wings of Fire","Harry Potter","The Hobbit","To Kill a Mockingbird","1984","Ice and Fire","Ramayana"};

    public static void main(String lib[]) {

        System.out.println("=== Library Book Collection ===");
	for(String bookName:bookNames){
	System.out.println(bookName);
	}
    }
}
