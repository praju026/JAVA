class Signal {
    static String type;
    static String location;
    static boolean isWorking;
    static int timer;
    static String color;

    public static String getType() {
	type = "Traffic";
        return type;
    }

    public static String getLocation() {
	location = "MG Road";
        return location;
    }

    public static boolean getIsWorking() {
	isWorking = true;
        return isWorking;
    }

    public static int getTimer() {
	timer = 45;
        return timer;
    }

    public static String getColor() {
	color = "Red";
        return color;
    }
}
