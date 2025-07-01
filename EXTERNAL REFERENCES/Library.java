public class Library {

    // static String theAlchemist = "The Alchemist";
    // static String wingsOfFire = "Wings of Fire";
    // static String harryPotter = "Harry Potter";
    // static String theHobbit = "The Hobbit";
    // static String toKillAMockingbird = "To Kill a Mockingbird";
    // static String nineteenEightyFour = "1984";
    // static String iceAndFire = "Ice and Fire";
    // static String ramayana = "Ramayana";

    // static String bookNames[] = {
    //     theAlchemist, wingsOfFire, harryPotter, theHobbit,
    //     toKillAMockingbird, nineteenEightyFour, iceAndFire, ramayana
    // };

    public static void main(String lib[]) {

        String theAlchemist = "The Alchemist";
        String wingsOfFire = "Wings of Fire";
        String harryPotter = "Harry Potter";
        String theHobbit = "The Hobbit";
        String toKillAMockingbird = "To Kill a Mockingbird";
        String nineteenEightyFour = "1984";
        String iceAndFire = "Ice and Fire";
        String ramayana = "Ramayana";

        String bookNames[] = {
            theAlchemist, wingsOfFire, harryPotter, theHobbit,
            toKillAMockingbird, nineteenEightyFour, iceAndFire, ramayana
        };

        System.out.println("=== Library Book Collection ===");
        for (String bookName : bookNames) {
            System.out.println(bookName);
        }
    }
}
