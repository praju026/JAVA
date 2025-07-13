class MarketRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String name = Market.getName();
        System.out.println("MARKET NAME : " + name);

        int shops = Market.getShops();
        System.out.println("TOTAL SHOPS : " + shops);

        boolean isOpen = Market.getIsOpen();
        System.out.println("IS OPEN : " + isOpen);

        String specialty = Market.getSpecialty();
        System.out.println("SPECIALTY : " + specialty);

        String location = Market.getLocation();
        System.out.println("LOCATION : " + location);

        double area = Market.getAreaSqFeet();
        System.out.println("AREA SQ.FT : " + area);

        System.out.println("MAIN ENDED");
    }
}
