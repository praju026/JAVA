class River {
    static String name;
    static double lengthInKm;
    static String origin;
    static boolean isPolluted;
    static String flowsThrough;
    static int numberOfBridges;

    public static String getName() {
        name = "Ganga";
        return name;
    }

    public static double getLengthInKm() {
        lengthInKm = 2525.0;
        return lengthInKm;
    }

    public static String getOrigin() {
        origin = "Gangotri Glacier";
        return origin;
    }

    public static boolean getIsPolluted() {
        isPolluted = true;
        return isPolluted;
    }

    public static String getFlowsThrough() {
        flowsThrough = "Uttarakhand, UP, Bihar, West Bengal";
        return flowsThrough;
    }

    public static int getNumberOfBridges() {
        numberOfBridges = 110;
        return numberOfBridges;
    }
}