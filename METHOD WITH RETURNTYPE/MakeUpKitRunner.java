class MakeUpKitRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String brand = MakeUpKit.getBrand();
        System.out.println("BRAND : " + brand);

        int itemCount = MakeUpKit.getItemCount();
        System.out.println("ITEM COUNT : " + itemCount);

        boolean isWaterproof = MakeUpKit.getIsWaterproof();
        System.out.println("IS WATERPROOF : " + isWaterproof);

        double price = MakeUpKit.getPrice();
        System.out.println("PRICE : " + price);

        String theme = MakeUpKit.getColorTheme();
        System.out.println("COLOR THEME : " + theme);

        boolean hasMirror = MakeUpKit.getHasMirror();
        System.out.println("HAS MIRROR : " + hasMirror);

        System.out.println("MAIN ENDED");
    }
}
