class WeaponRunner {

    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        Weapon weapon1 = new Weapon("Katana","Melee","Steel",1.2f,15000.0f,"Japan");
        weapon1.GetInfo();

        Weapon weapon2 = new Weapon("Longsword","Melee","High Carbon Steel",1.5f,12000.0f,"Europe");
        weapon2.GetInfo();

        Weapon weapon3 = new Weapon("Crossbow","Ranged","Wood & Steel",2.8f,9000.0f,"China");
        weapon3.GetInfo();

        Weapon weapon4 = new Weapon("Dagger","Melee","Stainless Steel",0.5f,2500.0f,"Italy");
        weapon4.GetInfo();

        Weapon weapon5 = new Weapon("Axe","Melee","Iron & Wood",3.0f,5000.0f,"Viking");
        weapon5.GetInfo();

        Weapon weapon6 = new Weapon("Spear","Melee","Steel Tip & Bamboo",2.2f,3500.0f,"Greece");
        weapon6.GetInfo();

        Weapon weapon7 = new Weapon("Halberd","Melee","Iron",3.8f,11000.0f,"Switzerland");
        weapon7.GetInfo();

        Weapon weapon8 = new Weapon("War Hammer","Melee","Steel Head & Oak Handle",4.5f,13000.0f,"England");
        weapon8.GetInfo();

        Weapon weapon9 = new Weapon("Bow","Ranged","Bamboo & String",1.0f,4000.0f,"India");
        weapon9.GetInfo();

        Weapon weapon10 = new Weapon("Mace","Melee","Bronze",2.7f,8000.0f,"Mesopotamia");
        weapon10.GetInfo();

        Weapon weapon11 = new Weapon("Rapier","Melee","Steel",1.1f,12500.0f,"Spain");
        weapon11.GetInfo();

        Weapon weapon12 = new Weapon("Scimitar","Melee","Damascus Steel",1.4f,14000.0f,"Middle East");
        weapon12.GetInfo();

        Weapon weapon13 = new Weapon("Chakram","Ranged","Steel",0.7f,3000.0f,"India");
        weapon13.GetInfo();

        Weapon weapon14 = new Weapon("Naginata","Melee","Steel & Wood",2.5f,10000.0f,"Japan");
        weapon14.GetInfo();

        Weapon weapon15 = new Weapon("Sai","Melee","Steel",0.9f,4500.0f,"Okinawa");
        weapon15.GetInfo();

        Weapon weapon16 = new Weapon("Kukri","Melee","Steel",0.8f,5500.0f,"Nepal");
        weapon16.GetInfo();

        Weapon weapon17 = new Weapon("Morning Star","Melee","Iron & Chain",3.3f,13500.0f,"Germany");
        weapon17.GetInfo();

        Weapon weapon18 = new Weapon("Throwing Knife","Ranged","Stainless Steel",0.4f,2000.0f,"France");
        weapon18.GetInfo();

        Weapon weapon19 = new Weapon("Tomahawk","Melee","Steel Head & Wooden Handle",1.6f,7000.0f,"Native America");
        weapon19.GetInfo();

        Weapon weapon20 = new Weapon("Flamethrower","Ranged","Steel & Alloy",8.0f,45000.0f,"Germany");
        weapon20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
