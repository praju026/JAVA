class GoldRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        double purity = Gold.getPurity();
        System.out.println("GOLD PURITY : " + purity);

        double rate = Gold.getPricePerGram();
        System.out.println("PRICE PER GRAM : " + rate);

        String origin = Gold.getOrigin();
        System.out.println("ORIGIN : " + origin);

        boolean isHallmarked = Gold.getIsHallmarked();
        System.out.println("HALLMARKED : " + isHallmarked);

        String form = Gold.getForm();
        System.out.println("FORM : " + form);

        double weight = Gold.getWeight();
        System.out.println("WEIGHT : " + weight);

        System.out.println("MAIN ENDED");
    }
}
