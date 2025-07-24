class GymEquipmentRunner {

    public static void main(String gym[]) {
        System.out.println("MAIN STARTED");

        GymEquipment equipment1 = new GymEquipment();
        equipment1.name = "Treadmill";
        equipment1.type = "Cardio";
        equipment1.brand = "PowerMax";
        equipment1.price = 59999.99f;
        equipment1.material = "Steel";
        equipment1.weight = 80f;
        equipment1.GetInfo();

        GymEquipment equipment2 = new GymEquipment();
        equipment2.name = "Dumbbell Set";
        equipment2.type = "Strength";
        equipment2.brand = "Kobo";
        equipment2.price = 2999.99f;
        equipment2.material = "Cast Iron";
        equipment2.weight = 20f;
        equipment2.GetInfo();

        GymEquipment equipment3 = new GymEquipment();
        equipment3.name = "Exercise Bike";
        equipment3.type = "Cardio";
        equipment3.brand = "Fitkit";
        equipment3.price = 19999.50f;
        equipment3.material = "Steel";
        equipment3.weight = 60f;
        equipment3.GetInfo();

        GymEquipment equipment4 = new GymEquipment();
        equipment4.name = "Barbell Rod";
        equipment4.type = "Strength";
        equipment4.brand = "Afton";
        equipment4.price = 2499.75f;
        equipment4.material = "Steel";
        equipment4.weight = 15f;
        equipment4.GetInfo();

        GymEquipment equipment5 = new GymEquipment();
        equipment5.name = "Kettlebell";
        equipment5.type = "Strength";
        equipment5.brand = "Protoner";
        equipment5.price = 799.99f;
        equipment5.material = "Cast Iron";
        equipment5.weight = 10f;
        equipment5.GetInfo();

        GymEquipment equipment6 = new GymEquipment();
        equipment6.name = "Rowing Machine";
        equipment6.type = "Cardio";
        equipment6.brand = "Durafit";
        equipment6.price = 42999.00f;
        equipment6.material = "Steel";
        equipment6.weight = 70f;
        equipment6.GetInfo();

        GymEquipment equipment7 = new GymEquipment();
        equipment7.name = "Smith Machine";
        equipment7.type = "Strength";
        equipment7.brand = "BodyCraft";
        equipment7.price = 74999.50f;
        equipment7.material = "Steel";
        equipment7.weight = 90f;
        equipment7.GetInfo();

        GymEquipment equipment8 = new GymEquipment();
        equipment8.name = "Lat Pulldown Machine";
        equipment8.type = "Strength";
        equipment8.brand = "Powerline";
        equipment8.price = 45999.99f;
        equipment8.material = "Steel";
        equipment8.weight = 100f;
        equipment8.GetInfo();

        GymEquipment equipment9 = new GymEquipment();
        equipment9.name = "Chest Press Machine";
        equipment9.type = "Strength";
        equipment9.brand = "Lifeline";
        equipment9.price = 53999.75f;
        equipment9.material = "Steel";
        equipment9.weight = 120f;
        equipment9.GetInfo();

        GymEquipment equipment10 = new GymEquipment();
        equipment10.name = "Incline Bench";
        equipment10.type = "Strength";
        equipment10.brand = "Reebok";
        equipment10.price = 8999.99f;
        equipment10.material = "Steel & Foam";
        equipment10.weight = 25f;
        equipment10.GetInfo();

        GymEquipment equipment11 = new GymEquipment();
        equipment11.name = "Flat Bench";
        equipment11.type = "Strength";
        equipment11.brand = "Domyos";
        equipment11.price = 6999.50f;
        equipment11.material = "Steel & Foam";
        equipment11.weight = 20f;
        equipment11.GetInfo();

        GymEquipment equipment12 = new GymEquipment();
        equipment12.name = "Ab Roller";
        equipment12.type = "Core Training";
        equipment12.brand = "Domyos";
        equipment12.price = 999.00f;
        equipment12.material = "Plastic & Steel";
        equipment12.weight = 2f;
        equipment12.GetInfo();

        GymEquipment equipment13 = new GymEquipment();
        equipment13.name = "Resistance Bands";
        equipment13.type = "Strength & Flexibility";
        equipment13.brand = "Boldfit";
        equipment13.price = 599.00f;
        equipment13.material = "Latex";
        equipment13.weight = 1f;
        equipment13.GetInfo();

        GymEquipment equipment14 = new GymEquipment();
        equipment14.name = "Pull-up Bar";
        equipment14.type = "Strength";
        equipment14.brand = "Protoner";
        equipment14.price = 1999.50f;
        equipment14.material = "Steel";
        equipment14.weight = 5f;
        equipment14.GetInfo();

        GymEquipment equipment15 = new GymEquipment();
        equipment15.name = "Leg Press Machine";
        equipment15.type = "Strength";
        equipment15.brand = "FitKing";
        equipment15.price = 89999.00f;
        equipment15.material = "Steel";
        equipment15.weight = 150f;
        equipment15.GetInfo();

        GymEquipment equipment16 = new GymEquipment();
        equipment16.name = "Seated Row Machine";
        equipment16.type = "Strength";
        equipment16.brand = "Impulse";
        equipment16.price = 69999.00f;
        equipment16.material = "Steel";
        equipment16.weight = 110f;
        equipment16.GetInfo();

        GymEquipment equipment17 = new GymEquipment();
        equipment17.name = "Cross Trainer";
        equipment17.type = "Cardio";
        equipment17.brand = "Sole Fitness";
        equipment17.price = 45999.00f;
        equipment17.material = "Steel";
        equipment17.weight = 75f;
        equipment17.GetInfo();

        GymEquipment equipment18 = new GymEquipment();
        equipment18.name = "Stepper Machine";
        equipment18.type = "Cardio";
        equipment18.brand = "Aerofit";
        equipment18.price = 17999.00f;
        equipment18.material = "Steel";
        equipment18.weight = 30f;
        equipment18.GetInfo();

        GymEquipment equipment19 = new GymEquipment();
        equipment19.name = "Punching Bag";
        equipment19.type = "Boxing";
        equipment19.brand = "Everlast";
        equipment19.price = 4999.00f;
        equipment19.material = "Synthetic Leather";
        equipment19.weight = 25f;
        equipment19.GetInfo();

        GymEquipment equipment20 = new GymEquipment();
        equipment20.name = "Battle Rope";
        equipment20.type = "Functional Training";
        equipment20.brand = "Aurion";
        equipment20.price = 3599.00f;
        equipment20.material = "Poly Dacron";
        equipment20.weight = 12f;
        equipment20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
