class WalkiTalkiRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String model = WalkiTalki.getModel();
        System.out.println("MODEL : " + model);

        double range = WalkiTalki.getRangeInKm();
        System.out.println("RANGE (km) : " + range);

        boolean isEncrypted = WalkiTalki.getIsEncrypted();
        System.out.println("IS ENCRYPTED : " + isEncrypted);

        String band = WalkiTalki.getFrequencyBand();
        System.out.println("FREQUENCY BAND : " + band);

        double weight = WalkiTalki.getWeightInGrams();
        System.out.println("WEIGHT (grams) : " + weight);

        boolean hasBattery = WalkiTalki.getHasBatteryBackup();
        System.out.println("HAS BATTERY BACKUP : " + hasBattery);

        System.out.println("MAIN ENDED");
    }
}
