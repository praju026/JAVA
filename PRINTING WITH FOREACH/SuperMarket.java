public class SuperMarket {

    static String[] iceCreams = {
        "Vanilla", "Chocolate", "Strawberry", "Butterscotch", "Mango","Black Currant", "Choco Chip", "Kulfi", "Caramel", "Pista"};

    static String[] perfumes = {"Fogg", "Denver", "Axe", "Park Avenue", "Skinn","Engage", "Bella Vita", "Nivea", "Wild Stone", "Zara"};

    static String[] groceries = {"Rice", "Wheat", "Toor Dal", "Urad Dal", "Sugar","Salt", "Chilli Powder", "Turmeric", "Cooking Oil", "Tea Powder"};

    static String[] cosmetics = {"Face Cream", "Lipstick", "Foundation", "Eyeliner", "Kajal","Compact Powder", "Moisturizer", "Shampoo", "Conditioner", "Sunscreen"};

    public static void main(String sm[]) {

        System.out.println("=== Ice Creams ===");
	for(String iceCream:iceCreams){
	System.out.println(iceCream);
	}

        System.out.println("=== Perfumes ===");
	for(String perfume:perfumes){
	System.out.println(perfume);
	}

        System.out.println("=== Groceries ===");
	for(String grocery:groceries){
        System.out.println(grocery);
	}
	
        System.out.println("=== Cosmetics ===");
	for(String cosmetic:cosmetics){
	System.out.println(cosmetic);
	}
    }
}
