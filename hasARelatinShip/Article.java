class Article {

	String title;
	String author;
	int wordCount;
	boolean isFeatured;

	public void articleInfo() {
		System.out.println("ARTICLE INFO PRINTING");
		System.out.println("TITLE        : " + title);
		System.out.println("AUTHOR       : " + author);
		System.out.println("WORD COUNT   : " + wordCount);
		System.out.println("FEATURED     : " + isFeatured);
	}
}
