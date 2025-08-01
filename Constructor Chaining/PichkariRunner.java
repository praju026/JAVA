class PichkariRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Pichkari p1 = new Pichkari();
        p1.display();
        Pichkari p2 = new Pichkari("JetMax");
        p2.display();
        Pichkari p3 = new Pichkari(799.0, "Plastic");
        p3.display();
        Pichkari p4 = new Pichkari(700);
        p4.display();
        Pichkari p5 = new Pichkari(4, "High");
        p5.display();
        Pichkari p6 = new Pichkari(15.0f);
        p6.display();
        Pichkari p7 = new Pichkari("StormX", 1299.0, "ABS", 800, 3, 18.0f);
        p7.display();
        System.out.println("Main ended");
    }
}
