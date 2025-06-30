class VoltasSplitAC {

        static String compressorType = "Inverter compressor";
        static String coolingMode = "4‑in‑1 Convertible (20–120% capacity)";
        static double capacityTon = 1.0;
        static String energyRating = "3 Star";
        static double annualConsumption = 3300; // units/year
        static double ISEER = 3.80;
        static String warrantyProduct = "1 Year Comprehensive";
        static String warrantyCompressor = "10 Years";
        static String condenserCoil = "Copper with anti-corrosion coating";
        static String voltageRange = "110‑285 V (stabilizer-free)";
        static String noiseLevel = "44 dB (indoor)";
        static String specialFeatures = "Anti-dust, antimicrobial, LED display, sleep, turbo, self-diagnosis";

    public static void main(String[] args) {


        System.out.println("------ Voltas 1 Ton Inverter Split AC Details ------");
        System.out.println("Compressor Type          : " + compressorType);
        System.out.println("Cooling Modes            : " + coolingMode);
        System.out.println("Capacity                 : " + capacityTon + " Ton");
        System.out.println("Energy Rating            : " + energyRating);
        System.out.println("Annual Energy Consumption: " + annualConsumption + " units");
        System.out.println("ISEER Value              : " + ISEER);
        System.out.println("Warranty (Product/Compressor): " + warrantyProduct + " / " + warrantyCompressor);
        System.out.println("Condenser Coil           : " + condenserCoil);
        System.out.println("Voltage Range            : " + voltageRange);
        System.out.println("Indoor Noise Level       : " + noiseLevel);
        System.out.println("Special Features         : " + specialFeatures);
        System.out.println("-----------------------------------------------------");
    }
}
