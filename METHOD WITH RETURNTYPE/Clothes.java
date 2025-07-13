class Clothes {
    static String brand;
    static String fabric;
    static String color;
    static String size;
    static boolean isWashed;
    static double price;

    public static String getBrand() {
        brand = "H&M";
        return brand;
    }

    public static String getFabric() {
        fabric = "Cotton";
        return fabric;
    }

    public static String getColor() {
        color = "Navy Blue";
        return color;
    }

    public static String getSize() {
        size = "L";
        return size;
    }

    public static boolean getIsWashed() {
        isWashed = true;
        return isWashed;
    }

    public static double getPrice() {
        price = 1799.99;
        return price;
    }
}