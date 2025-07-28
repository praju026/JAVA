class CrackersRunner {

    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        Crackers cracker1 = new Crackers("Flowerpot Deluxe","Flowerpot","Standard",150.50f,10,true);
        //cracker1.name = "Flowerpot Deluxe";
        //cracker1.type = "Flowerpot";
        //cracker1.brand = "Standard";
        //cracker1.price = 150.50f;
        //cracker1.quantity = 10;
        //cracker1.isEcoFriendly = true;
        cracker1.GetInfo();

        Crackers cracker2 = new Crackers("Sky Rocket","Rocket","Ananda",250.00f,5,false);
        //cracker2.name = "Sky Rocket";
        //cracker2.type = "Rocket";
        //cracker2.brand = "Ananda";
        //cracker2.price = 250.00f;
        //cracker2.quantity = 5;
        //cracker2.isEcoFriendly = false;
        cracker2.GetInfo();

        Crackers cracker3 = new Crackers("Electric Sparkler","Sparkler","Ayyan",100.00f,20,true);
        cracker3.GetInfo();

        Crackers cracker4 = new Crackers("Whistling Rocket","Rocket","Sri Kaliswari",300.00f,6,false);
        cracker4.GetInfo();

        Crackers cracker5 = new Crackers("Green Anar","Flowerpot","Standard",180.75f,8,true);
        cracker5.GetInfo();

        Crackers cracker6 = new Crackers("Color Fountain","Flowerpot","Ayyan",200.00f,10,true);
        cracker6.GetInfo();

        Crackers cracker7 = new Crackers("Ground Spinner","Spinner","Sri Kaliswari",120.00f,15,false);
        cracker7.GetInfo();

        Crackers cracker8 = new Crackers("Magic Pencil","Sparkler","Standard",80.00f,25,true);
        cracker8.GetInfo();

        Crackers cracker9 = new Crackers("Chakri Deluxe","Spinner","Ananda",90.00f,12,false);
        cracker9.GetInfo();

        Crackers cracker10 = new Crackers("Crackling Rocket","Rocket","Ayyan",350.00f,5,false);
        cracker10.GetInfo();

        Crackers cracker11 = new Crackers("Twinkling Star","Sparkler","Standard",70.00f,20,true);
        cracker11.GetInfo();

        Crackers cracker12 = new Crackers("Thunder Bomb","Bomb","Sri Kaliswari",220.00f,10,false);
        cracker12.GetInfo();

        Crackers cracker13 = new Crackers("Colorful Sky Shot","Rocket","Ananda",280.00f,5,false);
        cracker13.GetInfo();

        Crackers cracker14 = new Crackers("Golden Anar","Flowerpot","Standard",190.00f,7,true);
        cracker14.GetInfo();

        Crackers cracker15 = new Crackers("Magic Spinner","Spinner","Ayyan",100.00f,15,true);
        cracker15.GetInfo();

        Crackers cracker16 = new Crackers("Fire Pencil","Sparkler","Standard",85.00f,18,true);
        cracker16.GetInfo();

        Crackers cracker17 = new Crackers("Mini Bomb","Bomb","Sri Kaliswari",150.00f,12,false);
        cracker17.GetInfo();

        Crackers cracker18 = new Crackers("Laser Fountain","Flowerpot","Ananda",220.00f,8,true);
        cracker18.GetInfo();

        Crackers cracker19 = new Crackers("Color Sparkler","Sparkler","Ayyan",95.00f,20,true);
        cracker19.GetInfo();

        Crackers cracker20 = new Crackers("Ultimate Sky Rocket","Rocket","Sri Kaliswari",400.00f,4,false);
        cracker20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
