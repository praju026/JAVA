class EggRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Egg e1 = new Egg();
        e1.display();
        Egg e2 = new Egg("Jumbo");
        e2.display();
        Egg e3 = new Egg(84.0, "Brown");
        e3.display();
        Egg e4 = new Egg(24);
        e4.display();
        Egg e5 = new Egg("Sunrise Farm", 60.0f);
        e5.display();
        Egg e6 = new Egg(96.0, "White", 12);
        e6.display();
        Egg e7 = new Egg("Large", 78.0, "Brown", 30, "Prairie Farm", 62.0f);
        e7.display();
        System.out.println("Main ended");
    }
}
