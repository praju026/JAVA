class TyreRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String brand = Tyre.getBrand();
        System.out.println("TYRE BRAND : " + brand);

        int diameter = Tyre.getDiameterInInches();
        System.out.println("DIAMETER (inches) : " + diameter);

        boolean isTubeless = Tyre.getIsTubeless();
        System.out.println("IS TUBELESS : " + isTubeless);

        String suitableFor = Tyre.getSuitableFor();
        System.out.println("SUITABLE FOR : " + suitableFor);

        double price = Tyre.getPrice();
        System.out.println("PRICE : " + price);

        String material = Tyre.getMaterial();
        System.out.println("MATERIAL : " + material);

        System.out.println("MAIN ENDED");
    }
}
