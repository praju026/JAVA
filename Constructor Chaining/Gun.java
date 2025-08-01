class Gun {

    String model;
    String type;
    int capacityMl;
    float rangeMeters;
    String pressureType;
    double price;

    Gun() {
        this("HydroBlaze");
        System.out.println("Default constructor");
    }

    Gun(String model) {
        this("Water", 750);
        System.out.println("1st CONSTRUCTOR INVOKED");
        this.model = model;
    }

    Gun(String type, int capacityMl) {
        this(14.0f);
        System.out.println("2nd CONSTRUCTOR INVOKED");
        this.type = type;
        this.capacityMl = capacityMl;
    }

    Gun(float rangeMeters) {
        this("Pump", 999.0);
        System.out.println("3rd CONSTRUCTOR INVOKED");
        this.rangeMeters = rangeMeters;
    }

    Gun(String pressureType, double price) {
        this("HydroBlaze X", "Water", 850, 16.0f, pressureType, price);
        System.out.println("4th CONSTRUCTOR INVOKED");
    }

    Gun(int capacityMl) {
        this("Pressure", 899.0);
        System.out.println("5th CONSTRUCTOR INVOKED");
        this.capacityMl = capacityMl;
    }

    Gun(String model, String type, int capacityMl, float rangeMeters, String pressureType, double price) {
        System.out.println("LAST CONSTRUCTOR (6)");
        this.model = model;
        this.type = type;
        this.capacityMl = capacityMl;
        this.rangeMeters = rangeMeters;
        this.pressureType = pressureType;
        this.price = price;
    }

    public void display() {
        System.out.println("MODEL         : " + model);
        System.out.println("TYPE          : " + type);
        System.out.println("CAPACITY (ml) : " + capacityMl);
        System.out.println("RANGE (m)     : " + rangeMeters);
        System.out.println("PRESSURE TYPE : " + pressureType);
        System.out.println("PRICE (Rs)    : " + price);
        System.out.println("--------------------------------------");
    }

    
}
