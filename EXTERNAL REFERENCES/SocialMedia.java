public class SocialMedia {

    // static String instagram = "Instagram";
    // static String facebook = "Facebook";
    // static String x = "X";
    // static String snapchat = "Snapchat";
    // static String whatsapp = "WhatsApp";
    // static String telegram = "Telegram";
    // static String youtube = "YouTube";
    // static String reddit = "Reddit";
    // static String threads = "Threads";
    // static String linkedin = "LinkedIn";

    // static String mediaNames[] = {
    //     instagram, facebook, x, snapchat, whatsapp,
    //     telegram, youtube, reddit, threads, linkedin
    // };

    public static void main(String media[]) {

        String instagram = "Instagram";
        String facebook = "Facebook";
        String x = "X";
        String snapchat = "Snapchat";
        String whatsapp = "WhatsApp";
        String telegram = "Telegram";
        String youtube = "YouTube";
        String reddit = "Reddit";
        String threads = "Threads";
        String linkedin = "LinkedIn";

        String mediaNames[] = {
            instagram, facebook, x, snapchat, whatsapp,
            telegram, youtube, reddit, threads, linkedin
        };

        System.out.println("=== Social Media Platforms ===");
        for (String mediaName : mediaNames) {
            System.out.println(mediaName);
        }
    }
}
