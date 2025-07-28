class ForestSafariRunner {

    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        ForestSafari safari1 = new ForestSafari("Parambikkulam","Jeep",2500.0f,3,true,"Monsoon");
        safari1.GetInfo();

        ForestSafari safari2 = new ForestSafari("Kaziranga","Elephant Ride",3000.0f,2,true,"Spring");
        safari2.GetInfo();

        ForestSafari safari3 = new ForestSafari("Gir National Park","Open Bus",1800.0f,4,true,"Winter");
        safari3.GetInfo();

        ForestSafari safari4 = new ForestSafari("Ranthambore","Gypsy",2200.0f,3,true,"Autumn");
        safari4.GetInfo();

        ForestSafari safari5 = new ForestSafari("Sundarbans","Boat Safari",3500.0f,5,true,"Winter");
        safari5.GetInfo();

        ForestSafari safari6 = new ForestSafari("Bandhavgarh","Jeep",2000.0f,3,false,"Winter");
        safari6.GetInfo();

        ForestSafari safari7 = new ForestSafari("Periyar Wildlife Sanctuary","Boat",2800.0f,4,true,"Monsoon");
        safari7.GetInfo();

        ForestSafari safari8 = new ForestSafari("Mudumalai","Van",1700.0f,2,true,"Winter");
        safari8.GetInfo();

        ForestSafari safari9 = new ForestSafari("Pench National Park","Jeep",2300.0f,3,false,"Spring");
        safari9.GetInfo();

        ForestSafari safari10 = new ForestSafari("Dudhwa National Park","Gypsy",2100.0f,3,true,"Winter");
        safari10.GetInfo();

        ForestSafari safari11 = new ForestSafari("Nagarhole","Canter",2500.0f,4,true,"Monsoon");
        safari11.GetInfo();

        ForestSafari safari12 = new ForestSafari("Manas National Park","Jeep",3000.0f,3,false,"Winter");
        safari12.GetInfo();

        ForestSafari safari13 = new ForestSafari("Bandipur","Bus",1800.0f,2,true,"Summer");
        safari13.GetInfo();

        ForestSafari safari14 = new ForestSafari("Tadoba","Jeep",2500.0f,3,true,"Winter");
        safari14.GetInfo();

        ForestSafari safari15 = new ForestSafari("Anamalai Tiger Reserve","Van",2000.0f,2,false,"Spring");
        safari15.GetInfo();

        ForestSafari safari16 = new ForestSafari("Buxa Tiger Reserve","Jeep",2700.0f,4,true,"Winter");
        safari16.GetInfo();

        ForestSafari safari17 = new ForestSafari("Kanha","Gypsy",2400.0f,3,true,"Autumn");
        safari17.GetInfo();

        ForestSafari safari18 = new ForestSafari("Valmiki National Park","Jeep",2200.0f,3,true,"Winter");
        safari18.GetInfo();

        ForestSafari safari19 = new ForestSafari("Simlipal","Open Jeep",2000.0f,3,false,"Winter");
        safari19.GetInfo();

        ForestSafari safari20 = new ForestSafari("Jim Corbett","Van",1900.0f,2,true,"Winter");
        safari20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
