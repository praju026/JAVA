class Water {

    String sourceType;
    String brand;
    float volumeLiters;
    float pH;
    double price;
    String bottledDate;

    Water() {
        this("RO");
        System.out.println("Default constructor");
    }

    Water(String sourceType) {
        this(1.0f, 7.2f);
        System.out.println("1st CONSTRUCTOR INVOKED");
        this.sourceType = sourceType;
    }

    Water(float volumeLiters, float pH) {
        this(25.0, "Aquafresh");
        System.out.println("2nd CONSTRUCTOR INVOKED");
        this.volumeLiters = volumeLiters;
        this.pH = pH;
    }

    Water(double price, String brand) {
        this(2025, 1, 15);
        System.out.println("3rd CONSTRUCTOR INVOKED");
        this.price = price;
        this.brand = brand;
    }

    Water(int year, int month, int day) {
        this("Mineral", "BlueSpring", 2.0f, 7.5f, 35.0, (year + "/" + month + "/" + day));
        System.out.println("4th CONSTRUCTOR INVOKED");
    }

    Water(float volumeLiters) {
        this(28.0, "PureDrop");
        System.out.println("5th CONSTRUCTOR INVOKED");
        this.volumeLiters = volumeLiters;
    }

    Water(String sourceType, String brand, float volumeLiters, float pH, double price, String bottledDate) {
        System.out.println("LAST CONSTRUCTOR (6)");
        this.sourceType = sourceType;
        this.brand = brand;
        this.volumeLiters = volumeLiters;
        this.pH = pH;
        this.price = price;
        this.bottledDate = bottledDate;
    }

    public void display() {
        System.out.println("SOURCE TYPE   : " + sourceType);
        System.out.println("BRAND         : " + brand);
        System.out.println("VOLUME (L)    : " + volumeLiters);
        System.out.println("pH            : " + pH);
        System.out.println("PRICE (Rs)    : " + price);
        System.out.println("BOTTLED DATE  : " + bottledDate);
        System.out.println("--------------------------------------");
    }
}
