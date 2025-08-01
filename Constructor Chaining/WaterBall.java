class WaterBall {

    String colorMix;
    double price;
    String material;
    int packCount;
    float diameterCm;
    String tieToolIncluded;

    WaterBall() {
        this("Mixed");
        System.out.println("Default constructor");
    }

    WaterBall(String colorMix) {
        this(199.0, "Latex");
        System.out.println("1st CONSTRUCTOR INVOKED");
        this.colorMix = colorMix;
    }

    WaterBall(double price, String material) {
        this(100);
        System.out.println("2nd CONSTRUCTOR INVOKED");
        this.price = price;
        this.material = material;
    }

    WaterBall(int packCount) {
        this(6.5f, "Yes");
        System.out.println("3rd CONSTRUCTOR INVOKED");
        this.packCount = packCount;
    }

    WaterBall(float diameterCm, String tieToolIncluded) {
        this("Vivid Mix", 149.0, "Latex", 120, diameterCm, tieToolIncluded);
        System.out.println("4th CONSTRUCTOR INVOKED");
    }

    WaterBall(double price, int packCount) {
        this(7.0f, "No");
        System.out.println("5th CONSTRUCTOR INVOKED");
        this.price = price;
        this.packCount = packCount;
    }

    WaterBall(String colorMix, double price, String material, int packCount, float diameterCm, String tieToolIncluded) {
        System.out.println("LAST CONSTRUCTOR (6)");
        this.colorMix = colorMix;
        this.price = price;
        this.material = material;
        this.packCount = packCount;
        this.diameterCm = diameterCm;
        this.tieToolIncluded = tieToolIncluded;
    }

    public void display() {
        System.out.println("COLOR MIX     : " + colorMix);
        System.out.println("PRICE (Rs)    : " + price);
        System.out.println("MATERIAL      : " + material);
        System.out.println("PACK COUNT    : " + packCount);
        System.out.println("DIAMETER (cm) : " + diameterCm);
        System.out.println("TIE TOOL      : " + tieToolIncluded);
        System.out.println("--------------------------------------");
    }
}
