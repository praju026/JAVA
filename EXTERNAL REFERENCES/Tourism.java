public class Tourism {

    // static String munnar = "Munnar";
    // static String alleppey = "Alleppey";
    // static String kumarakom = "Kumarakom";
    // static String thekkady = "Thekkady";
    // static String wayanad = "Wayanad";
    // static String kovalam = "Kovalam";
    // static String varkala = "Varkala";
    // static String bekal = "Bekal";
    // static String athirappilly = "Athirappilly";
    // static String kochi = "Kochi";
    // static String poovar = "Poovar";
    // static String guruvayur = "Guruvayur";
    // static String idukki = "Idukki";
    // static String thrissur = "Thrissur";
    // static String palakkad = "Palakkad";

    // static String touristPlaces[] = {
    //     munnar, alleppey, kumarakom, thekkady, wayanad,
    //     kovalam, varkala, bekal, athirappilly, kochi,
    //     poovar, guruvayur, idukki, thrissur, palakkad
    // };

    public static void main(String tour[]) {

        String munnar = "Munnar";
        String alleppey = "Alleppey";
        String kumarakom = "Kumarakom";
        String thekkady = "Thekkady";
        String wayanad = "Wayanad";
        String kovalam = "Kovalam";
        String varkala = "Varkala";
        String bekal = "Bekal";
        String athirappilly = "Athirappilly";
        String kochi = "Kochi";
        String poovar = "Poovar";
        String guruvayur = "Guruvayur";
        String idukki = "Idukki";
        String thrissur = "Thrissur";
        String palakkad = "Palakkad";

        String touristPlaces[] = {
            munnar, alleppey, kumarakom, thekkady, wayanad,
            kovalam, varkala, bekal, athirappilly, kochi,
            poovar, guruvayur, idukki, thrissur, palakkad
        };

        System.out.println("=== Tourist Places ===");
        for (String place : touristPlaces) {
            System.out.println(place);
        }
    }
}
