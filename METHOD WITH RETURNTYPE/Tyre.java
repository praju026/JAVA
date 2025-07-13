class Tyre {
    static String brand;
    static int diameterInInches;
    static boolean isTubeless;
    static String suitableFor;
    static double price;
    static String material;

    public static String getBrand() {
        brand = "MRF";
        return brand;
    }

    public static int getDiameterInInches() {
        diameterInInches = 16;
        return diameterInInches;
    }

    public static boolean getIsTubeless() {
        isTubeless = true;
        return isTubeless;
    }

    public static String getSuitableFor() {
        suitableFor = "Car";
        return suitableFor;
    }

    public static double getPrice() {
        price = 4999.99;
        return price;
    }

    public static String getMaterial() {
        material = "Rubber";
        return material;
    }
}
