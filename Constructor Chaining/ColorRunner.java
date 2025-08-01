class ColorRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Color c1 = new Color();
        c1.display();
        Color c2 = new Color("Royal Blue");
        c2.display();
        Color c3 = new Color(99.0, "Liquid");
        c3.display();
        Color c4 = new Color("Naturals", "150 g");
        c4.display();
        Color c5 = new Color(4.8f);
        c5.display();
        Color c6 = new Color("Powder");
        c6.display();
        Color c7 = new Color("Marigold Yellow", 179.0, "Powder", "AyurHue", "300 g", 4.9f);
        c7.display();
        System.out.println("Main ended");
    }
}