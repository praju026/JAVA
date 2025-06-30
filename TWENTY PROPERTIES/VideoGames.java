public class VideoGames {
    static String name = "God of War: Ragnarok";
    static String developer = "Santa Monica Studio";
    static String publisher = "Sony Interactive Entertainment";
    static String genre = "Action-Adventure";
    static String platform = "PlayStation 5";
    static String releaseDate = "09-11-2022";
    static boolean isMultiplayer = false;


    public static void main(String game[]) {

    boolean hasDLC = true;
    double sizeInGB = 85.0;
    String engine = "Santa Monica Engine";
    String rating = "Mature 18+";
    boolean crossPlatform = false;
    String mainCharacter = "Kratos";
    String soundtrackComposer = "Bear McCreary";
    boolean hasOpenWorld = true;
    int estimatedPlayTime = 50;
    boolean controllerSupport = true;
    boolean inGamePurchases = false;
    String gameMode = "Single Player";
    String officialWebsite = "https://www.steam.com/godofwar";

        System.out.println("Video Game Details:");
        System.out.println("Name: " + name);
        System.out.println("Developer: " + developer);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
        System.out.println("Platform: " + platform);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Is Multiplayer: " + isMultiplayer);
        System.out.println("Has DLC: " + hasDLC);
        System.out.println("Size (GB): " + sizeInGB);
        System.out.println("Engine: " + engine);
        System.out.println("Rating: " + rating);
        System.out.println("Cross Platform: " + crossPlatform);
        System.out.println("Main Character: " + mainCharacter);
        System.out.println("Soundtrack Composer: " + soundtrackComposer);
        System.out.println("Has Open World: " + hasOpenWorld);
        System.out.println("Estimated Play Time: " + estimatedPlayTime + " hours");
        System.out.println("Controller Support: " + controllerSupport);
        System.out.println("In-Game Purchases: " + inGamePurchases);
        System.out.println("Game Mode: " + gameMode);
        System.out.println("Official Website: " + officialWebsite);
    }
}
