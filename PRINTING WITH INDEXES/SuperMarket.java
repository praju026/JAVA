public class SuperMarket {

    static String[] iceCreams = {
        "Vanilla", "Chocolate", "Strawberry", "Butterscotch", "Mango","Black Currant", "Choco Chip", "Kulfi", "Caramel", "Pista"};

    static String[] perfumes = {"Fogg", "Denver", "Axe", "Park Avenue", "Skinn","Engage", "Bella Vita", "Nivea", "Wild Stone", "Zara"};

    static String[] groceries = {"Rice", "Wheat", "Toor Dal", "Urad Dal", "Sugar","Salt", "Chilli Powder", "Turmeric", "Cooking Oil", "Tea Powder"};

    static String[] cosmetics = {"Face Cream", "Lipstick", "Foundation", "Eyeliner", "Kajal","Compact Powder", "Moisturizer", "Shampoo", "Conditioner", "Sunscreen"};

    public static void main(String sm[]) {

        System.out.println("=== Ice Creams ===");
        System.out.println(iceCreams[0]+", "+iceCreams[1]+", "+iceCreams[2]+", "+iceCreams[3]+", "+iceCreams[4]+", "+iceCreams[5]+", "+iceCreams[6]+", "+iceCreams[7]+", "+iceCreams[8]+", "+iceCreams[9]);

        System.out.println("=== Perfumes ===");
        System.out.println(perfumes[0]+", "+perfumes[1]+", "+perfumes[2]+", "+perfumes[3]+", "+perfumes[4]+", "+perfumes[5]+", "+perfumes[6]+", "+perfumes[7]+", "+perfumes[8]+", "+perfumes[9]);

        System.out.println("=== Groceries ===");
        System.out.println(
            groceries[0]+", "+groceries[1]+", "+groceries[2]+", "+groceries[3]+", "+groceries[4]+", "+groceries[5]+", "+groceries[6]+", "+groceries[7]+", "+groceries[8]+", "+groceries[9]);

        System.out.println("=== Cosmetics ===");
        System.out.println(
            cosmetics[0]+", "+cosmetics[1]+", "+cosmetics[2]+", "+cosmetics[3]+", "+cosmetics[4]+", "+cosmetics[5]+", "+cosmetics[6]+", "+cosmetics[7]+", "+cosmetics[8]+", "+cosmetics[9]);
    }
}
