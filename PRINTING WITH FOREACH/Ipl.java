public class Ipl {

    static String[] teamNames = {
        "Chennai Super Kings","Mumbai Indians","Royal Challengers Bangalore","Kolkata Knight Riders","Rajasthan Royals","Sunrisers Hyderabad","Delhi Capitals","Lucknow Super Giants","Gujarat Titans","Punjab Kings"};

    public static void main(String team[]) {

        System.out.println("=== IPL Teams ===");
	for(String teamName:teamNames){
	System.out.println(teamName);
	}
    }
}
