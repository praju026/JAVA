class ClothesRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String brand = Clothes.getBrand();
        System.out.println("CLOTHES BRAND : " + brand);

        String fabric = Clothes.getFabric();
        System.out.println("FABRIC TYPE : " + fabric);

        String color = Clothes.getColor();
        System.out.println("COLOR : " + color);

        String size = Clothes.getSize();
        System.out.println("SIZE : " + size);

        boolean isWashed = Clothes.getIsWashed();
        System.out.println("IS WASHED : " + isWashed);

        double price = Clothes.getPrice();
        System.out.println("PRICE : " + price);

        System.out.println("MAIN ENDED");
    }
}
