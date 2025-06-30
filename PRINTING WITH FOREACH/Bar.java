public class Bar {

    static String[] alcoholNames = {"Old Monk","Royal Stag","Kingfisher","Blenders Pride","Jack Daniels","Smirnoff","Budweiser","Johnnie Walker","Bacardi","Absolut","McDowell's No.1","Corona"};

    public static void main(String bar[]) {

        System.out.println("=== Alcohol Brands ===");
	for(String alcoholName:alcoholNames){
	System.out.println(alcoholName);
	}
    }
}
