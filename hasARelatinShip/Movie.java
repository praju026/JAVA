class Movie {
	
	String name;
	String genre;
	String language;
	double duration;

	public void movieInfo() {
		System.out.println("MOVIE INFO PRINTING");
		System.out.println("MOVIE NAME   : " + name);
		System.out.println("GENRE        : " + genre);
		System.out.println("LANGUAGE     : " + language);
		System.out.println("DURATION     : " + duration + " hrs");
	}
}
