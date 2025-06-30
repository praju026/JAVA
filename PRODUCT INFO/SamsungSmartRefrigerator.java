class SamsungSmartRefrigerator {

        static String modelName = "RF29DB9900QD";
        static double capacityCuFt = 29.0;
        static String doorStyle = "4-Door French Door";
        static String finish = "Stainless Steel";
        static String wiFiEnabled = "true";
        static String smartFeatures = "AI Vision Inside™, Tap View, Voice Assistant";
        static String defrostSystem = "Frost Free";
        static String compressorType = "Digital Inverter";
        static double priceUSD = 3098.00;

    public static void main(String[] args) {


        System.out.println("------ Samsung Smart Refrigerator Details ------");
        System.out.println("Model Name         : " + modelName);
        System.out.println("Capacity (cu ft)   : " + capacityCuFt);
        System.out.println("Door Style         : " + doorStyle);
        System.out.println("Finish             : " + finish);
        System.out.println("Wi‑Fi Enabled      : " + wiFiEnabled);
        System.out.println("Smart Features     : " + smartFeatures);
        System.out.println("Defrost System     : " + defrostSystem);
        System.out.println("Compressor Type    : " + compressorType);
        System.out.println("Price (USD)        : ₹" + priceUSD);
        System.out.println("------------------------------------------------");
    }
}
