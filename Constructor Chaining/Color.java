class Color {

    String shade;
    double price;
    String type;
    String brand;
    String packSize;
    float skinSafeRating;

    Color() {
        this("Gulal Pink");
        System.out.println("Default constructor");
    }

    Color(String shade) {
        this(149.0, "Powder");
        System.out.println("1st CONSTRUCTOR INVOKED");
        this.shade = shade;
    }

    Color(double price, String type) {
        this("Naturals", "150 g");
        System.out.println("2nd CONSTRUCTOR INVOKED");
        this.price = price;
        this.type = type;
    }

    Color(String brand, String packSize) {
        this(4.8f);
        System.out.println("3rd CONSTRUCTOR INVOKED");
        this.brand = brand;
        this.packSize = packSize;
    }

    Color(float skinSafeRating) {
        this(true);
        System.out.println("4th CONSTRUCTOR INVOKED");
        this.skinSafeRating = skinSafeRating;
    }

    Color(boolean herbal) {
        this("Marigold Yellow", 179.0, herbal ? "Herbal" : "Synthetic", "AyurHue", "300 g", 4.9f);
        System.out.println("5th CONSTRUCTOR INVOKED");
    }

    Color(String shade, double price, String type, String brand, String packSize, float skinSafeRating) {
        System.out.println("LAST CONSTRUCTOR (6)");
        this.shade = shade;
        this.price = price;
        this.type = type;
        this.brand = brand;
        this.packSize = packSize;
        this.skinSafeRating = skinSafeRating;
    }

    public void display() {
        System.out.println("SHADE         : " + shade);
        System.out.println("PRICE (Rs)    : " + price);
        System.out.println("TYPE          : " + type);
        System.out.println("BRAND         : " + brand);
        System.out.println("PACK SIZE     : " + packSize);
        System.out.println("SKIN SAFE ★   : " + skinSafeRating);
        System.out.println("--------------------------------------");
    }
}
