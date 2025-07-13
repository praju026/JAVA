class GamingPcRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String processor = GamingPc.getProcessor();
        System.out.println("PROCESSOR : " + processor);

        String gpu = GamingPc.getGpu();
        System.out.println("GPU : " + gpu);

        int ram = GamingPc.getRamGB();
        System.out.println("RAM (GB) : " + ram);

        boolean hasRGB = GamingPc.getHasRGB();
        System.out.println("HAS RGB : " + hasRGB);

        double price = GamingPc.getPrice();
        System.out.println("PRICE : " + price);

        String brand = GamingPc.getBrand();
        System.out.println("BRAND : " + brand);

        System.out.println("MAIN ENDED");
    }
}
