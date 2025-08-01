class Screen {

	Movie movie;
	String screenName;
	int capacity;
	boolean is3D;

	public void screenInfo() {
		System.out.println("SCREEN INFO PRINTING");
		System.out.println("SCREEN NAME   : " + screenName);
		System.out.println("CAPACITY      : " + capacity);
		System.out.println("IS 3D SUPPORT : " + is3D);
		movie.movieInfo();
	}
}
