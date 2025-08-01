class NailPolishRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        NailPolish n1 = new NailPolish();
        n1.display();
        NailPolish n2 = new NailPolish("Ruby");
        n2.display();
        NailPolish n3 = new NailPolish("Glossy", 9);
        n3.display();
        NailPolish n4 = new NailPolish(219.0);
        n4.display();
        NailPolish n5 = new NailPolish("Colorista", 2.0f);
        n5.display();
        NailPolish n6 = new NailPolish("Matte", 239.0);
        n6.display();
        NailPolish n7 = new NailPolish("Peach Nude", "Glossy", "GlowCo", 10, 199.0, 1.8f);
        n7.display();
        System.out.println("Main ended");
    }
}
