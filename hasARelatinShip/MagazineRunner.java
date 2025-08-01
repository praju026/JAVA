class MagazineRunner {

	public static void main(String[] args) {

		Article article = new Article();
		article.title = "AI and the Future";
		article.author = "Praju Yadav";
		article.wordCount = 1200;
		article.isFeatured = true;

		Page page = new Page();
		page.article = article;
		page.pageNumber = 5;
		page.section = "Technology";
		page.hasImage = true;

		Magazine magazine = new Magazine();
		magazine.page = page;
		magazine.magazineName = "Tech Today";
		magazine.publisher = "Pine Media Group";
		magazine.totalPages = 40;
		magazine.isMonthly = true;

		magazine.magazineInfo();
	}
}
