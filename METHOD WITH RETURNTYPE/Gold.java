class Gold {
    static double purity;
    static double pricePerGram;
    static String origin;
    static boolean isHallmarked;
    static String form;
    static double weight;

    public static double getPurity() {
        purity = 22.0;
        return purity;
    }

    public static double getPricePerGram() {
        pricePerGram = 5800.75;
        return pricePerGram;
    }

    public static String getOrigin() {
        origin = "Kolar";
        return origin;
    }

    public static boolean getIsHallmarked() {
        isHallmarked = true;
        return isHallmarked;
    }

    public static String getForm() {
        form = "Ring";
        return form;
    }

    public static double getWeight() {
        weight = 12.5;
        return weight;
    }
}