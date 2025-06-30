public class Projector {
    static String brand = "Epson";
    static String model = "X500";
    static int resolution = 1080;
    static int brightness = 3000;
    static int contrastRatio = 15000;
    static String projectionTechnology = "LCD";
    static boolean isPortable = true;
    static double weight = 2.5;


    public static void main(String[] args) {

    	String connectivity = "HDMI";
    	boolean wireless = true;
    	boolean hasSpeaker = true;
    	String inputType = "HDMI/VGA";
    	boolean supports3D = false;
    	boolean ceilingMountable = true;
    	int lampLife = 10000;
    	String color = "Black";
    	boolean keystoneCorrection = true;
    	boolean smartProjector = false;
	String powerConsumption = "220W";

        System.out.println("Projector Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Resolution: " + resolution);
        System.out.println("Brightness: " + brightness);
        System.out.println("Contrast Ratio: " + contrastRatio);
        System.out.println("Projection Technology: " + projectionTechnology);
        System.out.println("Is Portable: " + isPortable);
        System.out.println("Weight: " + weight);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Wireless: " + wireless);
        System.out.println("Has Speaker: " + hasSpeaker);
        System.out.println("Input Type: " + inputType);
        System.out.println("Supports 3D: " + supports3D);
        System.out.println("Ceiling Mountable: " + ceilingMountable);
        System.out.println("Lamp Life: " + lampLife);
        System.out.println("Color: " + color);
        System.out.println("Keystone Correction: " + keystoneCorrection);
        System.out.println("Smart Projector: " + smartProjector);
        System.out.println("Power Consumption: " + powerConsumption);
    }
}
