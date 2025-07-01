public class Earth {

    // static String asia = "Asia";
    // static String africa = "Africa";
    // static String northAmerica = "North America";
    // static String southAmerica = "South America";
    // static String antarctica = "Antarctica";
    // static String europe = "Europe";
    // static String australia = "Australia";

    // static String continents[] = {
    //     asia, africa, northAmerica, southAmerica, antarctica, europe, australia
    // };

    public static void main(String earth[]) {

        String asia = "Asia";
        String africa = "Africa";
        String northAmerica = "North America";
        String southAmerica = "South America";
        String antarctica = "Antarctica";
        String europe = "Europe";
        String australia = "Australia";

        String continents[] = {
            asia, africa, northAmerica, southAmerica, antarctica, europe, australia
        };

        System.out.println("=== Continents on Earth ===");
        for (String continent : continents) {
            System.out.println(continent);
        }
    }
}
