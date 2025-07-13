class DisneyLandRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String location = DisneyLand.getLocation();
        System.out.println("LOCATION : " + location);

        int rides = DisneyLand.getTotalRides();
        System.out.println("TOTAL RIDES : " + rides);

        boolean hasWaterPark = DisneyLand.getHasWaterPark();
        System.out.println("HAS WATER PARK : " + hasWaterPark);

        double entryFee = DisneyLand.getEntryFee();
        System.out.println("ENTRY FEE : " + entryFee);

        String mascot = DisneyLand.getMascot();
        System.out.println("MASCOT : " + mascot);

        String openingYear = DisneyLand.getOpeningYear();
        System.out.println("OPENING YEAR : " + openingYear);

        System.out.println("MAIN ENDED");
    }
}
