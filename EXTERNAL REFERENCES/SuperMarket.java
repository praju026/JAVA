public class SuperMarket {

    // Ice Creams
    // static String vanilla = "Vanilla";
    // static String chocolate = "Chocolate";
    // static String strawberry = "Strawberry";
    // static String butterscotch = "Butterscotch";
    // static String mango = "Mango";
    // static String blackCurrant = "Black Currant";
    // static String chocoChip = "Choco Chip";
    // static String kulfi = "Kulfi";
    // static String caramel = "Caramel";
    // static String pista = "Pista";
    // static String iceCreams[] = {vanilla, chocolate, strawberry, butterscotch, mango, blackCurrant, chocoChip, kulfi, caramel, pista};

    // Perfumes
    // static String fogg = "Fogg";
    // static String denver = "Denver";
    // static String axe = "Axe";
    // static String parkAvenue = "Park Avenue";
    // static String skinn = "Skinn";
    // static String engage = "Engage";
    // static String bellaVita = "Bella Vita";
    // static String nivea = "Nivea";
    // static String wildStone = "Wild Stone";
    // static String zara = "Zara";
    // static String perfumes[] = {fogg, denver, axe, parkAvenue, skinn, engage, bellaVita, nivea, wildStone, zara};

    // Groceries
    // static String rice = "Rice";
    // static String wheat = "Wheat";
    // static String toorDal = "Toor Dal";
    // static String uradDal = "Urad Dal";
    // static String sugar = "Sugar";
    // static String salt = "Salt";
    // static String chilliPowder = "Chilli Powder";
    // static String turmeric = "Turmeric";
    // static String cookingOil = "Cooking Oil";
    // static String teaPowder = "Tea Powder";
    // static String groceries[] = {rice, wheat, toorDal, uradDal, sugar, salt, chilliPowder, turmeric, cookingOil, teaPowder};

    // Cosmetics
    // static String faceCream = "Face Cream";
    // static String lipstick = "Lipstick";
    // static String foundation = "Foundation";
    // static String eyeliner = "Eyeliner";
    // static String kajal = "Kajal";
    // static String compactPowder = "Compact Powder";
    // static String moisturizer = "Moisturizer";
    // static String shampoo = "Shampoo";
    // static String conditioner = "Conditioner";
    // static String sunscreen = "Sunscreen";
    // static String cosmetics[] = {faceCream, lipstick, foundation, eyeliner, kajal, compactPowder, moisturizer, shampoo, conditioner, sunscreen};

    public static void main(String sm[]) {

        // Ice Creams
        String vanilla = "Vanilla";
        String chocolate = "Chocolate";
        String strawberry = "Strawberry";
        String butterscotch = "Butterscotch";
        String mango = "Mango";
        String blackCurrant = "Black Currant";
        String chocoChip = "Choco Chip";
        String kulfi = "Kulfi";
        String caramel = "Caramel";
        String pista = "Pista";

        String iceCreams[] = {
            vanilla, chocolate, strawberry, butterscotch, mango,
            blackCurrant, chocoChip, kulfi, caramel, pista
        };

        System.out.println("=== Ice Creams ===");
        for (String ice : iceCreams) {
            System.out.println(ice);
        }

        // Perfumes
        String fogg = "Fogg";
        String denver = "Denver";
        String axe = "Axe";
        String parkAvenue = "Park Avenue";
        String skinn = "Skinn";
        String engage = "Engage";
        String bellaVita = "Bella Vita";
        String nivea = "Nivea";
        String wildStone = "Wild Stone";
        String zara = "Zara";

        String perfumes[] = {
            fogg, denver, axe, parkAvenue, skinn,
            engage, bellaVita, nivea, wildStone, zara
        };

        System.out.println("=== Perfumes ===");
        for (String perfume : perfumes) {
            System.out.println(perfume);
        }

        // Groceries
        String rice = "Rice";
        String wheat = "Wheat";
        String toorDal = "Toor Dal";
        String uradDal = "Urad Dal";
        String sugar = "Sugar";
        String salt = "Salt";
        String chilliPowder = "Chilli Powder";
        String turmeric = "Turmeric";
        String cookingOil = "Cooking Oil";
        String teaPowder = "Tea Powder";

        String groceries[] = {
            rice, wheat, toorDal, uradDal, sugar,
            salt, chilliPowder, turmeric, cookingOil, teaPowder
        };

        System.out.println("=== Groceries ===");
        for (String grocery : groceries) {
            System.out.println(grocery);
        }

        // Cosmetics
        String faceCream = "Face Cream";
        String lipstick = "Lipstick";
        String foundation = "Foundation";
        String eyeliner = "Eyeliner";
        String kajal = "Kajal";
        String compactPowder = "Compact Powder";
        String moisturizer = "Moisturizer";
        String shampoo = "Shampoo";
        String conditioner = "Conditioner";
        String sunscreen = "Sunscreen";

        String cosmetics[] = {
            faceCream, lipstick, foundation, eyeliner, kajal,
            compactPowder, moisturizer, shampoo, conditioner, sunscreen
        };

        System.out.println("=== Cosmetics ===");
        for (String cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }
    }
}
