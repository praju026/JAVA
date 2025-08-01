class Egg {

    String size;
    double pricePerDozen;
    String type;
    int count;
    String farmName;
    float weightPerEggG;

    Egg() {
        this("Large");
        System.out.println("Default constructor");
    }

    Egg(String size) {
        this(60.0, "Brown");
        System.out.println("1st CONSTRUCTOR INVOKED");
        this.size = size;
    }

    Egg(double pricePerDozen, String type) {
        this(12);
        System.out.println("2nd CONSTRUCTOR INVOKED");
        this.pricePerDozen = pricePerDozen;
        this.type = type;
    }

    Egg(int count) {
        this("Green Valley Farm", 55.0f);
        System.out.println("3rd CONSTRUCTOR INVOKED");
        this.count = count;
    }

    Egg(String farmName, float weightPerEggG) {
        this("Medium", 72.0, "White", 30, farmName, weightPerEggG);
        System.out.println("4th CONSTRUCTOR INVOKED");
    }

    Egg(double pricePerDozen, String type, int count) {
        this("Omega Farm", 58.0f);
        System.out.println("5th CONSTRUCTOR INVOKED");
        this.pricePerDozen = pricePerDozen;
        this.type = type;
        this.count = count;
    }

    Egg(String size, double pricePerDozen, String type, int count, String farmName, float weightPerEggG) {
        System.out.println("LAST CONSTRUCTOR (6)");
        this.size = size;
        this.pricePerDozen = pricePerDozen;
        this.type = type;
        this.count = count;
        this.farmName = farmName;
        this.weightPerEggG = weightPerEggG;
    }

    public void display() {
        System.out.println("SIZE          : " + size);
        System.out.println("PRICE/DOZEN   : " + pricePerDozen);
        System.out.println("TYPE          : " + type);
        System.out.println("COUNT         : " + count);
        System.out.println("FARM          : " + farmName);
        System.out.println("WEIGHT/Egg(g) : " + weightPerEggG);
        System.out.println("--------------------------------------");
    }

}
