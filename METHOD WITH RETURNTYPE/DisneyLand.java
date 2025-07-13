class DisneyLand {
    static String location;
    static int totalRides;
    static boolean hasWaterPark;
    static double entryFee;
    static String mascot;
    static String openingYear;

    public static String getLocation() {
        location = "California";
        return location;
    }

    public static int getTotalRides() {
        totalRides = 80;
        return totalRides;
    }

    public static boolean getHasWaterPark() {
        hasWaterPark = true;
        return hasWaterPark;
    }

    public static double getEntryFee() {
        entryFee = 150.00;
        return entryFee;
    }

    public static String getMascot() {
        mascot = "Mickey Mouse";
        return mascot;
    }

    public static String getOpeningYear() {
        openingYear = "1955";
        return openingYear;
    }
}