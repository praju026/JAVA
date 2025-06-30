public class Tourism {

    static String[] touristPlaces = {
        "Munnar","Alleppey","Kumarakom","Thekkady","Wayanad","Kovalam","Varkala","Bekal","Athirappilly","Kochi","Poovar","Guruvayur","Idukki","Thrissur","Palakkad"};

    public static void main(String tour[]) {

        System.out.println("=== Tourist Places ===");
	for(String touristPlace:touristPlaces){
	System.out.println(touristPlace);
	}
    }
}
