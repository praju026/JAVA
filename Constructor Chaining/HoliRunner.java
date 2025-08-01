class HoliRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Holi h1 = new Holi();
        h1.display();
        Holi h2 = new Holi("Floral");
        h2.display();
        Holi h3 = new Holi(30.5, "Udaipur");
        h3.display();
        Holi h4 = new Holi(8);
        h4.display();
        Holi h5 = new Holi("2025-03-17", "Indore");
        h5.display();
        Holi h6 = new Holi(60000.0f);
        h6.display();
        Holi h7 = new Holi("Traditional", 55.0, "Pune", "2025-03-21", 15, 75000.0f);
        h7.display();
        System.out.println("Main ended");
    }
}
