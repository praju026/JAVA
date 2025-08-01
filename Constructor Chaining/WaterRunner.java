class WaterRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Water w1 = new Water();
        w1.display();
        Water w2 = new Water("Mineral");
        w2.display();
        Water w3 = new Water(1.5f, 7.0f);
        w3.display();
        Water w4 = new Water(32.0, "BlueSpring");
        w4.display();
        Water w5 = new Water(2025, 2, 1); // updated: year, month, day
        w5.display();
        Water w6 = new Water(0.5f);
        w6.display();
        Water w7 = new Water("RO", "AquaGold", 2.0f, 7.4f, 40.0, "2025/1/10");
        w7.display();
        System.out.println("Main ended");
    }
}
