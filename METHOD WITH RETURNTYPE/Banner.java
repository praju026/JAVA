class Banner {
    static String message;
    static String size;
    static String material;
    static boolean isPrinted;
    static String location;

    public static String getMessage() {
	message = "Sale Now On!";
        return message;
    }

    public static String getSize() {
	size = "6x3 Feet";
        return size;
    }

    public static String getMaterial() {
	material = "Vinyl";
        return material;
    }

    public static boolean getIsPrinted() {
	 isPrinted = true;
        return isPrinted;
    }

    public static String getLocation() {
	location = "Main Street";
        return location;
    }
}