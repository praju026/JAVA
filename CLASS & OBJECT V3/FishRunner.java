class FishRunner {

    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        Fish fish1 = new Fish("Salmon","Ray-finned","Pink",3.5f,true,"Rivers");
        // fish1.name = "Salmon";
        // fish1.type = "Ray-finned";
        // fish1.color = "Pink";
        // fish1.weight = 3.5f;
        // fish1.isFreshWater = true;
        // fish1.habitat = "Rivers";
        fish1.getInfo();

        Fish fish2 = new Fish("Tuna","Mackerel","Blue-Silver",40.0f,false,"Ocean");
        // fish2.name = "Tuna";
        // fish2.type = "Mackerel";
        // fish2.color = "Blue-Silver";
        // fish2.weight = 40.0f;
        // fish2.isFreshWater = false;
        // fish2.habitat = "Ocean";
        fish2.getInfo();

        Fish fish3 = new Fish("Goldfish","Carp","Golden",0.3f,true,"Aquarium");
        // fish3.name = "Goldfish";
        // fish3.type = "Carp";
        // fish3.color = "Golden";
        // fish3.weight = 0.3f;
        // fish3.isFreshWater = true;
        // fish3.habitat = "Aquarium";
        fish3.getInfo();

        Fish fish4 = new Fish("Catfish","Siluriformes","Grey",2.5f,true,"Rivers");
        // fish4.name = "Catfish";
        // fish4.type = "Siluriformes";
        // fish4.color = "Grey";
        // fish4.weight = 2.5f;
        // fish4.isFreshWater = true;
        // fish4.habitat = "Rivers";
        fish4.getInfo();

        Fish fish5 = new Fish("Clownfish","Pomacentridae","Orange-White",0.25f,false,"Coral reefs");
        // fish5.name = "Clownfish";
        // fish5.type = "Pomacentridae";
        // fish5.color = "Orange-White";
        // fish5.weight = 0.25f;
        // fish5.isFreshWater = false;
        // fish5.habitat = "Coral reefs";
        fish5.getInfo();

        Fish fish6 = new Fish("Betta","Gourami","Multi-colored",0.1f,true,"Aquarium");
        // fish6.name = "Betta";
        // fish6.type = "Gourami";
        // fish6.color = "Multi-colored";
        // fish6.weight = 0.1f;
        // fish6.isFreshWater = true;
        // fish6.habitat = "Aquarium";
        fish6.getInfo();

        Fish fish7 = new Fish("Shark","Cartilaginous","Grey-White",500.0f,false,"Ocean");
        // fish7.name = "Shark";
        // fish7.type = "Cartilaginous";
        // fish7.color = "Grey-White";
        // fish7.weight = 500.0f;
        // fish7.isFreshWater = false;
        // fish7.habitat = "Ocean";
        fish7.getInfo();

        Fish fish8 = new Fish("Swordfish","Billfish","Blue",100.0f,false,"Sea");
        // fish8.name = "Swordfish";
        // fish8.type = "Billfish";
        // fish8.color = "Blue";
        // fish8.weight = 100.0f;
        // fish8.isFreshWater = false;
        // fish8.habitat = "Sea";
        fish8.getInfo();

        Fish fish9 = new Fish("Piranha","Characiformes","Silver-Red",1.0f,true,"Rivers");
        // fish9.name = "Piranha";
        // fish9.type = "Characiformes";
        // fish9.color = "Silver-Red";
        // fish9.weight = 1.0f;
        // fish9.isFreshWater = true;
        // fish9.habitat = "Rivers";
        fish9.getInfo();

        Fish fish10 = new Fish("Eel","Anguilliformes","Brown",2.0f,true,"Swamps");
        // fish10.name = "Eel";
        // fish10.type = "Anguilliformes";
        // fish10.color = "Brown";
        // fish10.weight = 2.0f;
        // fish10.isFreshWater = true;
        // fish10.habitat = "Swamps";
        fish10.getInfo();

        Fish fish11 = new Fish("Trout","Ray-finned","Spotted",4.0f,true,"Streams");
        // fish11.name = "Trout";
        // fish11.type = "Ray-finned";
        // fish11.color = "Spotted";
        // fish11.weight = 4.0f;
        // fish11.isFreshWater = true;
        // fish11.habitat = "Streams";
        fish11.getInfo();

        Fish fish12 = new Fish("Anchovy","Forage","Silver",0.05f,false,"Sea");
        // fish12.name = "Anchovy";
        // fish12.type = "Forage";
        // fish12.color = "Silver";
        // fish12.weight = 0.05f;
        // fish12.isFreshWater = false;
        // fish12.habitat = "Sea";
        fish12.getInfo();

        Fish fish13 = new Fish("Guppy","Livebearer","Colorful",0.02f,true,"Aquarium");
        // fish13.name = "Guppy";
        // fish13.type = "Livebearer";
        // fish13.color = "Colorful";
        // fish13.weight = 0.02f;
        // fish13.isFreshWater = true;
        // fish13.habitat = "Aquarium";
        fish13.getInfo();

        Fish fish14 = new Fish("Sardine","Herring","Silver",0.1f,false,"Ocean");
        // fish14.name = "Sardine";
        // fish14.type = "Herring";
        // fish14.color = "Silver";
        // fish14.weight = 0.1f;
        // fish14.isFreshWater = false;
        // fish14.habitat = "Ocean";
        fish14.getInfo();

        Fish fish15 = new Fish("Snapper","Lutjanidae","Red",6.0f,false,"Sea");
        // fish15.name = "Snapper";
        // fish15.type = "Lutjanidae";
        // fish15.color = "Red";
        // fish15.weight = 6.0f;
        // fish15.isFreshWater = false;
        // fish15.habitat = "Sea";
        fish15.getInfo();

        Fish fish16 = new Fish("Barracuda","Sphyraenidae","Dark-Grey",7.5f,false,"Tropical Oceans");
        // fish16.name = "Barracuda";
        // fish16.type = "Sphyraenidae";
        // fish16.color = "Dark-Grey";
        // fish16.weight = 7.5f;
        // fish16.isFreshWater = false;
        // fish16.habitat = "Tropical Oceans";
        fish16.getInfo();

        Fish fish17 = new Fish("Herring","Clupeidae","Blue-Silver",0.3f,false,"Ocean");
        // fish17.name = "Herring";
        // fish17.type = "Clupeidae";
        // fish17.color = "Blue-Silver";
        // fish17.weight = 0.3f;
        // fish17.isFreshWater = false;
        // fish17.habitat = "Ocean";
        fish17.getInfo();

        Fish fish18 = new Fish("Stingray","Cartilaginous","Grey",35.0f,false,"Sea beds");
        // fish18.name = "Stingray";
        // fish18.type = "Cartilaginous";
        // fish18.color = "Grey";
        // fish18.weight = 35.0f;
        // fish18.isFreshWater = false;
        // fish18.habitat = "Sea beds";
        fish18.getInfo();

        Fish fish19 = new Fish("Pomfret","Bramidae","Silver",0.75f,false,"Indian Ocean");
        // fish19.name = "Pomfret";
        // fish19.type = "Bramidae";
        // fish19.color = "Silver";
        // fish19.weight = 0.75f;
        // fish19.isFreshWater = false;
        // fish19.habitat = "Indian Ocean";
        fish19.getInfo();

        Fish fish20 = new Fish("Flying Fish","Exocoetidae","Silver-Blue",0.5f,false,"Tropical Ocean");
        // fish20.name = "Flying Fish";
        // fish20.type = "Exocoetidae";
        // fish20.color = "Silver-Blue";
        // fish20.weight = 0.5f;
        // fish20.isFreshWater = false;
        // fish20.habitat = "Tropical Ocean";
        fish20.getInfo();

        System.out.println("MAIN ENDED");
    }
}
