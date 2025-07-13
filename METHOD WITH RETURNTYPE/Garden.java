class Garden {
    static String name;
    static int numberOfTrees;
    static boolean isPublic;
    static double areaInAcres;
    static String location;
    static boolean hasPlayArea;

    public static String getName() {
        name = "Lalbagh Botanical Garden";
        return name;
    }

    public static int getNumberOfTrees() {
        numberOfTrees = 1200;
        return numberOfTrees;
    }

    public static boolean getIsPublic() {
        isPublic = true;
        return isPublic;
    }

    public static double getAreaInAcres() {
        areaInAcres = 240.0;
        return areaInAcres;
    }

    public static String getLocation() {
        location = "Bangalore";
        return location;
    }

    public static boolean getHasPlayArea() {
        hasPlayArea = true;
        return hasPlayArea;
    }
}