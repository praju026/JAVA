class PipeRunner {

    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        Pipe pipe1 = new Pipe("PVC",3.0f,2.5f,"White",250.0f,false);
        pipe1.GetInfo();        

        Pipe pipe2 = new Pipe("Steel",4.5f,3.0f,"Silver",450.0f,false);
        pipe2.GetInfo();

        Pipe pipe3 = new Pipe("Copper",2.0f,1.5f,"Brown",600.0f,false);
        pipe3.GetInfo();

        Pipe pipe4 = new Pipe("Plastic",5.0f,4.0f,"Blue",150.0f,true);
        pipe4.GetInfo();

        Pipe pipe5 = new Pipe("Aluminium",3.5f,2.0f,"Silver",320.0f,false);
        pipe5.GetInfo();

        Pipe pipe6 = new Pipe("HDPE",6.0f,3.5f,"Black",400.0f,true);
        pipe6.GetInfo();

        Pipe pipe7 = new Pipe("Cast Iron",4.0f,2.0f,"Grey",700.0f,false);
        pipe7.GetInfo();

        Pipe pipe8 = new Pipe("Galvanized Steel",3.2f,1.0f,"Silver",500.0f,false);
        pipe8.GetInfo();

        Pipe pipe9 = new Pipe("Rubber",5.0f,1.5f,"Black",200.0f,true);
        pipe9.GetInfo();

        Pipe pipe10 = new Pipe("Brass",2.5f,1.2f,"Golden",800.0f,false);
        pipe10.GetInfo();

        Pipe pipe11 = new Pipe("PVC",7.0f,5.0f,"White",600.0f,false);
        pipe11.GetInfo();

        Pipe pipe12 = new Pipe("Copper",1.5f,0.8f,"Red",900.0f,false);
        pipe12.GetInfo();

        Pipe pipe13 = new Pipe("Plastic",8.0f,4.0f,"Green",350.0f,true);
        pipe13.GetInfo();

        Pipe pipe14 = new Pipe("HDPE",9.0f,3.0f,"Black",450.0f,true);
        pipe14.GetInfo();

        Pipe pipe15 = new Pipe("Cast Iron",2.0f,2.0f,"Black",750.0f,false);
        pipe15.GetInfo();

        Pipe pipe16 = new Pipe("Aluminium",4.0f,2.5f,"Silver",400.0f,false);
        pipe16.GetInfo();

        Pipe pipe17 = new Pipe("Galvanized Steel",6.0f,3.5f,"Grey",650.0f,false);
        pipe17.GetInfo();

        Pipe pipe18 = new Pipe("Rubber",10.0f,2.0f,"Black",300.0f,true);
        pipe18.GetInfo();

        Pipe pipe19 = new Pipe("Brass",1.0f,1.5f,"Golden",1000.0f,false);
        pipe19.GetInfo();

        Pipe pipe20 = new Pipe("Steel",7.5f,4.5f,"Silver",950.0f,false);
        pipe20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
