class GymEquipmentRunner {

    public static void main(String gym[]) {
        System.out.println("MAIN STARTED");

        GymEquipment equipment1 = new GymEquipment("Treadmill","Cardio","PowerMax",59999.99f,"Steel",80f);
        equipment1.GetInfo();

        GymEquipment equipment2 = new GymEquipment("Dumbbell Set","Strength","Kobo",2999.99f,"Cast Iron",20f);
        equipment2.GetInfo();

        GymEquipment equipment3 = new GymEquipment("Exercise Bike","Cardio","Fitkit",19999.50f,"Steel",60f);
        equipment3.GetInfo();

        GymEquipment equipment4 = new GymEquipment("Barbell Rod","Strength","Afton",2499.75f,"Steel",15f);
        equipment4.GetInfo();

        GymEquipment equipment5 = new GymEquipment("Kettlebell","Strength","Protoner",799.99f,"Cast Iron",10f);
        equipment5.GetInfo();

        GymEquipment equipment6 = new GymEquipment("Rowing Machine","Cardio","Durafit",42999.00f,"Steel",70f);
        equipment6.GetInfo();

        GymEquipment equipment7 = new GymEquipment("Smith Machine","Strength","BodyCraft",74999.50f,"Steel",90f);
        equipment7.GetInfo();

        GymEquipment equipment8 = new GymEquipment("Lat Pulldown Machine","Strength","Powerline",45999.99f,"Steel",100f);
        equipment8.GetInfo();

        GymEquipment equipment9 = new GymEquipment("Chest Press Machine","Strength","Lifeline",53999.75f,"Steel",120f);
        equipment9.GetInfo();

        GymEquipment equipment10 = new GymEquipment("Incline Bench","Strength","Reebok",8999.99f,"Steel & Foam",25f);
        equipment10.GetInfo();

        GymEquipment equipment11 = new GymEquipment("Flat Bench","Strength","Domyos",6999.50f,"Steel & Foam",20f);
        equipment11.GetInfo();

        GymEquipment equipment12 = new GymEquipment("Ab Roller","Core Training","Domyos",999.00f,"Plastic & Steel",2f);
        equipment12.GetInfo();

        GymEquipment equipment13 = new GymEquipment("Resistance Bands","Strength & Flexibility","Boldfit",599.00f,"Latex",1f);
        equipment13.GetInfo();

        GymEquipment equipment14 = new GymEquipment("Pull-up Bar","Strength","Protoner",1999.50f,"Steel",5f);
        equipment14.GetInfo();

        GymEquipment equipment15 = new GymEquipment("Leg Press Machine","Strength","FitKing",89999.00f,"Steel",150f);
        equipment15.GetInfo();

        GymEquipment equipment16 = new GymEquipment("Seated Row Machine","Strength","Impulse",69999.00f,"Steel",110f);
        equipment16.GetInfo();

        GymEquipment equipment17 = new GymEquipment("Cross Trainer","Cardio","Sole Fitness",45999.00f,"Steel",75f);
        equipment17.GetInfo();

        GymEquipment equipment18 = new GymEquipment("Stepper Machine","Cardio","Aerofit",17999.00f,"Steel",30f);
        equipment18.GetInfo();

        GymEquipment equipment19 = new GymEquipment("Punching Bag","Boxing","Everlast",4999.00f,"Synthetic Leather",25f);
        equipment19.GetInfo();

        GymEquipment equipment20 = new GymEquipment("Battle Rope","Functional Training","Aurion",3599.00f,"Poly Dacron",12f);
        equipment20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
