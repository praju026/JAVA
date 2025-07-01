public class Bar {

    // static String oldMonk = "Old Monk";
    // static String royalStag = "Royal Stag";
    // static String kingfisher = "Kingfisher";
    // static String blendersPride = "Blenders Pride";
    // static String jackDaniels = "Jack Daniels";
    // static String smirnoff = "Smirnoff";
    // static String budweiser = "Budweiser";
    // static String johnnieWalker = "Johnnie Walker";
    // static String bacardi = "Bacardi";
    // static String absolut = "Absolut";
    // static String mcdowells = "McDowell's No.1";
    // static String corona = "Corona";

    // static String alcoholNames[] = {
    //     oldMonk, royalStag, kingfisher, blendersPride, jackDaniels,
    //     smirnoff, budweiser, johnnieWalker, bacardi, absolut,
    //     mcdowells, corona
    // };

    public static void main(String bar[]) {

        String oldMonk = "Old Monk";
        String royalStag = "Royal Stag";
        String kingfisher = "Kingfisher";
        String blendersPride = "Blenders Pride";
        String jackDaniels = "Jack Daniels";
        String smirnoff = "Smirnoff";
        String budweiser = "Budweiser";
        String johnnieWalker = "Johnnie Walker";
        String bacardi = "Bacardi";
        String absolut = "Absolut";
        String mcdowells = "McDowell's No.1";
        String corona = "Corona";

        String alcoholNames[] = {
            oldMonk, royalStag, kingfisher, blendersPride, jackDaniels,
            smirnoff, budweiser, johnnieWalker, bacardi, absolut,
            mcdowells, corona
        };

        System.out.println("=== Alcohol Brands ===");
        for (String alcoholName : alcoholNames) {
            System.out.println(alcoholName);
        }
    }
}
