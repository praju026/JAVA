class RadioRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String brand = Radio.getBrand();
        System.out.println("RADIO BRAND : " + brand);

        double frequency = Radio.getFrequency();
        System.out.println("RADIO FREQUENCY : " + frequency);

        String type = Radio.getType();
        System.out.println("RADIO TYPE : " + type);

        boolean isPortable = Radio.getIsPortable();
        System.out.println("IS PORTABLE : " + isPortable);

        String color = Radio.getColor();
        System.out.println("RADIO COLOR : " + color);

        System.out.println("MAIN ENDED");
    }
}
