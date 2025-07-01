public class Ipl {

    // static String csk = "Chennai Super Kings";
    // static String mi = "Mumbai Indians";
    // static String rcb = "Royal Challengers Bangalore";
    // static String kkr = "Kolkata Knight Riders";
    // static String rr = "Rajasthan Royals";
    // static String srh = "Sunrisers Hyderabad";
    // static String dc = "Delhi Capitals";
    // static String lsg = "Lucknow Super Giants";
    // static String gt = "Gujarat Titans";
    // static String pbks = "Punjab Kings";

    // static String teamNames[] = {
    //     csk, mi, rcb, kkr, rr,
    //     srh, dc, lsg, gt, pbks
    // };

    public static void main(String team[]) {

        String csk = "Chennai Super Kings";
        String mi = "Mumbai Indians";
        String rcb = "Royal Challengers Bangalore";
        String kkr = "Kolkata Knight Riders";
        String rr = "Rajasthan Royals";
        String srh = "Sunrisers Hyderabad";
        String dc = "Delhi Capitals";
        String lsg = "Lucknow Super Giants";
        String gt = "Gujarat Titans";
        String pbks = "Punjab Kings";

        String teamNames[] = {
            csk, mi, rcb, kkr, rr,
            srh, dc, lsg, gt, pbks
        };

        System.out.println("=== IPL Teams ===");
        for (String teamName : teamNames) {
            System.out.println(teamName);
        }
    }
}
