class WiredGamepadInfo {

        static String modelName = "GameSir G7 SE Wired Controller";
        static String compatibleWith = "Xbox Series X|S, Xbox One & Windows 10/11";
        static String connection = "USB wired (removable)";
        static String joystickType = "Hall effect joysticks & triggers";
        static String audioJack = "3.5 mm audio jack";
        static String plugAndPlay = "Yes";
        static String carbonCert = "Carbonfree Certified";
        static String rating = "4.3 out of 5 (9,814 ratings)";
        static double price = 44.99;

    public static void main(String[] args) {


        System.out.println("------ GameSir G7 SE Wired Gamepad Details ------");
        System.out.println("Model Name         : " + modelName);
        System.out.println("Compatibility      : " + compatibleWith);
        System.out.println("Connection         : " + connection);
        System.out.println("Joystick & Triggers: " + joystickType);
        System.out.println("Audio Jack         : " + audioJack);
        System.out.println("Plug and Play      : " + plugAndPlay);
        System.out.println("Carbon Footprint   : " + carbonCert);
        System.out.println("Customer Rating    : " + rating);
        System.out.println("Price (USD)        : ₹" + price);
        System.out.println("---------------------------------------------------");
    }
}
