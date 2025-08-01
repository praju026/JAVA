class Bucket {

    int capacityLiters;
    double price;
    String material;
    String color;
    String brand;
    float weightKg;

    Bucket() {
        this(20);
        System.out.println("Default constructor");
    }

    Bucket(int capacityLiters) {
        this(249.0, "Plastic");
        System.out.println("1st CONSTRUCTOR INVOKED");
        this.capacityLiters = capacityLiters;
    }

    Bucket(double price, String material) {
        this("Blue");
        System.out.println("2nd CONSTRUCTOR INVOKED");
        this.price = price;
        this.material = material;
    }

    Bucket(String color) {
        this("Aquadura", 0.8f);
        System.out.println("3rd CONSTRUCTOR INVOKED");
        this.color = color;
    }

    Bucket(String brand, float weightKg) {
        this(25, 299.0, "Stainless Steel", "Grey", brand, weightKg);
        System.out.println("4th CONSTRUCTOR INVOKED");
    }

    Bucket(double price, String material, String color) {
        this("HydroHome", 1.0f);
        System.out.println("5th CONSTRUCTOR INVOKED");
        this.price = price;
        this.material = material;
        this.color = color;
    }

    Bucket(int capacityLiters, double price, String material, String color, String brand, float weightKg) {
        System.out.println("LAST CONSTRUCTOR (6)");
        this.capacityLiters = capacityLiters;
        this.price = price;
        this.material = material;
        this.color = color;
        this.brand = brand;
        this.weightKg = weightKg;
    }

    public void display() {
        System.out.println("CAPACITY (L)  : " + capacityLiters);
        System.out.println("PRICE (Rs)    : " + price);
        System.out.println("MATERIAL      : " + material);
        System.out.println("COLOR         : " + color);
        System.out.println("BRAND         : " + brand);
        System.out.println("WEIGHT (kg)   : " + weightKg);
        System.out.println("--------------------------------------");
    }

}
