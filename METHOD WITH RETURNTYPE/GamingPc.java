class GamingPc {
    static String processor;
    static String gpu;
    static int ramGB;
    static boolean hasRGB;
    static double price;
    static String brand;

    public static String getProcessor() {
        processor = "Intel i9 14th Gen";
        return processor;
    }

    public static String getGpu() {
        gpu = "NVIDIA RTX 4090";
        return gpu;
    }

    public static int getRamGB() {
        ramGB = 32;
        return ramGB;
    }

    public static boolean getHasRGB() {
        hasRGB = true;
        return hasRGB;
    }

    public static double getPrice() {
        price = 250000.00;
        return price;
    }

    public static String getBrand() {
        brand = "Alienware";
        return brand;
    }
}