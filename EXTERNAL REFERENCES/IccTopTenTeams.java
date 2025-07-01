public class IccTopTenTeams {

    // static String india = "INDIA ";
    // static String australia = "AUSTRALIA ";
    // static String southAfrica = "SOUTH AFRICA";
    // static String newZealand = "NEWZEALAND";
    // static String sriLanka = "SRI LANKA";
    // static String pakistan = "PAKISTAN";
    // static String england = "ENGLAND";
    // static String afghanistan = "AFGANISTAN";
    // static String westIndies = "WEST INDIES";
    // static String bangladesh = "BANGLADESH";

    // static String teams[] = {
    //     india, australia, southAfrica, newZealand, sriLanka,
    //     pakistan, england, afghanistan, westIndies, bangladesh
    // };

    public static void main(String icc[]) {

        String india = "INDIA ";
        String australia = "AUSTRALIA ";
        String southAfrica = "SOUTH AFRICA";
        String newZealand = "NEWZEALAND";
        String sriLanka = "SRI LANKA";
        String pakistan = "PAKISTAN";
        String england = "ENGLAND";
        String afghanistan = "AFGANISTAN";
        String westIndies = "WEST INDIES";
        String bangladesh = "BANGLADESH";

        String teams[] = {
            india, australia, southAfrica, newZealand, sriLanka,
            pakistan, england, afghanistan, westIndies, bangladesh
        };

        System.out.println("=======MAIN STARTED=======");
        for (String team : teams) {
            System.out.println(team);
        }
        System.out.println("=======MAIN ENDED=======");
    }
}
