class Radio {
    static String brand;
    static double frequency;
    static String type;
    static boolean isPortable;
    static String color;

    public static String getBrand() {
	brand = "Panasonic";
        return brand;
    }

    public static double getFrequency() {
	frequency = 98.3;
        return frequency;
    }

    public static String getType() {
	type = "FM";
        return type;
    }

    public static boolean getIsPortable() {
	isPortable = true;
        return isPortable;
    }

    public static String getColor() {
	color = "Black";
        return color;
    }
}