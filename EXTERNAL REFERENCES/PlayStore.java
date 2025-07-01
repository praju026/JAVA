public class PlayStore {

    // static String whatsapp = "WhatsApp";
    // static String instagram = "Instagram";
    // static String facebook = "Facebook";
    // static String snapchat = "Snapchat";
    // static String telegram = "Telegram";
    // static String spotify = "Spotify";
    // static String amazon = "Amazon";
    // static String flipkart = "Flipkart";
    // static String swiggy = "Swiggy";
    // static String zomato = "Zomato";

    // static String appNames[] = {
    //     whatsapp, instagram, facebook, snapchat, telegram,
    //     spotify, amazon, flipkart, swiggy, zomato
    // };

    public static void main(String apps[]) {

        String whatsapp = "WhatsApp";
        String instagram = "Instagram";
        String facebook = "Facebook";
        String snapchat = "Snapchat";
        String telegram = "Telegram";
        String spotify = "Spotify";
        String amazon = "Amazon";
        String flipkart = "Flipkart";
        String swiggy = "Swiggy";
        String zomato = "Zomato";

        String appNames[] = {
            whatsapp, instagram, facebook, snapchat, telegram,
            spotify, amazon, flipkart, swiggy, zomato
        };

        System.out.println("=== Popular Play Store Apps ===");
        for (String appName : appNames) {
            System.out.println(appName);
        }
    }
}
