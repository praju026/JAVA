public class PeriodicTable {

    // static String hydrogen = "Hydrogen";
    // static String helium = "Helium";
    // static String lithium = "Lithium";
    // static String beryllium = "Beryllium";
    // static String boron = "Boron";
    // static String carbon = "Carbon";
    // static String nitrogen = "Nitrogen";
    // static String oxygen = "Oxygen";
    // static String fluorine = "Fluorine";
    // static String neon = "Neon";
    // static String sodium = "Sodium";
    // static String magnesium = "Magnesium";

    // static String elements[] = {
    //     hydrogen, helium, lithium, beryllium, boron, carbon,
    //     nitrogen, oxygen, fluorine, neon, sodium, magnesium
    // };

    public static void main(String[] args) {

        String hydrogen = "Hydrogen";
        String helium = "Helium";
        String lithium = "Lithium";
        String beryllium = "Beryllium";
        String boron = "Boron";
        String carbon = "Carbon";
        String nitrogen = "Nitrogen";
        String oxygen = "Oxygen";
        String fluorine = "Fluorine";
        String neon = "Neon";
        String sodium = "Sodium";
        String magnesium = "Magnesium";

        String elements[] = {
            hydrogen, helium, lithium, beryllium, boron, carbon,
            nitrogen, oxygen, fluorine, neon, sodium, magnesium
        };

        System.out.println("=== Periodic Table Elements ===");
        for (String element : elements) {
            System.out.println(element);
        }
    }
}
