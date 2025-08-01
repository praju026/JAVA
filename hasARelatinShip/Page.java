class Page {

	Article article;
	int pageNumber;
	String section;
	boolean hasImage;

	public void pageInfo() {
		System.out.println("PAGE INFO PRINTING");
		System.out.println("PAGE NUMBER   : " + pageNumber);
		System.out.println("SECTION       : " + section);
		System.out.println("HAS IMAGE     : " + hasImage);
		article.articleInfo();
	}
}
