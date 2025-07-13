class Market {
    static String name;
    static int shops;
    static boolean isOpen;
    static String specialty;
    static String location;
    static double areaSqFeet;

    public static String getName() {
        name = "KR Market";
        return name;
    }

    public static int getShops() {
        shops = 230;
        return shops;
    }

    public static boolean getIsOpen() {
        isOpen = true;
        return isOpen;
    }

    public static String getSpecialty() {
        specialty = "Flowers";
        return specialty;
    }

    public static String getLocation() {
        location = "Bangalore";
        return location;
    }

    public static double getAreaSqFeet() {
        areaSqFeet = 15000.5;
        return areaSqFeet;
    }
}