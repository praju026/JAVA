class GunRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Gun g1 = new Gun();
        g1.display();
        Gun g2 = new Gun("ThunderJet");
        g2.display();
        Gun g3 = new Gun("Water", 900);
        g3.display();
        Gun g4 = new Gun(18.0f);
        g4.display();
        Gun g5 = new Gun("Pump", 1099.0);
        g5.display();
        Gun g6 = new Gun(700);
        g6.display();
        Gun g7 = new Gun("AquaStrike", "Water", 1000, 20.0f, "Pump", 1299.0);
        g7.display();
        System.out.println("Main ended");
    }
}
