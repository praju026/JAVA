class NailPolish {

    String shade;
    String finish;
    String brand;
    int quantityMl;
    double price;
    float dryTimeMin;

    NailPolish() {
        this("Crimson");
        System.out.println("Default constructor");
    }

    NailPolish(String shade) {
        this("Glossy", 8);
        System.out.println("1st CONSTRUCTOR INVOKED");
        this.shade = shade;
    }

    NailPolish(String finish, int quantityMl) {
        this(199.0);
        System.out.println("2nd CONSTRUCTOR INVOKED");
        this.finish = finish;
        this.quantityMl = quantityMl;
    }

    NailPolish(double price) {
        this("LacQ", 2.5f);
        System.out.println("3rd CONSTRUCTOR INVOKED");
        this.price = price;
    }

    NailPolish(String brand, float dryTimeMin) {
        this("Rosewood", "Matte", "LacQ", 10, 249.0, dryTimeMin);
        System.out.println("4th CONSTRUCTOR INVOKED");
    }

    NailPolish(String finish, double price) {
        this("Glamora", 3.0f);
        System.out.println("5th CONSTRUCTOR INVOKED");
        this.finish = finish;
        this.price = price;
    }

    NailPolish(String shade, String finish, String brand, int quantityMl, double price, float dryTimeMin) {
        System.out.println("LAST CONSTRUCTOR (6)");
        this.shade = shade;
        this.finish = finish;
        this.brand = brand;
        this.quantityMl = quantityMl;
        this.price = price;
        this.dryTimeMin = dryTimeMin;
    }

    public void display() {
        System.out.println("SHADE         : " + shade);
        System.out.println("FINISH        : " + finish);
        System.out.println("BRAND         : " + brand);
        System.out.println("QUANTITY (ml) : " + quantityMl);
        System.out.println("PRICE (Rs)    : " + price);
        System.out.println("DRY TIME (m)  : " + dryTimeMin);
        System.out.println("--------------------------------------");
    }

  
}