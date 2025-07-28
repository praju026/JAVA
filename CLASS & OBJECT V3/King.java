class King {
    String brand;
    String flavor;
    float price;
    int packSize;
    boolean isImported;

    King(String brand,String flavor,float price,int packSize,boolean isImported) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.packSize = packSize;
        this.isImported = isImported;
    }

    void GetInfo() {
        System.out.println("BRAND : " + brand);
        System.out.println("FLAVOR : " + flavor);
        System.out.println("PRICE : " + price);
        System.out.println("PACK SIZE : " + packSize);
        System.out.println("IMPORTED : " + isImported);
        System.out.println("-----------------------");
    }
}
