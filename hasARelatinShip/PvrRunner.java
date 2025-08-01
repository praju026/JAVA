class PvrRunner {

	public static void main(String pvrr[]) {

		Pvr pvr = new Pvr();
		pvr.brand = "PVR Cinemas";
		pvr.location = "Orion Mall, Bangalore";
		pvr.totalScreens = 7;
		pvr.isFoodAvailable = true;

		Screen screen = new Screen();
		screen.screenName = "Screen 1";
		screen.capacity = 150;
		screen.is3D = true;
		pvr.screen=screen;
		
		Movie movie = new Movie();
		movie.name = "Inception";
		movie.genre = "Sci-Fi";
		movie.language = "English";
		movie.duration = 2.8;
		screen.movie=movie;
		
		pvr.pvrInfo();
	}
}
