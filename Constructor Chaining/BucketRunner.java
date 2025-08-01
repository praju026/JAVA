class BucketRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Bucket b1 = new Bucket();
        b1.display();
        Bucket b2 = new Bucket(18);
        b2.display();
        Bucket b3 = new Bucket(219.0, "Plastic");
        b3.display();
        Bucket b4 = new Bucket("Red");
        b4.display();
        Bucket b5 = new Bucket("SteelCraft", 1.2f);
        b5.display();
        Bucket b6 = new Bucket(349.0, "Stainless Steel", "Silver");
        b6.display();
        Bucket b7 = new Bucket(30, 399.0, "Plastic", "Green", "HydroMax", 0.9f);
        b7.display();
        System.out.println("Main ended");
    }
}
