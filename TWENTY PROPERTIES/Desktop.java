public class Desktop {
    static String brand = "Dell";
    static String model = "OptiPlex 7090";
    static String processor = "Intel Core i7";
    static int ramSize = 16;
    static int storageCapacity = 1024;
    static String storageType = "SSD";
    static String os = "Windows 11 Pro";
    static boolean hasGraphicsCard = true;
    static String powerSupply = "500W";
    static String cabinetType = "Mid Tower";
    static int usbPorts = 6;
    static boolean hasWifi = true;
    static boolean hasBluetooth = true;
    static boolean hasWebcam = false;
    static String motherboardModel = "Intel B560";
    static boolean isSSD = true;
    static String monitorBrand = "Dell UltraSharp";
    static int screenSize = 24;
    static boolean isTouchScreen = false;
    static String keyboardType = "Mechanical";

    public static void main(String[] args) {
        System.out.println("Desktop Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
        System.out.println("Storage Type: " + storageType);
        System.out.println("Operating System: " + os);
        System.out.println("Has Graphics Card: " + hasGraphicsCard);
        System.out.println("Power Supply: " + powerSupply);
        System.out.println("Cabinet Type: " + cabinetType);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Has WiFi: " + hasWifi);
        System.out.println("Has Bluetooth: " + hasBluetooth);
        System.out.println("Has Webcam: " + hasWebcam);
        System.out.println("Motherboard Model: " + motherboardModel);
        System.out.println("Is SSD: " + isSSD);
        System.out.println("Monitor Brand: " + monitorBrand);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Is Touch Screen: " + isTouchScreen);
        System.out.println("Keyboard Type: " + keyboardType);
    }
}
