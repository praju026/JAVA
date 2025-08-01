class Magazine {

	Page page;
	String magazineName;
	String publisher;
	int totalPages;
	boolean isMonthly;

	public void magazineInfo() {
		System.out.println("MAGAZINE INFO PRINTING");
		System.out.println("MAGAZINE NAME   : " + magazineName);
		System.out.println("PUBLISHER       : " + publisher);
		System.out.println("TOTAL PAGES     : " + totalPages);
		System.out.println("IS MONTHLY      : " + isMonthly);
		page.pageInfo();
	}
}
