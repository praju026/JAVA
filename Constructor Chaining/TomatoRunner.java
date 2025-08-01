class TomatoRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Tomato t1 = new Tomato();
        t1.display();
        Tomato t2 = new Tomato("Cherry");
        t2.display();
        Tomato t3 = new Tomato(30.0, "Maharashtra");
        t3.display();
        Tomato t4 = new Tomato(40);
        t4.display();
        Tomato t5 = new Tomato("A", 95.0f);
        t5.display();
        Tomato t6 = new Tomato(26.5, 48);
        t6.display();
        Tomato t7 = new Tomato("Desi", "Karnataka", 34.0, 52, "AA", 92.5f);
        t7.display();
        System.out.println("Main ended");
    }
}
