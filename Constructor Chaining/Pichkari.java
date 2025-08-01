class Pichkari {

    String brand;
    double price;
    String material;
    int capacityMl;
    int nozzleCount;
    float rangeMeters;
    String pressureLevel;

    Pichkari() {
        this("SplashPro");
        System.out.println("Default constructor");
    }

    Pichkari(String brand) {
        this(1200.0, "ABS");
        System.out.println("1st CONSTRUCTOR INVOKED");
        this.brand = brand;
    }

    Pichkari(double price, String material) {
        this(750);
        System.out.println("2nd CONSTRUCTOR INVOKED");
        this.price = price;
        this.material = material;
    }

    Pichkari(int capacityMl) {
        this(3, "Medium");
        System.out.println("3rd CONSTRUCTOR INVOKED");
        this.capacityMl = capacityMl;
    }

    Pichkari(int nozzleCount, String pressureLevel) {
        this(12.5f);
        System.out.println("4th CONSTRUCTOR INVOKED");
        this.nozzleCount = nozzleCount;
        this.pressureLevel = pressureLevel;
    }

    Pichkari(float rangeMeters) {
        this("HydroJet", 999.0, "Polycarbonate", 650, 2, rangeMeters);
        System.out.println("5th CONSTRUCTOR INVOKED");
    }

    Pichkari(String brand, double price, String material, int capacityMl, int nozzleCount, float rangeMeters) {
        System.out.println("LAST CONSTRUCTOR (6)");
        this.brand = brand;
        this.price = price;
        this.material = material;
        this.capacityMl = capacityMl;
        this.nozzleCount = nozzleCount;
        this.rangeMeters = rangeMeters;
        this.pressureLevel = "Standard";
    }

    public void display() {
        System.out.println("BRAND         : " + brand);
        System.out.println("PRICE (Rs)    : " + price);
        System.out.println("MATERIAL      : " + material);
        System.out.println("CAPACITY (ml) : " + capacityMl);
        System.out.println("NOZZLES       : " + nozzleCount);
        System.out.println("RANGE (m)     : " + rangeMeters);
        System.out.println("PRESSURE      : " + pressureLevel);
        System.out.println("--------------------------------------");
    }

}
