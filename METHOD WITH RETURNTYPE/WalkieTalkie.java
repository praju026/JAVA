class WalkiTalki {
    static String model;
    static double rangeInKm;
    static boolean isEncrypted;
    static String frequencyBand;
    static double weightInGrams;
    static boolean hasBatteryBackup;

    public static String getModel() {
        model = "WT-X5";
        return model;
    }

    public static double getRangeInKm() {
        rangeInKm = 3.5;
        return rangeInKm;
    }

    public static boolean getIsEncrypted() {
        isEncrypted = true;
        return isEncrypted;
    }

    public static String getFrequencyBand() {
        frequencyBand = "UHF";
        return frequencyBand;
    }

    public static double getWeightInGrams() {
        weightInGrams = 280.0;
        return weightInGrams;
    }

    public static boolean getHasBatteryBackup() {
        hasBatteryBackup = true;
        return hasBatteryBackup;
    }
}